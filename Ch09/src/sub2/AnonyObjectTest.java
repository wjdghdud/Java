package sub2;

// 내용 : 익명객체, 교재 p404. 

public class AnonyObjectTest {
	public static void main(String[] args) {
		
		
		// 익명 객체 - 인터페이스를 클래스 구현없이 바로 new연산으로 객체를 생성하는 것
		Person p = new Person() { // Ctrl + space bar 하면 오버라이드 정의 전부 끝.
			
			@Override
			public void info() {
				System.out.println("Person info...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		
		p.info();
		p.hello();
		
		// 인터페이스로 만든 stack 영역의 p가 가리키는 객체는 있을거임. 다만 interface는 heap영역의 데이터가 아니기 떄문에
		// p가 가리키는 클래스는 익명이라는 것.
	}
}
