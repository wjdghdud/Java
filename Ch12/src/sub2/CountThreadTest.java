package sub2;

// 내용 : 쓰레드 활용, 교재 p576.

public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);

		// 평범한 단일스레드 동작
//		ct1.run();
//		ct2.run();		
//		ct3.run();
		
		
/*
		ct1.start();
		ct2.start();
		ct3.start();	// run 전체를 주석처리하고 이거 start만 딱 해봐. 출력값이 시도할 때 마다 다 다른데, start method가 가동되는동안인데 그거랑은 
						// ㅈ도 상관없이 바로 결과값을 내버리는거야. 멀티스레드이기 때문이거든.main thread는 ㅈ도 신경안써. 그냥 흐름에 따라 내려가는거고 
						// 세 개의 멀티 start 스레드는 그냥 일을하고는 있는거야. main thread가 마지막 결과값 출력하기 전에 이녀석들이 다 동작이 끝나기까지 기다리는 동작은,
						// 개별적인 스레드가 모든 동작이 끝나고 합류(join)시키는 방법이 있다.
*/
		

		ct1.start();
		ct2.start();
		ct3.start();

		// 메인쓰레드에서 파생된 서브스레드의 작업이 완료된 후, 다시 메인쓰레드로 합류되는 것을 실행.
		ct1.join(); // 빨간 밑줄뜰텐데 거기에 커서올려서 throws선언 시키든가 트라이-캐치 쓰든가 하셈. 근데 이래도 안되기는 함. 
		ct2.join();	// 아무래도 동시에(병행)실행이 되다 보니까 이게 좀 많이 그래. 동작 자체는 Count 객체의 num이 계속 ++되는건데
		ct3.join();	// 여기서 만약 각각의 start가 동시에 setNum을 발동시키면 +1만 되는거야. 이것을 해결하는 방법은 동기화를 시키는 방법이 있다.
					// 동기화를 시키는 곳은 Count class의 수정된 setter에서 조작해준다(Count class, 동기화를 부여한 setter 메서드 참고).
					// 스레드를 하나씩만 들어오도록 하게 함! synchronized 선언을 해주면 끝

		System.out.println("결과 : "+count.getNum());
	}
}

/* ------ 이해하기 ------






*/