package com.example.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CoreApplicationTests {

    @Test
    public void contextLoads() {
        try {
            PathMatchingResourcePatternResolver pr=new PathMatchingResourcePatternResolver();
            String resource="classpath:mapper/**/*Mapper.xml";
            System.out.println(pr.getResources(resource).length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

