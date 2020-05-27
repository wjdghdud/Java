package sub1;

// 내용 : 내용 : 자바 오버로드 메서드(함수) 실습하기

public class MethodOverloadTest {
	public static void main(String[] args) {

		int r1 = add(1);
		System.out.println("r1 : "+r1);

		int r2 = add(4, 2);
		System.out.println("r2 : "+r2);

		String r3 = add("홍길동");
		System.out.println("r3 : "+r3);


	}// main함수 end

	// 오버로드 메서드 
	//  - 함수명이 같지만 매개변수의 갯수와 타입으로 구분하는 메서드

	public static int add(int a) {
		return ++ a; // a 뒤에 ++; 를 기입하면 원하는 +1의 형태를 얻을 수 없음.
	}

	public static int add(int a, int b) {
		return a+b;
	}

	public static String add(String name) {
		return name+"님 반갑습니다.";
	}
}

