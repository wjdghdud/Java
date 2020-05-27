package sub2;

// 내용 : 제네릭 클래스, 교재 p654.

public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		System.out.println("tv : "+tv);
		System.out.println("phone : "+phone);
		
//		Product<A, B> p1 = new Product<A, B>(item, info);				// 뒤의 제네릭은 닫아줘도 됨. 심지어 <> 기호도 빼줘도 상관 없음.
//		Product<TV, int> p1 = new Product(item, info);					// 제네릭은 객체만 취급하기 때문에 int와 같은 치환변수를 둘 수 없다.
		Product<TV, Integer> p1 = new Product<>(tv, 100);				// 그래서 int의 객체형인 Integer로 선언해준다.
		Product<SmartPhone, String> p2 = new Product(phone, "Galaxy s20");	// String은 객체인거 알제?

		p1.show();
		p2.show();
	}
}
