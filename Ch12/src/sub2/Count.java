package sub2;

public class Count {

	private int num;
	
	// getter
	public int getNum() {
		return num;
	}

/*
	// 원래의 setter
	public void setNum() { // synchronized 선언을 통해 동기화가 가능하도록 함
		num++;
	}	// 멀티스레드 확인용 수정 setter.
*/
	
	// 동기화를 부여한 setter. 동기화 블록선언으로 스레드간 경합을 막는다.
	public synchronized void setNum() { // synchronized 선언을 통해 동기화가 가능하도록 함
		num++;
	}	// 멀티스레드 확인용 수정 setter.
	
/* ----- 이렇게 해도 됨 -----

동기화 블록선언으로 스레드간 경합을 막는다.

	public  void setNum() { // synchronized 선언을 통해 동기화가 가능하도록 함
		synchronized(this){
		num++;
		}
	}	// 멀티스레드 확인용 수정 setter.
*/
}
