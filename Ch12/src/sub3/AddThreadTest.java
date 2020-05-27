package sub3;

// 내용 : 교재 p576

public class AddThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
/*
		at1.start();
		at2.start();	// 인터페이스로 구현한 것이기 때문에 완벽한 쓰레드가 아니야. 그래서 여기에서 쓰레드객체를 생성해야 해.
*/
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2); // 쓰레드 객체 생성
		
		//run : 단일 스레드
//		t1.run();
//		t2.run();
		
		//start : 멀티 스레드
		t1.start();
		t2.start(); // start로 하면 안됩니다. sub2의 내용과 마찬가지로 join을 추가해주어야 합니다. 멀티스레드거든요 throws는 당연히 빨간밑줄 뜨면 커서올려서 해결하시구여
		
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		int total = tot1 + tot2;
		
		System.out.println("전체 합 : " +total); // 이렇게 하면 안나와.
		
	}
}
