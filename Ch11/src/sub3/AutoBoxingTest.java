package sub3;

// AutoBoxing, AutoUnboxing 실습, 교재 p527.

public class AutoBoxingTest {
	public static void main(String[] args) {
		
		// Auto-Boxing
//		int var1 = 1; // 기본 데이터 1을 var1 변수에 저장. 그냥 평범한 데이터 저장형식
		Integer var1 = 1; // auto boxing이 이러함.
		Double var2 = 2.13;
		Boolean var3 = true;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		
		// Auto-Unboxing
		int value1 = var1;
		double value2 = var2;
		boolean value3 = var3;
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
	}
}
