package com;

import cn.demo.service1.FeignApplication;
import cn.demo.service1.controller.Service1Controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhongkun on 2017/11/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FeignApplication.class)
public class HelloServiceTest {
    @Resource
    private Service1Controller service1Controller;

    @Test
    public void testGetName() {
        System.out.println(service1Controller.test(123123));
    }
}
