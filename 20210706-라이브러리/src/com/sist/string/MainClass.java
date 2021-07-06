package com.sist.string;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *     5) 문자열 결합
 *     +
 *     concat() ... => 문자열 결합 (+) "Hello" + "Java" = "HelloJava" => 7+"7" =77
 *    =======================================
 *    
 *    ******** 문자열은 번호가 0부터 시작 (오라클은 1번부터 시작)
 *    "Hello Java"
 *     0123456789 => char[]={'H','e',...,};
 *    ******** String에서 지원하는 모든 메소드는 인스턴스 메소드다 (제외 : static으로 된 메소드 => valeuOf())
 *             String.valueOf() => 유일하게 가능 (나머지는 s.~~~)	
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals : 문자열 비교
		String s1="Hello";
		String s2="Hello";
		// s1과 s2는 주소값이 동일 하다 => 문자열 자체가 주소를 가지고 있다
		String s3=new String("Hello"); // Hello주소가 아닌 새로운 주소에 저장한다
		
		if(s1==s2) 
			System.out.println("s1과 s2는 동일한 주소를 가지고 있다");
		else
			System.out.println("s1과 s2는 다른 주소를 가지고 있다");
		
		// == 실제값 비교(기본데이터형, 주소값)
		if(s1==s3) 
			System.out.println("s1과 s3는 동일한 주소를 가지고 있다");
		else
			System.out.println("s1과 s3는 다른 주소를 가지고 있다");
		
		// 실제 메모리에 저장되어 있는 문자열 비교 => equals
		// public boolean equals(String s)
		// 대소문자 구분 : equals / 구분 없음 : equalsIgnoreCase
		// 검색어 : equalsIgnoreCass
		// 비밀번호 : equals
		if(s1.equals(s3)) // 저장된 문자 자체만 비교
			System.out.println("s1에 저장된 데이터와 s3에 저장된 데이터가 같다");
		else
			System.out.println("s1에 저장된 데이터와 s3에 저장된 데이터가 다르다");
			
	}

}
