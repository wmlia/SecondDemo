package test01;

import org.testng.annotations.*;

public class testng01{
    //最基本的注解，用来把方法标记未测试的一部分
    @Test
    public void test001(){
        System.out.println("这个是测试的练习1");
    }
    @Test
    public void test002(){
        System.out.println("这个是测试的练习2");
    }

    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("before这个是测试方法之前执行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after这个是测试方法之后执行的");
    }
}
