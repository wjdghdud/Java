package sub1;

import java.util.Scanner;

// 날짜 : 2020.05.21
// 내용 : 기본 입출력, 교재 p994.

public class BasicIOTest {
	public static void main(String[] args) {
		
		// 입출력의 기본 : stream(데이터 통로. 입력과 출력을 서로 주고받는 매체들 사이의 연결과도 같은 것.)
		
		// 시스템 기본 입력 스트림
		Scanner sc = new Scanner(System.in);	// 키보드 객체
		
		// 시스템 기본 츨력 스트림
		System.out.println("이름 입력 : ");
		
		String name = sc.nextLine();
		
		System.out.println("이름 : "+name);
	}
}
