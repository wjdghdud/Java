package sub2;

// 내용 : 다양한  예외처리, 교재 p433.

public class KindOfExceptionTest {
	public static void main(String[] args) {
		
		
		// 배열의 크기에서 벗어난 인덱스값 참조에러
		int arr[] = new int[3]; // 배열 공간만 할당(3개).
		
		for(int i = 0 ; i <= 3 ; i++) { // 배열의 공간은 3개인데 i = 0 ~ 3까지 네 개 이다. 즉 오류.
			
			try {
			arr[i] = (i+1);
			}catch (ArrayIndexOutOfBoundsException e) { // Exception이라는 클래스는 다양한 에러들을 포괄하는 객체이다. 이걸 Array만 치고 컨트롤 스페이스바 ㄱㄱㄱ. 이건 배열 오류캐치하는 코드
				System.out.println("배열의 인덱스값이 없습니다.");
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		
		
		// NullPoint 에러
//		Tiger tiger = new Tiger(); 이렇게 안하고
//		Tiger tiger; // 이렇게 선언만 해도 사실 stack 영역에는 Tiger 객체는 생성 안됐지만 변수 tiger 가 생성됨.

//		Tiger tiger = null; 이거는 그냥 null값인 것을 어차피 아니깐 걍 이렇게 한 거
		
//		tiger.move(); 객체가 생성되지 않았기 때문에 당연히 원래 객체가 가진 메서드는 호출할 수가 없음. 이게 Null값.
//		tiger.hunt();
		
		try {
			Tiger tiger = null;
			
			tiger.move();
			tiger.hunt();
		}catch(NullPointerException e) { // 역시 Null만 치고 컨트롤 스페이스바 ㄱ
			System.out.println("Tiger 객체가 생성되지 않았습니다.");
		}
		
		
		// 캐스팅 에러
		
		try {
		Animal a1 = new Eagle(); // 업캐스팅(다형성)
		Animal a2 = new Shark(); // 업캐스팅(다형성)
		
//		Eagle eagle = (Eagle)a1; // Animal인 a1을 Eagle로 다운캐스팅. 그래서 괄호 안에 Eagle을 기입
		Shark shark = (Shark)a1; // 문법적으로는 허용되는데, 독수리 a1을 Shark 형으로 변환할 수가 없어. 어차피 이거 에러코드야. 따라서 전체적으로 try안에 가두리
		}catch (ClassCastException e) { // 역시 Class만 치고 컨트롤 스페이스바 ㄱ
			System.out.println("캐스팅 연산이 잘못되었습니다.");
		}
		
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료...");
	}
}
