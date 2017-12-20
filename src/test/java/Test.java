import com.sqm.dao.SomeDao;
import com.sqm.pojo1.Country;
import com.sqm.pojo1.Minister;
import com.sqm.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

/**
 * <p>
 *     测试类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Test {
    private SqlSession session;
    private SomeDao dao;

    @Before
    public void setUp() {
        session = MyBatisUtil.getSession();
        dao = session.getMapper(SomeDao.class);
    }

    @After
    public void tearDown() {
        session.close();
    }

    //通过id查询国家并显示国家信息和部长信息
    @org.junit.Test
    public void test01() {
        int cid = 2;
        Country country = dao.selectCountryById(cid);
        //此处添加断点
        System.out.println(country.getCname());
        System.out.println(country.getMinisters().toString());
    }

    //通过mid查询minister,并显示他的country
    @org.junit.Test
    public void test02() {
        int mid = 3;
        com.sqm.pojo2.Minister minister = dao.selectMinisterById(mid);
        System.out.println(minister.toString());
    }
}
