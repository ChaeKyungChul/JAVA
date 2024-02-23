package sec08;

import java.util.Calendar;

public class EnumClassExam {

	public static void main(String[] args) {
		Week today = null;
		
		
		//컴퓨터에 있는 날짜 요일 시간을 얻으려면 java.util.Calendar 이용
		//java.util.GregorianCalendar 
		//Week today = Week.WENDNEDAY;  // 자바의 열거타입
		//enum(열거타입)은 대문자로 쓴다. 복합단어의 경우 스네이크표기법을 이용 YEAR_MONTH 
		
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);  // 원
		int month = now.get(Calendar.MONTH) +1; // 월
		int day = now.get(Calendar.DAY_OF_MONTH);// 일
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일(1~7)
		int hour = now.get(Calendar.HOUR); // 시간
		int minute = now.get(Calendar.MINUTE);//분
		int second = now.get(Calendar.SECOND);//초
		
		
		switch(week) {
		case 1 : 
			today = Week.SUNDAY;
			break;
		case 2 : 
			today = Week.MONDAY;
			break;
		case 3 : 
			today = Week.TUESDAY;
			break;
		case 4 : 
			today = Week.WENDNEDAY;
			break;
		case 5 : 
			today = Week.THURSDAY;
			break;
		case 6 : 
			today = Week.FRIDAY;
			break;
		case 7 : 
			today = Week.SATURDAY;
			break;
		}
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 봅니다.");
		}else if(today == Week.WENDNEDAY) {
			System.out.println("자바공부를 댑다합니다.");
		}else {
			System.out.println("다른요일에도 자바를 공부합니다.");
		}
	}

}
