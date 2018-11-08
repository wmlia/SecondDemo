package groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("这个是GroupsOnClass33中方法teacher11执行");
    }
    public void teacher2(){
        System.out.println("这个是GroupsOnClass33中方法student22执行");
    }
}
