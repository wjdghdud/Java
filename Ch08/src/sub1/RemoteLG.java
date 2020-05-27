package sub1;

// 내용 : class LG

public class RemoteLG implements RemoteControl { // Ch07의 마린 질럿 저글링처럼 extends를 하는 맥락과 유사하게 implements 선언

	@Override
	public void powerOn() {
		System.out.println("LG powerON...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("LG chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("LG sountDown...");
	} 

}
