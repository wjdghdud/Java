package sub6;

// 내용 : Abstract class의 추상클래스

public abstract class Unit { // 'abstract'를 기입하여 추상클래스임을 표시해줌. 원랜  public class Unit {}임.
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상메서드
	public abstract void attack();
}
