package org.koushik.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
	
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		System.out.println("testing");
		//shape = (Shape) context.getBean("triangle");
		//shape.draw();
		
	}
}
