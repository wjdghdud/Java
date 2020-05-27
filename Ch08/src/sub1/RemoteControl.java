package sub1;

// 내용 : interface

public interface RemoteControl { // class 대신 interface로. 즉 interface라고 하는 구조체라는 의미.
	
	public abstract void powerOn(); // 전원켜기
	public abstract void powerOff(); // 전원끄기
	
	// abstract 선언을 생략할 수가 있다.
	public void chUp(); // 채널 업
	public abstract void chDown(); // 채널 다운
	
	public abstract void soundUp(); // 볼륨 업
	public void soundDown(); // 볼륨 다운
	
}

// 온전한 메서드를 정의할 수 자체가 없음.
