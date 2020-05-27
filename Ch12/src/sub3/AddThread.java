package sub3;

public class AddThread extends Add implements Runnable{ // Add class에게 상속받는다. implements Runnable : interface인데 이게 뭐니? 무튼 인터페이스니까 추상메서드가 필요해

	private int start;
	private int end;
	
	// 생성자
	public AddThread (int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	@Override // 추상메서드
	public void run() {
		for(int k=start ; k<=end ; k++) {
			setNum(k);
		} // start부터 end까지의 합. setNum method 관찰해봐라.
	}

}
