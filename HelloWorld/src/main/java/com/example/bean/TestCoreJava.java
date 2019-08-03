package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myclass")
public class TestCoreJava {
	
	private static SomeThing someThing;

    @Autowired
    public void setSomeThing(SomeThing someThing){
    	TestCoreJava.someThing = someThing;
    }
}
