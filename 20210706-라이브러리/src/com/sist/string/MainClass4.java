//450, 468,469(contain, start end equal, indexof, 5������, ���� last length replace split start
// subs value~ üũ�ѰŸ� ����
/*
 *  480 uphand���ڿ������Լ�
 *  489 mathŬ���� - �ø�(�ø��Լ�) random �� 2��
 *  ���ڿ��� ��ȯ - boolean integer double 3���� (����Ŭ���� �� 3���ۿ� ����)
 *  493 ���ڿ�~ �⺻������ �ٲٱ�, �Ľ�int pathboolean, �Ľ�double 3��
 *  
 *  
 */
package com.sist.string;
// substring : ���ڸ� �ڸ� ��쿡 ���
/*
 *   substring => �����ε�
 *   = String substring(int start) ==> ������ ��ġ�κ��� ���������� ������ �´�
 *     "Hello Java"
 *      0123456789 ==> 6 => Java
 *      
 *   = String substring(int start, int end) => �߰��� �ʿ��� ���ڿ��� �ڸ���
 *            => end�� ������ (end-1)
 *     substring(6,9) => Jav
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="0123456789";
		String s=data.substring(5); // 56789
		System.out.println(s);
		s=data.substring(3,7); // 3~6 => -1 => �տ��� ����, �ڿ��� ������ (end-1)
		String[] title= {
				"���� ��� ������ �Ұ�������",
				"�ٽ� ������ ��"
		};
		for(String ss:title){
//			System.out.println(ss);	
			if(ss.length()>8){
				String temp=ss.substring(0,8)+"...";
				System.out.println(temp);
			}
			else {
				System.out.println(ss);
			}
		}
		
	}

}
