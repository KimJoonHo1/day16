package day16;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class StopWatch extends Time {
	private boolean flag = true;
	
	public void timeStop(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		JFrame frame = new JFrame("StopWatch");
		Container con = frame.getContentPane();
		
		
		while(flag) {
			frame.setLocation(400, 200);
			frame.setPreferredSize(new Dimension(500, 200));
			frame.pack();
			
			Font font = new Font(null, 0, 32);
			
			JLabel label = new JLabel("0시 0분 0초 사용");
			label.setFont(font);
			label.setHorizontalAlignment(JLabel.CENTER);
			con.add(label);
			
			long start = System.currentTimeMillis();
			
			
			
			frame.setVisible(true);
			while(flag) {
				/*
				long end = System.currentTimeMillis();
				Date date = new Date(end - start);
				
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				String str = sdf.format(date) + sd.format(date);
				*/
		
				long end = System.currentTimeMillis();
				long trim = end - start;
				
				Calendar endDate = Calendar.getInstance();
				endDate.setTimeInMillis(trim);
				endDate.add(Calendar.HOUR, -9);
				
				Date trimDate = endDate.getTime();
				
						
				SimpleDateFormat sdf = new SimpleDateFormat("KK시 mm분 ss초 사용");
				/*
				int hour = end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
				int minute = end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
				int second = end.get(Calendar.SECOND) - start.get(Calendar.SECOND);
				int milli = end.get(Calendar.MILLISECOND) - start.get(Calendar.MILLISECOND);
				 
			
				String str = hour + "시 " + minute + "분 " + second + "초 사용";
			 */
				
				String str = sdf.format(trimDate);
				
				label.setText(str);
				
				
			}
			
			SimpleDateFormat sd = new SimpleDateFormat("a H시mm분ss초");
			Date date = new Date();
			String setStr = sd.format(date);
			label.setText(setStr);
		}
	}

}
