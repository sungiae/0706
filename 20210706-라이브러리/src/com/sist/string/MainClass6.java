package com.sist.string;
import javax.swing.*;
public class MainClass6 extends JFrame{
	JTextField tf=new JTextField();
	public MainClass6()
	{
		add("North",tf);
//		tf.setText(100); - 오류
		tf.setText(String.valueOf(100)); // 문자열로 변환
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// 생성자 호출 => 호출
		new MainClass6();
	}

}
