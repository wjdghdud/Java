package sub2;

// 내용 : 스트링 멤버 실습.

public class StringMemberTest {
	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
	// 주요 멤버 메서드 7가지.
		// length - 문자열의 길이(문자 갯수)
		System.out.println("str 문자열 길이(space 포함) : "+str.length());
		
		// charAt - 문자열의 N+1번째 문자(배열의 첫 번째 원소는 0이기 때문에 N+1.) 추출
		System.out.println("str의 6번째 문자 : "+str.charAt(6));
		
		// substring - 문자열 자르기
		System.out.println("str의 0번에서 5번까지의 문자열 : "+str.substring(0, 5));
		System.out.println("str의 6번에서 마지막까지의 문자열 : "+str.substring(6));
		
		// indexOf, lastIndexOf. 왼쪽(0)부터 찾기, 오른쪽(마지막 원소)부터 찾기. 문자열에서 문자 인덱스번호 추출
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("문자열 str에서 앞에서부터의 문자, e의 인덱스값 : "+idx1);
		System.out.println("문자열 str에서 뒤에서부터의 문자, e의 인덱스값 : "+idx2);
		
		// replace - 문자열 교체
		String newstr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newstr);
				
		// valueOf - 일반타입 변수의 String으로의  data type 변환
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1); // 숫자 1을 문자열 1로 바꿈. int형을 String으로. 
		String s2 = String.valueOf(var2); // 실수 2.13을 문자열 2.13으로 바꿈. double형을 String으로
		String s3 = "" + var3; // 논리형 true를 문자열 true로 바꿈. boolean형을 String으로. 간단하게 이렇게도 표현 가능
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
	}
}