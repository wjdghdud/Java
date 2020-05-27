package sub1;

import sub1.Outer.Inner;

// 날짜 : 2020.05.14
// 내용 : 중첩클래스, 교재 p390. 클래스 안에 클래스가 있다.

public class InnerTest {
	public static void main(String[] args) {
		
		// Outer의 객체할당 방식은 그냥 똑같음.
		Outer out = new Outer(10);
		out.info();
		
		/* 하지만 Outer(외부) 클래스의 Inner(내부) 클래스는 객체할당 방식이 다르다.
		Inner inner = new Inner(20);
		inner.info();
		*/
		
		// Inner(내부)클래스의 객체할당
		Inner inner = out.new Inner(20); // 이런식으로 외부클래스의 참조를 필요로 한다.
		inner.info();
	}
}
