package sec01;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateExam {

	public static void main(String[] args) {
		
		Date now = new Date();
		String snow = now.toString();
		System.out.println(snow);
		
		SimpleDateFormat ssnow = new SimpleDateFormat("yyyy-MM.dd HH:mm:ss");
		String snow2 = ssnow.format(now);
		System.out.println(snow2);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH); //일
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY : strWeek = " 월"; break;
		case Calendar.TUESDAY : strWeek = " 월"; break;
		case Calendar.WEDNESDAY : strWeek = " 월"; break;
		case Calendar.THURSDAY : strWeek = " 월"; break;
		case Calendar.FRIDAY : strWeek = " 월"; break;
		case Calendar.SATURDAY : strWeek = " 월"; break;
		case Calendar.SUNDAY : strWeek = " 월"; break;
		}
		
		
		
		System.out.println(year + "-" + month + "-" + day + "(" + strWeek + ")");

	}

}
