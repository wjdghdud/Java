package sub3;

// 내용 : 예외 떠넘기기, 교재 p440

public class ThrowsTest {
	public static void main(String[] args) throws Exception{ // div에서 메인으로 던진(throws) 에러처리, 그걸 다시 또 메인에서 JVM으로 던져(throws).
		
		// 싱글톤 객체 얻어오기
//		Calc c = new Calc(); // 이거 안됨
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(1, 2);
//		int r4 = c.div(4, 0or1or음의정수);
					// 이게 사실 안되니까 Calc class의 div메서드에서 try~catch를 사용해도 되는데 throws를 써. 그러면 c.div(x, y) 부분 밑에 빨간 줄이 뜨고 마우스커서 올린 다음  surround with try/catch가 있음.
					// 그거 눌러도 되긴 하는데, div 메서드에서 throws를 써서 main 메서드로 보내(main 메서드에서 호출하니까). 근데 그걸 메인메서드가 또 JVM으로 던짐(throws). 그리고 div 메서드에 if문 작성했다.
					// 또는 마우스커서 올린 상태에서 첫 번 째 꺼 누르면 자동적으로 main 메서드에  throws Exception이 자동 생성됨.
		
		// 에러가 발생할 throws가 선언된 메서드를 호출하는 쪽에서는 예외처리(try-catch)를 해야 함.
		// 또는 다시 throws 선언으로 main을 호출하는 자바 JVM으로 예외를 던짐.
		int r4 = c.div(4, 1);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("프로그램 종료...");
	}
}
