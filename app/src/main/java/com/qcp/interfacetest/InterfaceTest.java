package com.qcp.interfacetest;

import java.util.Random;

/**
 * Created by Administrator on 2015/11/4.
 */
public class InterfaceTest {


    public void setTest(Test test) {
        this.test = test;
    }

    Test test;

    public interface Test {

        void success();
        void error();

    }

    public void fun() {
        int a;
        Random random=new Random();
        //random.nextInt(n) 随机生成0~n-1的整数
        a=random.nextInt(2);
        if (a == 1) {
            test.success();
        } else {
            test.error();
        }
    }
}
