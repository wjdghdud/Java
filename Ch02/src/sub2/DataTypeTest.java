package sub2;

// 내용 : 변수의 자료형

public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형. 위에서 아래로 크기가 커짐. 
		byte var1 = 1; // maximum : 127. 1bite = 8bit. 즉 2^7 = 128.
		short var2 = 2;
		int var3 = 3;
		long var4 = 4;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		
		// 실수형. 역시 위에서 아래로 크기가 커짐.
		float var5 = 1.123456789f; // 마지막에 f(정리사) 붙여주어야 함. 소숫점뒤로 7번쨰 자리까지만 출력, 그 뒤에서 반올림함.
		double var6 = 1.123456789; // 마지막에 f를 안붙여줘도 됨. 16자리까지 출력
		
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		
		// bool(true of false, 논리)형. boolean
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		
		
		
		// 문자형. 
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		
		// 문자열(단어).
		String str1 = "Apple";
		String str2 = "박수오";
		String str3 = "이태훈"; // 쌍 따옴표(")를 사용해야 함.
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);		
		
	}	
}
