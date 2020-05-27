package sub4;

// 날짜 : 2020.05.11
// 내용 : 클래스변수(정적변수), 클래스메서드(정적메서드) 실습하기(교재 p236).

/*
	메모리구조는 stack, heap, Method Area의 세 가지로 구성됨.
	오늘은 Method Area에 대한 내용을 다룸.
*/
public class StaticTest {
	public static void main(String[] args) {
		
		// ● StaticTest, Increment class에 한하는 내용.
		// 메모리 고정할당영역(Method Area)에 이미 Increment의 add() 메서드가
		// 정의되어 있기 때문에 객체 생성없이 바로 static 메서드의 호출이 가능.
		// 고찰 : Method Area 영역(static 영역)의 변수나 메서드는 가장 빠른 순서로 생성되기 때문이겠지 아마?
		Increment.add(); // Increment class의 add함수 실행
		
		Increment inc1 = new Increment();	// Increment의 객체를 선언함. 이때 Increment의 변형된 생성자로 호출한 것임.
		Increment inc2 = new Increment();	// 복습할 것 : 코드 자체를 이해해야 함. inc를 선언하고 주소를 전달하면서 함수를 실행?????
		Increment inc3 = new Increment();	// 여기까지 만 하고 출력하면 num1, 2가 전부 1(num2에 static keyword 넣기 전).
											// int형 변수의 기본 값 : 0. 그래서 num1은 ++연산에 의해 1.
		
		/* ---------- note ----------
		static keyword를 추가하게 되면 각각 객체의 멤버로 생성되는 것이 아닌
		고정적인 단 하나의 변수로 취급되게 된다. static 변수는 가장 먼저 생성되면서 가장 나중에 소멸함.
		
		생성의 순서 : static Test class(현재 class. 사실 main 함수는 애초에 static 선언), Increment class의 num2(static),
		Increment class의 static void add() 메서드, inc1, inc1 class Increment, inc2, inc2 class Increment, 
		inc3, inc3 class Increment의 순서 garbage collector에 의해 소멸되는 순서는 역순. 여기까지 내용은 Calc class 제외하고임.
		*/
		
		
		// ● Calc class 내용
		// 싱글톤 객체 생성
//		Calc c = new Calc();	// 이미 Calc class의 객체가 생성돼 있기 때문에 new를 할 필요가 없어.
								// new를 쓰게 되면 heap 영역에 메모리가 또 다시 할당되기 때문임(new 선언은 원래 heap영역).
								// 그렇다면 이미 Method Area에 생성된 Calc를  참조하면 됨. 그냥 얻어오면(get을 통해) 된다는 것.
								// new라는 것을 못쓰게 하는 방법은 생성자를 private선언함으로써 가능함.
		
		// 싱글톤 객체 얻어오기
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c2.multi(2, 3);
		int r4 = c2.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
	}
}



























