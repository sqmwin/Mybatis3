package newslaber;

import com.sqm.newslabel.dao.NewsLabelDao;
import com.sqm.newslabel.pojo.NewsLabel1;
import com.sqm.newslabel.pojo.NewsLabel2;
import com.sqm.selectcourse.pojo.Student;
import com.sqm.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class NewsLabelTest {
    private SqlSession session;
    private NewsLabelDao dao;

    @Before
    public void setUp() {
        session = MyBatisUtil.getSession();
        dao = session.getMapper(NewsLabelDao.class);
    }

    @After
    public void tearDown() {
        session.close();
    }


    //给出父栏目id,查询所有子孙栏目
    @Test
    public void test01() {
        int pid = 2;
        List<NewsLabel1> newsLabel1s = dao.selectChildrenByParentId(pid);
        for (NewsLabel1 newsLabel1 : newsLabel1s) {
            System.out.println(newsLabel1.toString());
        }
    }

    //给出栏目id,查询符合此id的栏目及其所有子孙栏目
    @Test
    public void test02() {
        int id = 2;
        List<NewsLabel1> newsLabel1s = dao.selectNewsLabelById(id);
        for (NewsLabel1 newsLabel1 : newsLabel1s) {
            System.out.println(newsLabel1.toString());
        }
    }

    //给出pid,查询所有id为此pid的栏目,递归查询
    @Test
    public void test03() {
        int pid = 9;
        List<NewsLabel2> newsLabel2s = dao.selectParentByParentId(pid);
        for (NewsLabel2 newsLabel2 : newsLabel2s) {
            System.out.println(newsLabel2.toString());
        }
    }

}
