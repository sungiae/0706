package com.sist.string;
import javax.swing.*;
public class MainClass6 extends JFrame{
	JTextField tf=new JTextField();
	public MainClass6()
	{
		add("North",tf);
//		tf.setText(100); - ����
		tf.setText(String.valueOf(100)); // ���ڿ��� ��ȯ
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// ������ ȣ�� => ȣ��
		new MainClass6();
	}

}
