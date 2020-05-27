package sub4;

// 내용 : 수학 클래스 실습, 교재 p533

public class MathTest {
	public static void main(String[] args) {
		
//		math m = new Math(); // Math라는 기본적인 자바제공 클래스인데, 이게 객체선언이 안되는 이유가 싱클톤(singleton) 객체라서 그렇슴.
		
		// 기본적인 것
		System.out.println("PI값 : "+ Math.PI);
		System.out.println("절대값 : "+ Math.abs(-5));
		System.out.println("절대값 : "+ Math.abs(-3.14));
		System.out.println("제곱근 : "+ Math.sqrt(9)); // square root
		System.out.println("올림값 : "+ Math.ceil(1.2));
		System.out.println("올림값 : "+ Math.ceil(1.8));
		System.out.println("내림값 : "+ Math.floor(1.2));
		System.out.println("내림값 : "+ Math.floor(1.8));
		System.out.println("반올림값 : "+ Math.round(1.2));
		System.out.println("반올림값 : "+ Math.round(1.8));
		
		// random
		double num1 = Math.random(); // double이 리턴되는 렌덤 math 메서드. 0 ~ 1까지.
		System.out.println("num1 : "+num1); // 0 ~ 1 사이의 임의의 실수.
		
		double num2 = num1 * 77; // 0 ~ 77 사이의 임의의 실수
		System.out.println("num2 = num1 * 10 : "+num2);
		
		double num3 = Math.ceil(num2); // 1 ~ 77 사이의 정수.
		System.out.println("num3 : "+num3);
		
		double lotto = Math.ceil(Math.random()*45);
		System.out.println("lotto : "+lotto);
	}
}
