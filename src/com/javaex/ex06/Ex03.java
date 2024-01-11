package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int a=3;
		
		Integer i=new Integer(3);
		System.out.println(i.toString());
		
		Integer sum= new Integer(3)+new Integer(3);
		System.out.println(sum.toString());

		Integer v01=3;
		System.out.println(v01.toString());
		
		int v02=i;
		System.out.println(v02);  //자동 언박싱
		
		/*Integer r01=100;
		int result=r01.parseInt("1234567");  //문자열을 숫자로 변경
		System.out.println(result+r01);*/
		
		int result=Integer.parseInt("12345");
		System.out.println(result+3);
		
		String str="안녕하세요";
		String result02=str.valueOf(555);
		System.out.println(result02 + 2);
		
		
	}

}
