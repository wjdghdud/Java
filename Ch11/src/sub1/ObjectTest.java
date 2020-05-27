package sub1;

// 날짜 : 2020.05.18
// 내용 : Object 클래스 실습하기, 교재 p457.

/*
 ----- Object 클래스 -----
	- 자바의 최상위 클래스
	- 모든 클래스의 부모 클래스로 다형성 적용에 활용된다.


*/

public class ObjectTest {
	public static void main(String[] args) {

		
		// 이거 안됨. 밑에 이유 있음.
//		Apple a1 = new Apple("한국", 3000);
//		Object a2 = new Apple("일본", 2000); // 부모가 Object이기 때문에 
//		Banana b1 = new Banana("대만", 2500);
//		Object b2 = new Banana("중국", 1500); // 부모가 Object이기 떄문에
		
		
		
		// 다형성에 활용되는 Object 클래스
		Apple obj1 = new Apple("한국", 3000);
		Object obj2 = new Apple("일본", 2000); // 부모가 Object이기 때문에 
		Banana obj3 = new Banana("대만", 2500);
		Object obj4 = new Banana("중국", 1500); // 부모가 Object이기 떄문에
		
		// 이건 Apple에 재정의한 toString 메서드. 이것을 재정의하면 다운캐스팅의 필요가 없다. 
		obj1.toString();
		obj2.toString();
		
		
//		a1.info();
//		b1.info();
		
		/*
		Object 클래스르 상속받는 하위 클래스와 그 멤버 메서드가 있다. 또 그 부모클래스를 참조하는 참조변수의 실제 참조 범위는 Object이다.
		따라서 Object에 하위 클래스의 멤버 메서드(현재는 info)가 있다면 그것을 참조할 수가 없다. 이미 만들어진 자바에서 제공되는 Object 클래스(내장 클래스)에는
		내가 정의한 info 메서드가 없다는 말이야. 그래서 나온 게 Casting.
		*/
		
		// 다운캐스팅
		Apple a1 = (Apple) obj1; // Down Casting
		Banana b3 = (Banana) obj3;
		
		a1.info();
		b3.info();
		
		Object fruit[] = {obj1, obj2, obj3, obj4}; // Object 클래스를 사용하는 방법(다형성을 이용).
		
		// 이게 뭐하는건데?? 아무튼 출력 얻을려고 하는건가보다.
		Apple a2 = (Apple) fruit[1];
		Banana b4 = (Banana) fruit[3];
		
		a2.info();
		b4.info();
	}
}
		
		
		
