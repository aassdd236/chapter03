package com.javaex.ex03;

import java.util.Objects;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result;
		
		Point p=(Point)obj;
		if(this.x==p.x && this.y==p.y) {
			result=true;
		}else {
			result=false;
		}
		
		return result;
	}
	
	
}
