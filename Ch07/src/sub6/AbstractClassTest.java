package sub6;

// 내용 : 추상클래스 실습하기, 교재 p329.

// 목표 : 객체의 틀을 잡아주는 클래스 전에, 더 추상적인 클래스를 사용한다. 조금 더 통일성이 있는 구조로 만들기 위해 사용되어지는 추상클래스.
//      추상클래스의 상속을 받아 구체적인 클래스를 만듦.

/*
--------- 추상클래스 ---------

 - 클래스에 추상메서드가 선언된 클래스
 - 추상클래스를 상속받아 통일성있는 구조를 갖는 클래스를 정의
 - 추상클래스를 상속받는 자식클래스의 타입선언은 다형성을 적용
 
 사실 추상클래스는 interface(Ch08내용)보다  활용도면에서 많이 밀린다.
*/

public class AbstractClassTest {
	public static void main(String[] args) {
		
//		Unit unit = new Unit // 추상클래스는 객체생성 불가능.
		
		Marine u1 = new Marine();
		Zergling u2 = new Zergling();
		Zealot u3 = new Zealot();
		
		u1.move();
		u1.attack();
		
		
		u2.move();
		u2.attack();
		
		
		u3.move();
		u3.attack();
		
	}
}
