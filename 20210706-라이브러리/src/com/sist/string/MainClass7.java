package com.sist.string;
// String.format() => printf
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=3;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		// ������ �޾Ƽ� ���ڿ��� ���� �� �� � ����
		// ��¥��ȯ (2021-07-06), �ݾ� (100,000,000) � ���
		String res=String.format("%d*%d=%d",a,b,a*b);
		System.out.println(res);
		String color="red,blue,black,yellow,pink,green";
		// , ���� ������
		String[] colors=color.split(",");
		
		String ss=String.join("-", colors); // ex. ���ų�¥ => �ѹ��� ��� ����
		System.out.println(ss);
		
		/*
		for(String c:colors) {
			System.out.print(c+"-");
		}
		*/
	}

}
