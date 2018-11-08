package test01;

import org.testng.annotations.*;

public class TestNg01 {
    //最基本的注解，用来把方法标记未测试的一部分
    @Test
    public void test001() {
        System.out.println("这个是测试的练习1");
    }

    @Test
    public void test002() {
        System.out.println("这个是测试的练习2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before这个是测试方法之前执行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after这个是测试方法之后执行的");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass这个是before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass 这个是afterClass");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("这个是BeforeSuite");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("这个是afterSuite");
    }
}
