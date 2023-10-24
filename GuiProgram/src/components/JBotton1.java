package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JBotton1 {

	public static void main(String[] args) {
			// 
		
		JFrame frame = new JFrame("레이아웃 해제");
		frame.setSize(250,120);
		frame.setLocation(200,100);
		
		
		//버튼 
		JButton btn1 = new JButton("북");
		JButton btn2 = new JButton("남");
		JButton btn3 = new JButton("동");
		JButton btn4 = new JButton("서");
		JButton btn5 = new JButton("중앙");
		
		frame.add(btn1 , BorderLayout.NORTH);	
		frame.add(btn2 , BorderLayout.SOUTH);	
		frame.add(btn3 , BorderLayout.EAST);
		frame.add(btn4 , BorderLayout.WEST);
	    frame.add(btn5 , BorderLayout.CENTER);
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
