package selectcourse;

import com.sqm.selectcourse.dao.StudentDao;
import com.sqm.selectcourse.pojo.Student;
import com.sqm.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class SelectCourseTest {
    private SqlSession session;
    private StudentDao dao;

    @Before
    public void setUp() {
        session = MyBatisUtil.getSession();
        dao = session.getMapper(StudentDao.class);
    }

    @After
    public void tearDown() {
        session.close();
    }

    //给出sid查找学生且同时返回学生选择的课程
    @Test
    public void test01() {
        int sid = 1;
        Student student = dao.selectStudentBySid(sid);
        System.out.println(student.toString());
    }

    //证明一级缓存存在,在同一个SqlSession中查询多次相同数据第二次开始会直接从缓存中读取数据
    @Test
    public void test02() {
        int sid = 1;
        //第一次查询
        Student student = dao.selectStudentBySid(sid);
        System.out.println(student.toString());
        //第二次查询
        Student student2 = dao.selectStudentBySid(sid);
        System.out.println(student2.toString());
    }

    //证明缓存读取数据的依据是sql的id,即缓存为HashMap格式,key为sql的id数据,value为sql的查询数据
    @Test
    public void test03() {
        int sid = 1;
        //第一次查询
        Student student = dao.selectStudentBySid(sid);
        System.out.println(student.toString());
        //第二次查询
        Student student2 = dao.selectStudentBySid2(sid);
        System.out.println(student2.toString());
    }

    //证明增删改操作会清除一级缓存
    @Test
    public void test04() {
        int sid = 3;
        //第一次查询
        Student student = dao.selectStudentBySid(sid);
        System.out.println(student.toString());

        //Student insert = new Student();
        //insert.setSname("zhangsan");
        //dao.insertStudent(insert);
        //dao.deleteStudentById(sid);
        dao.updateStudent(student);

        //第二次查询
        Student student2 = dao.selectStudentBySid(sid);
        System.out.println(student2.toString());
    }

    //证明二级缓存的存在
    @Test
    public void test05() {
        int sid = 3;
        //第一次查询
        Student student = dao.selectStudentBySid(sid);
        System.out.println(student.toString());

        session.close();

        session = MyBatisUtil.getSession();
        dao = session.getMapper(StudentDao.class);
        //第二次查询
        Student student2 = dao.selectStudentBySid(sid);
        System.out.println(student2.toString());
    }

    //查看系统默认临时文件目录
    @Test
    public void test06() {
        String path = System.getProperty("java.io.tmpdir");
        System.out.println(path);
    }

    //注解测试
    @Test
    public void test07() {
        int sid = 3;
        Student student = dao.selectStudentBySidByAnnotation(sid);
        System.out.println(student);
    }
}
