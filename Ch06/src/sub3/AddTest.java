package sub3;

// 내용 : 클래스 객체 메모리 생성 실습하기


public class AddTest {
	public static void main(String[] args) {
		
		int []arr = {10, 20, 30};
		Adder a = new Adder(100); // x를 100으로 초기화시킨다는거
		
		a.add(100);
		System.out.println("객체 a의 멤버 x : " + a.getX());
		System.out.println();
		
		a.add(a); // a를 대입한다는 것인데 이전의 함수호출에서 
		System.out.println("객체 a의 멤버 x : " + a.getX());
		System.out.println();
		
		a.add(arr);
		System.out.println("배열 arr의 1번째 원소 : " + arr[0]);
		System.out.println("배열 arr의 2번째 원소 : " + arr[1]);
		System.out.println("배열 arr의 3번째 원소 : " + arr[2]);
		System.out.println();
		
		a = a.addNew(a); // return값을 다시 a에 대입
		System.out.println("객체 a의 멤버 x : " + a.getX());
	}
}

/* --- 참고할 것 ---
Adder class에서 
public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;					
	}
	
	를
	
public void addNew(Adder a2) {
	a2 = new Adder(1)
}

	로 고치고 위의 호출부에서 a = a.addNew(a);를  a.addNew(a);로 고쳐서 다시 해봐라

 */