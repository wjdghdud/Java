package sub5;

import java.text.SimpleDateFormat; //SimpleDateFormat + 컨트롤 + 스페이스바
import java.util.Date; // date 쓰고 컨트롤 + 스페이스바, util 선택

// Date class, 교재 p538.

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date(); // date 적고 컨트롤 + 스페이스바 하면 , java.sql과 util이 있는데, util로 select.
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : "+now);
	}
}
