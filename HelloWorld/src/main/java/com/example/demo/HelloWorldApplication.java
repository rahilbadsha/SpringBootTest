package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.bean.BeanProvider;
import com.example.bean.TestA;
import com.example.bean.TestB;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx1=SpringApplication.run(HelloWorldApplication.class, args);
		AnnotationConfigApplicationContext ctx 
	      = new AnnotationConfigApplicationContext(BeanProvider.class);
		TestA testa=ctx.getBean(TestA.class);
		TestB testb=testa.getTestb();
		System.out.println("Caling another time...");
		TestA testa1=ctx.getBean(TestA.class);
		TestB testb1=testa1.getTestb();
		System.out.println("is it the same::- )"+testb.equals(testb1));
		System.out.println(testb==testb1);
		System.out.println(testa==testa1);

	}

}
