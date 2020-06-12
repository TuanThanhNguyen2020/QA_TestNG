import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after the Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will excute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @Test
    void test3(){
        System.out.println("This is test 3 ...");
    }

    @Test
    void test4(){
        System.out.println("This is test 4...");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after the Test Suite");
    }
}
