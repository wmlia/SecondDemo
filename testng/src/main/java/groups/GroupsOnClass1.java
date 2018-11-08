package groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    public void student1(){
        System.out.println("这个是GroupsOnClass1中方法student1111执行");
    }
    public void student2(){
        System.out.println("这个是GroupsOnClass1中方法student2222执行");
    }
}
