package l18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {

    @Before
    public void before(){
        System.out.println("每次运行之前都要运行的内容");
    }

    @Test
    public void test1(){
        System.out.println("这是一个测试方法");
    }

    @After
    public void after(){
        System.out.println("每次运行之后都要运行的内容");
    }


}
