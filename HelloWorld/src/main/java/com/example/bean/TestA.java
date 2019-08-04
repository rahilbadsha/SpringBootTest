package com.example.bean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class TestA {
	@Autowired
	private TestB testb;

	public void setTestb(TestB testb) {
		this.testb = testb;
	}
	public TestA() {
		System.out.println("Signleton Instance created");
	}
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TestB getTestb() {
		System.out.println(String.valueOf(LocalTime.now()));
		System.out.println("Executing from TestA");
		return testb;
	}

}
