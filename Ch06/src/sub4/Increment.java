package sub4;

// 내용 : 

public class Increment {	

	private int num1;
	private static int num2; // 정적변수(클래스 변수)
	
	// (num1, 2를 초기화하는)변형된(사용자가 정의한) 생성자(옵션)
	public Increment() {
		num1++; // this는 생략가능
		num2++; // this는 생략가능
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}		// 변형(원래 표준 생성자의 form에서 필요에 따라 임의로 변형시킬 수 있음. 하지만 표준형은 무조건 넣어놔야 함.)
	
	// (num1, 2를 초기화하는)해당 클래스 표준 생성자(옵션)
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}		// 표준형(필수적으로 생성자를 만들어주어야 함.)
	
	// 정적 메서드(클래스 메서드)
	public static void add() {	// 이것을 static으로 선언하면
//		num1++;	// num1을 함수 안에 포함할 수 없다. 애초에 static 선언이 되지 않은 변수가
		num2++;	// 우선적으로 생성되어지는 static 메서드 안에 들어가질 수가 없어. 생성이 먼저 되지 않았으니까.
	}			// static은 static끼리만 관계를 이룰 수 있음.
}
