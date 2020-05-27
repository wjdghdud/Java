package sub3;

public class Cable implements Socket { // 소켓이 달려 있는 케이블

	private Bulb bulb; // 전구
	
	public Cable(Bulb bulb) { // 전구를 꼽는 동작
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

}
