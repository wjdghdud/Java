package sub1;

// ���� : class LG

public class RemoteLG implements RemoteControl { // Ch07�� ���� ���� ���۸�ó�� extends�� �ϴ� �ƶ��� �����ϰ� implements ����

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
