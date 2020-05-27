package sub1;

// 내용 : 스레드(Thread, 실), 교재 p576

/* ------ Thread ------ 
스레드는 마치 이야기의 흐름인 양, 프로그램의 실행 흐름이다.

	- 하나의 프로세스에서 실행되는 실행 흐름
	- 프로그램이 실행될 때 생성되는 실행흐름
	- Thread 클래스를 상속받아 start() 메서드로 서브스레드 실행
	
 */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		// 비동기(Asyncronize)방식으로 실행. run이랑 start랑 따로따로 실행해라.
//		sub1.start();
//		sub2.start();
		
		sub1.run(); // run으로 하면 단일스레드
		sub2.run(); // 원래의 run에서 start로 바꿔서도 해봐라. 이게 멀티스레드
		
		for(int i=1 ; i<=10 ; i++) {
			
			Thread.sleep(1000); // 여기에서 try catch하든가 아니면 throws선언 하든가. 이게 지연 출력임.
			
			System.out.println("Main Thread 실행...");
		}
		System.out.println("Main Thread 종료...");
	}
}

/* -- 정리 --
main 메서드 하나에서 모든 것이 실행이 되는데 
sub1.run();
sub2.run();
일 때는 단일스레드

sub1.start();
sub2.start();
일때는 멀티스레드

이다. 출력해서 확인해보면 된다.
*/
