package sub2;

public class CountThread extends Thread{

	private Count count; // Count 객체 생성.
	
	// 생성자
	public CountThread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=1000 ; i++) {	// 1000번 반복
			count.setNum();				// 계속해서 더해지는(Count class 참고) setter로부터 얻는 값
		}
	}	// SubThread가 실행하는 메서드
}
