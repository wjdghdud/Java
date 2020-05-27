package sub2;

// 내용 : String 클래스 실습하기, 교재 p496.

/*
----- String 클래스 -----
	- 문자열을 저장하는 데이터 타입
	- 문자열 저장을 배열과 같은 구조를 갖는다.
	- 문자열 비교는 equals 메서드를 호출한다.
*/

public class StringTest {
	public static void main(String[] args) {
	
		// 문자열 = 문자 = 배열.
		String str = "Hello"; // 약식의 문자열 선언
		char[] arr = {'H', 'e', 'l', 'l', 'o'}; // 문자를 저장하는 Data type.
			// 데이터 타입은 stock 영역에, String의 객체는 heap 영역에 저장.
		
		// 문자열 객체생성
		String str1 = new String("Hello"); // 정석의 문자열 선언
		String str2 = new String("Hello"); // 정석의 문자열 선언
		String str3 = "Hello"; // literal 생성
		String str4 = "Hello"; // literal 생성
		
		// 정석의 문자열  생성. new 선언이 들어가기 때문에 무조건 새로 만들어진(to heap) 문자열.
		if(str1 == str2) { // str1의 참조값(주소값)과 str2의 참조값을 비교한다. 이들은 "Hello"라는 문자열을 가리킨다. 하지만 주소값은 당연히 다르다.
			System.out.println("str1과 str2의 참조값(주소값)이 같다.");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다.");
		} // 증명
		
		
		// literal 생성 String
		if(str3 == str4) { // 그러나 객체생성하듯이 하는 것과는 다른 평소에 사용하던 선언방식을 사용하면 주소값은 같다.
			System.out.println("str3과 str4의 참조값(주소값)이 같다.");
		}else {
			System.out.println("str3과 str4의 참조값(주소값)이 다르다.");
		}
		
		if(str == str4) {
			System.out.println("str과 str4의 참조값(주소값)이 같다.");
		}else {
			System.out.println("str과 str4의 참조값(주소값)이 다르다.");
		}
		
		// 문자열 비교(by .equals(). 문자열 비교 메서드(내장 클래스의 내장 메서드))
		if(str1.equals(str3)) { // 위에서 만든 문자열 모두 넣어봐. 다 같다고 함.
			System.out.println("str1과 str3의 문자열 값이 같다.");
		}else {
			System.out.println("str1과 str3의 문자열 값이 다르다.");
		}
	}
}
