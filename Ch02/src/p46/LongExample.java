package p46;

/*
 - note -
수치가 큰데이터를 다루는 프로그램에서는 long 타입이 필수적으로 사용된다.
*/


public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; // 컴파일 에러. int type의 저장 범위를 넘어서는 정수 리터럴에 'L'을 붙이지 않았기 때문에 error.
		long var4 = 1000000000000L;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var4 : " + var4);
	}
}
