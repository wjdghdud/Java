package sub1;

public class SubThread extends Thread{ // thread를 상속받음
	
	private String name;
	
	// 생성자
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override // run 치고 컨트롤 + 스페이스바. 스레드에 정의된 런 메서드를 씀
	public void run() {
		
		for(int i=1 ; i<=10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	// 무조건 try catch 밖에 안됨. 왜냐하면 Thread의 상속을 받는 현재의 클래스는 오버라이드되는 run 메서드의 형태를 바꾸어 throws 
				// 선언을 하게 되면 오버라이드 메서드가 아니게 되기 때문이다. 참고로 throws선언을 하고싶다면 바로 지금 있는 run 메서드에 throws 선언을 해야 한다.
			System.out.println(name+"쓰레드 실행...");
		}
		System.out.println(name+"쓰레드 종료...");
	}
}
