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
 *     5) ���ڿ� ����
 *     +
 *     concat() ... => ���ڿ� ���� (+) "Hello" + "Java" = "HelloJava" => 7+"7" =77
 *    =======================================
 *    
 *    ******** ���ڿ��� ��ȣ�� 0���� ���� (����Ŭ�� 1������ ����)
 *    "Hello Java"
 *     0123456789 => char[]={'H','e',...,};
 *    ******** String���� �����ϴ� ��� �޼ҵ�� �ν��Ͻ� �޼ҵ�� (���� : static���� �� �޼ҵ� => valeuOf())
 *             String.valueOf() => �����ϰ� ���� (�������� s.~~~)	
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals : ���ڿ� ��
		String s1="Hello";
		String s2="Hello";
		// s1�� s2�� �ּҰ��� ���� �ϴ� => ���ڿ� ��ü�� �ּҸ� ������ �ִ�
		String s3=new String("Hello"); // Hello�ּҰ� �ƴ� ���ο� �ּҿ� �����Ѵ�
		
		if(s1==s2) 
			System.out.println("s1�� s2�� ������ �ּҸ� ������ �ִ�");
		else
			System.out.println("s1�� s2�� �ٸ� �ּҸ� ������ �ִ�");
		
		// == ������ ��(�⺻��������, �ּҰ�)
		if(s1==s3) 
			System.out.println("s1�� s3�� ������ �ּҸ� ������ �ִ�");
		else
			System.out.println("s1�� s3�� �ٸ� �ּҸ� ������ �ִ�");
		
		// ���� �޸𸮿� ����Ǿ� �ִ� ���ڿ� �� => equals
		// public boolean equals(String s)
		// ��ҹ��� ���� : equals / ���� ���� : equalsIgnoreCase
		// �˻��� : equalsIgnoreCass
		// ��й�ȣ : equals
		if(s1.equals(s3)) // ����� ���� ��ü�� ��
			System.out.println("s1�� ����� �����Ϳ� s3�� ����� �����Ͱ� ����");
		else
			System.out.println("s1�� ����� �����Ϳ� s3�� ����� �����Ͱ� �ٸ���");
			
	}

}
