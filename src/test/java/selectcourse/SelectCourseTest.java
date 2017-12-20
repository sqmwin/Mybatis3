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

}
