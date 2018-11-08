package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups="server")
    public void groupsServer01(){
        System.out.println("这是服务器测试方法11111");
    }
    @Test(groups = "server")
    public void groupsServer02(){
        System.out.println("这是服务器测试方法22222");
    }
    @Test(groups = "client")
    public void groupsClient01(){
        System.out.println("这是客户端测试方法33333");
    }
    @Test(groups = "client")
    public void groupsClient02(){
        System.out.println("这是客户端测试方法44444");
    }
    @BeforeGroups("server")
    public void beforeServerGroupsTest(){
        System.out.println("这个是服务器端前测试方法");
    }

    @AfterGroups("server")
    public void afterServerGroupsTest(){
        System.out.println("这个是服务器端后测试方法");
    }

    @BeforeGroups("client")
    public void beforeClientGroupsTest(){
        System.out.println("这个是客户端前测试方法");
    }

    @AfterGroups("client")
    public void afterClientGroupsTest(){
        System.out.println("这个是客户端后测试方法");
    }
}
