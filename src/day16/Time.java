package day16;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Time extends Thread {
	private boolean flag = true;
	
	Time() {
		// flag = true;
	}
	
	public void timeStop(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		JFrame frame = new JFrame("Timer");
		Container con = frame.getContentPane();
		while(flag) {
			frame.setLocation(400, 200);
			frame.setPreferredSize(new Dimension(500, 200));
			frame.pack();
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("a H시mm분ss초");
			String str = sdf.format(date);
			
			JLabel label = new JLabel(str);
			label.setHorizontalAlignment(JLabel.CENTER); 
			con.add(label);
			
			Font font = new Font(null, 0, 32); // 글꼴, 효과, 크기
			label.setFont(font); // 폰트 적용
			
			frame.setVisible(true);
			while(flag) {
				date = new Date();
				str = sdf.format(date);
				label.setText(str);
			}
			
		}
		frame.setVisible(false);
		
		
	}
}
