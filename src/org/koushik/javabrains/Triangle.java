package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements Shape, ApplicationContextAware, BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle, PointA:" + pointA.toString() + ", PointB:" + pointB.toString() + ", PointC:" + pointC.toString());
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName);		
	}

	public void myInit(){
		System.out.println("My Init method");
	}
	
	public void cleanUp(){
		System.out.println("My Clean up method");
	}
}
