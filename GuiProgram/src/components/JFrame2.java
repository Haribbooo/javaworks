package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame2 {

	public static void main(String[] args) {
		// 프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		//제목 표시줄
		frame.setTitle("처음 만드는 윈도우");  
		frame.setSize(300,200);    // 300px 넓이 , 200px- 높이
		frame.setLocation(200,100);//x좌표 -200 , y좌표-100
		frame.setLayout(null);
		
		//레이블 (글자 출 력 ) 	
		JLabel label = new JLabel("HI JAVA");	
		label.setSize(80 ,30);
		label.setLocation(100,40);
		frame.add(label);
		
		//버튼 생성
		JButton btn = new JButton("확인");
		btn.setSize(70,30);
		btn.setLocation(100,80);
		frame.add(btn);
		
		//배치
		
		//윈도우 종료 (닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 디스플레이
		frame.setVisible(true);
	}

}
