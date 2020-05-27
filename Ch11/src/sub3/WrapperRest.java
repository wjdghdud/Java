package sub3;

// 내용 : Wrapper 클래스 실습하기, 교재 p527. 
// 뒤에 배울 collection에서 활용되는 내용.

// stack 영역의 기본변수를 wrapper 클래스로 wrapping함. 즉 객체로 만든다는 의미이다.

public class WrapperRest {
	public static void main(String[] args) {
		
		// 기본변수. 기본 type의 변수. stack에 저장됨.
		int var1 = 1;
		double var2 = 1.1;
		boolean var3 = true;
		char var4 = 'A';
		
		// wrapper 클래스. 기본타입 변수를 객체로 포장해준다.
		Integer w1 = new Integer(var1);
		Double w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		Character w4 = new Character(var4);
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		// 문자열 -> 기본타입 변환(아까(valueOf)의 반대). 이것은 wrapper 클래스를 활용한다.
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "false";
		
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);

		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
		// 문자열 -> Wrapper 변환.
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper -> 문자열 변환
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}
}
