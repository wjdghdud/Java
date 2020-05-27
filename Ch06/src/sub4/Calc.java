package sub4;

public class Calc {
	
	// 싱글톤 객체
	private static Calc instance = new Calc();// 클래스 멤버가 자기 자신이다. 임과 동시에 자기의 객체를 생성하면서 static
	
	// 생성자
	private Calc() {
		
	} // 생성자를 private 선언하면 new를 통한 heap영역으로의 새로은 객체의 생성을 못함.
	
	// getter
	public static Calc getInstance() {
		return instance;
	}
	
	// method
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
