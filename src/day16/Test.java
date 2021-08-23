package day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar bofore = Calendar.getInstance();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar after = Calendar.getInstance();
		int milliSecond = after.get(Calendar.SECOND) - bofore.get(Calendar.SECOND);;
		System.out.println(milliSecond);
	}

}
