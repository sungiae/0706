package com.sist.string;
/*
 *   replace : ��ȯ
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
		// ��ȯ�� ���ڿ� �ޱ�
		String s=data.replace('l', 'k');
		System.out.println(s);
		s=data.replace("Java", "Kotlin"); // ���ڿ� ��ü ���� - �����ε�
		System.out.println(s);
		int rank=(int)(Math.random()*500)+1;
		String data2=rank+"���� ��� ������ �Ұ�������";
//		System.out.println(data2);
		// ��� - �뷡���� �и�
		String num=data2.replaceAll("[^0-9]", ""); // ���ڸ� �����ϰ� �������� ����
		String title=data2.replaceAll("[^��-�R]", "");
		System.out.println("Rank:"+num);
		System.out.println("Title:"+title);
		
		// trim() => �¿��� ������ ���� : ����� �Է°� => ȸ������, �α���, ���̵�üũ, ��й�ȣ... => ����Ŭ�� ����
		String data3=" Hello Java ";
		System.out.println("���� ���� �� ���� : "+data3.length());
		System.out.println(data3);
		String s2=data3.trim(); //trim - �¿��� ���� ���� => but. �߰��� �ִ� ������ ���� �� �� ����
		System.out.println("���� ���� �� ���� : "+s2.length());
		System.out.println(s2);
		
		// valueOf() ���ڿ��� ����
		// valueOf() => static => String.valueOf()
		// String.valueOf(true) => "true"
		// String.valueOf(10.5) => "10.5"
		// ��� ���������� ���ڿ��� ��ȯ ==> ������, �� (����Ŭ)
	}

}
