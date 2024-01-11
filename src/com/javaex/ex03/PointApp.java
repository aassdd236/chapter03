package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00=new Point(3, 5);
		Point p01=new Point(3, 5);
		Point p02=new Point(13, 15);
		Point p03=p02;
		
		System.out.println(p00.equals(p01)); //값이 같으면 true, 아니면 false
		System.out.println(p00==p01); //주소 비교 => 주소가 같으면 true, 아니면 false(값이 같아도 주소가 다르면 false)
		
		System.out.println(p01.equals(p02)); //논리 비교
		System.out.println(p03.equals(p02)); //논리 비교
	}

}
