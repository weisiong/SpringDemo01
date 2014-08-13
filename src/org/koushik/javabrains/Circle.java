package org.koushik.javabrains;

import javax.annotation.Resource;


public class Circle implements Shape {
	
    private Point point;
    private double radius;
	public Point getPoint() {
		return point;
	}
	
	@Resource(name="pointC")
	public void setPoint(Point point) {
		this.point = point;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle, Center Point:" + point.toString() + ", Radius:" + radius);
	}

}
