package com.rawatdivyanshu.SpringDependencyInjectionExample;

import com.rawatdivyanshu.SpringDependencyInjectionExample.Controllers.ConstructorInjectedController;
import com.rawatdivyanshu.SpringDependencyInjectionExample.Controllers.MyController;
import com.rawatdivyanshu.SpringDependencyInjectionExample.Controllers.PropertyInjectedController;
import com.rawatdivyanshu.SpringDependencyInjectionExample.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionExampleApplication.class, args);

		System.out.println("---------------MyController");

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("---------------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
