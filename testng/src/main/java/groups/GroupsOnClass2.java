package groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {
    public void student1(){
        System.out.println("这个是GroupsOnClass2222中方法student1执行");
    }
    public void student2(){
        System.out.println("这个是GroupsOnClass2222中方法student1执行");
    }
}
