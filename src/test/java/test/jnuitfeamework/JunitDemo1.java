package test.jnuitfeamework;

import com.unitedcoder.SingletonDesign.DashboardPage;
import org.junit.*;
import org.junit.rules.TestName;

public class JunitDemo1 {

    @BeforeClass
    public  static  void setup(){
        System.out.println("Before class only runs once");
    }
    @Rule
    public TestName name=new TestName();
    @Before
    public  void beforeEveryTest(){
        System.out.println("Runs before every Test!");
    }
    @Test
    public  void test1(){
        System.out.println("Square Root Test");
        Assert.assertFalse(Math.sqrt(64)==7);
        System.out.println(name.getMethodName()+"started and passed");
    }

    @Test
    public  void test2(){
        System.out.println("Compare two string  Test");
}
    @Test
    public  void test3(){
        System.out.println("Comper two number  Test");
    }
    @Ignore
    @Test
    public void login(){
        System.out.println(name.getMethodName()+"started");
        DashboardPage dashboardPage=new DashboardPage();
        Assert.assertTrue(dashboardPage.verifyLogin());
    }
    @After
    public  void end(){
        System.out.println("runs after every tets!!");
    }
    @AfterClass
    public  static void tearDwn(){
        System.out.println("runs only once after class!!");
    }
}


