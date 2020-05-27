package sub1;

// 내용 : 예외처리, 교재 p422.

// 예외적인 일, 오류 등의 이벤트가 발생해도 그냥 끝내버리게

public class ExeptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0; // 나눗셈 연산이 불가능함. 그럼에도 무시하고 건너 뛸 수 있는 방법은 예외처리(try)를 통해 가능하다.
		
		
		int r1, r2, r3, r4 = 0;
		
		try {
			// 에러가 발생할 가능성이 있는 코드로직이 들어가는 곳.
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
			
		}catch (Exception e) {	// 에러 내용이 출력되는 코드
			// 에러가 발생했을 때 처리할 로직.
			e.printStackTrace();
		}
		
		
		/* r4를 선언하지 않았을 때 try 안에서 선언을 하며, 그 바깥에서의 sysout r4가 불가능.
		
		try {
			
		int r4 = num1 / num2;
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		이렇게도 해봐라 그냥 뭔 말인지 알거야.
		*/
		
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		
		
		System.out.println("프로그램 종료...");
	}
}
