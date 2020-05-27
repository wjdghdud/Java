package sub1;

// 날짜 : 2020.05.20
// 내용 : 제네릭, 교재 p654.
/*
	----- 제네릭 -----
클래스의 범용성을 위해 사용되는 문법.
컬랙션에서 이용되는데 컬랙션 클래스는 전부 제네릭 클래스다.
*/
public class GenericTest {
	public static void main(String[] args) {
	
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("대만", 2000);
		
//		FruitBox box = new FruitBox();
//		box.setFruit(b);	// Banana를 취급할 수 없음.		
//		box.setFruit(a);	// 사과만 취급이 가능한 FruitBox. Banana는 취급하지 못함. 왜냐 하면 FruitBox는 아예 멤버로 Apple만 선언된 상태.
							// 그래서 Object로 선언해준다.
		
		FruitBox<Apple> appleBox = new FruitBox<>();	// 그래서 이렇게 치환변수 자리에 Apple을 취하면
		appleBox.setFruit(a);							// box에 apple을 담을 수 있음
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		
		a.show();
		b.show();
	}
}
