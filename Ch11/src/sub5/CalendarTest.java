package sub5;

import java.util.Calendar; // Calendar 치고 컨트롤 + 스페이스바

// 내용 : Calendar 클래스 실습하기, 교재 p538.

public class CalendarTest {
	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); 싱글톤 객체라서 이렇게 heap할다을 못해.
		Calendar cal = Calendar.getInstance(); // 싱글톤 객체(Ch06-sub4) 참고
		
		int year = cal.get(Calendar.YEAR); // 이게 필드라고 하는 것이래.
		int month = cal.get(Calendar.MONTH)+1; // 1월이 0이니까 +1.
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
	}
}
