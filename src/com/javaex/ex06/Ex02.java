package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {

		String a=new String("abcd");
		String b=new String(",efg");

		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		
		a=a.concat(b); //a+b
		System.out.println(a);
		
		a=a.trim(); //공백 지움
		System.out.println(a);
		
		a=a.replace("ab", "12"); //a에서 ab를 12로 변환
		System.out.println(a);
		
		
		System.out.println("--------------");
		
		String[] sArray=a.split(","); // 배열에 저장
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);
		
		System.out.println("--------------");
		String str="Hello Java";
		System.out.println(str.substring(3)); //왼쪽에서부터 n개를 자름
		System.out.println(str.substring(1, 7)); //1부터 7사이 나옴(1~6?)
		
		char result03=str.charAt(8);
		System.out.println(result03);
		
		System.out.println(str.toString());
		
		System.out.println("--------------");
		
		String s01=new String("안녕");
		String s02=new String("안녕");
		
		if(s01==s02) {
			System.out.println("주소 같음");
		}else {
			System.out.println("주소 다름");
		}
		
		if(s01.equals(s02)) {
			System.out.println("글자 같음");
		}else {
			System.out.println("글자 다름");
		}
		
		String s03="안녕";
		if("안녕".equals(s03)) { //s03.equals("안녕") > s03이 null일 경우 오류가 뜸
			System.out.println("출력");
		}
	}

}
