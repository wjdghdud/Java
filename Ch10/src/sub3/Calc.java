package sub3;

public class Calc {

	
	// 싱글톤 객체
	private static Calc instance = new Calc(); // instance 이거 선언방식 메커니즘 다시 공부해라. Ch06 sub4 내용이다. instance가 아닌 object도 가능.
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
		// 여기까지 싱글톤객체 관련 코드래. 공부해라
	
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	
	// div 메서드는 에러가 발생할 수 있다는 가능성을 throws 선언을 통해 호출하는 쪽에 알림
	public int div(int x, int y) throws Exception { // 이전의 sub1에서 하던 방식대로 할 수는 있는데 전체적인 틀은 유지하고싶어. 그래서 메서드를 호출하는 쪽에서 처리를 하는 방법(throws)으로 해소 가능해.
													// 복수형이니까 throw's'. 3 개의 에러건. if문 내 2개, 0값 포함 본문 1개.
		// 에러가 발생할 때 메서드를 호출하는 쪽으로 에러를 던진다.
		if(y < 0) {
			Exception e = new Exception("y는 양수여야 합니다.");
			throw e;
		}else if(y == 1) {
			Exception e = new Exception("y는 1이 되면 안됩니다.");
			throw e;
		}
		
		int z = x / y;					
		return z;
	}
	
	
	
}
