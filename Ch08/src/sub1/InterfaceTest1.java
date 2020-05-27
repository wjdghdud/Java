package sub1;

// 내용 : 인터페이스 실습하기

/* ----- note -----
 
 완벽한 메서드를 가질 수 있는 추상클래스가 있는데 이것보다 더욱 추상적으로
 선언'만' 할 수 있는 메서드를 가져야 하는 인터페이스가 있다. 즉 온전한 메서드를 정의할 수 없음.

*/

public class InterfaceTest1 {
	public static void main(String[] args) {
		
		// 인터페이스의 역할 : 클래스 설계의 표준 가이드 역할
		
//		RemoteLG lg = new RemoteLG();
		RemoteControl lg = new RemoteLG(); // 다형성 적용
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
//		RemoteSamsung samsung = new RemoteSamsung();
		RemoteControl samsung = new RemoteSamsung(); 
		// 사실상 다형성을 적용해서 interface로 구현한건데 이게, 사실 큰 차이는 없이 interface로 메서드를 실행하는 것과 class로 메서드를 실행하는 차이가 있어. interface는 참조영역이 되어
		// 그 안의 메서드가 실행이 되지만 오버라이드(RemoteControl이 RemoteSamung에 의해 오버라이드) 되어 실제로 실행되는 메서드는 해당 클래스이다. 그럼에도 불구하고 이러는 이유는 그냥 가독성을 위한 통일화
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
	}
}
