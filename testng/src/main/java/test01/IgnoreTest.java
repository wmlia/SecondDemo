package test01;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignoreTest01(){
        System.out.println("这个是第一个ignore默认不失效测试");
    }

    @Test(enabled = false)
    public void ignoreTest02(){
        System.out.println("这个是第二个ignore真正失效的测试");
    }
    @Test(enabled = true)
    public void ignoreTest03(){
        System.out.println("这个是第三个ignore手动不失效的测试");
    }
}
