package sub1;

// 외부클래스
public class Outer {
	private int x;
	
	// 생성자
	public Outer(int x) {
		this.x = x;
	}
	
	public void info() {
		System.out.println("Outer x : " + x);
	}
	
	// 내부클래스
	public class Inner { //Outer 클래스 안에 Inner 클래스. 즉, 내부클래스.
		
		private int x;
		
		//생성자
		public Inner(int x) {
			this.x = x;
		}
		
		public void info() {
			System.out.println("Inner x : " + x);
		}
	}
}
