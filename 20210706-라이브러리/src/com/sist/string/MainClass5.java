package com.sist.string;
/*
 *   replace : 변환
 *     String s="Hello"
 *     s.replace('l', 'k');  => Hekko
 *               old  new
 *   replaceAll
 *   trim
 *   valueOf
 *   length
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Hello Java";
		// 변환된 문자열 받기
		String s=data.replace('l', 'k');
		System.out.println(s);
		s=data.replace("Java", "Kotlin"); // 문자열 전체 변경 - 오버로딩
		System.out.println(s);
		int rank=(int)(Math.random()*500)+1;
		String data2=rank+"좋은 사람 있으면 소개시켜줘";
//		System.out.println(data2);
		// 등수 - 노래제목 분리
		String num=data2.replaceAll("[^0-9]", ""); // 숫자를 제외하고 나머지는 공백
		String title=data2.replaceAll("[^가-힣]", "");
		System.out.println("Rank:"+num);
		System.out.println("Title:"+title);
		
		// trim() => 좌우의 공백을 제거 : 사용자 입력값 => 회원가입, 로그인, 아이디체크, 비밀번호... => 오라클에 저장
		String data3=" Hello Java ";
		System.out.println("공백 제거 전 길이 : "+data3.length());
		System.out.println(data3);
		String s2=data3.trim(); //trim - 좌우의 공백 제거 => but. 중간에 있는 공백은 제거 할 수 없다
		System.out.println("공백 제거 후 길이 : "+s2.length());
		System.out.println(s2);
		
		// valueOf() 문자열로 변경
		// valueOf() => static => String.valueOf()
		// String.valueOf(true) => "true"
		// String.valueOf(10.5) => "10.5"
		// 모든 데이터형을 문자열로 변환 ==> 윈도우, 웹 (오라클)
	}

}
