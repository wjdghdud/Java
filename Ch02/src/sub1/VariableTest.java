package sub1;

// 내용 : 자바 변수

/*
 * 변수 : 데이터를 저장하는 메모리 공간 
 */
public class VariableTest {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;

		int num3 = num1 + num2;
		
		System.out.println("num3 : "+num3); // HDD의 Java program이 RAM에 num1, 2를 전달, CPU에서 연산 후 다시 RAM에 num3 전달. 프로그램이 끝나면( } ), 메모리 제거.
	}
	
}