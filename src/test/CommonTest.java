import com.zero.dao.TestMapper;
import com.zero.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-db.xml"})
public class CommonTest {

    @Autowired
    private TestService testService;

    @Autowired
    private TestMapper testMapper;

    @Test
    public void TestMain() {
        System.out.println("UPDATE TEST");
        System.out.println("Test : "+testService);
        testService.save(new com.zero.pojo.Test());
    }

    @Test
    public void testMapper() {
        System.out.println(testMapper);
    }
}
