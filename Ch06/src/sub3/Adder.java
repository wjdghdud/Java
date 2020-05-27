package sub3;

// 내용 : AddTest class에서 활용될 class

// note : overload함수랑 overloading함수랑 같은 말

public class Adder {
	
	// ● 멤버변수
	private int x; // 만약 그냥 선언을 하면 public으로 구지 선언 안해도 그건 그냥 기본 public임.
	
	// ● 생성자
	Adder(int x){
		this.x = x;
	}
	
	// ● getter, setter : 
	//  - 외부에서 멤버변수에 대한 직접참조가 필요할 경우 사용하는 메서드.
	public int getX() { // get + ctrl + spacebar
		return x; // 지금은 x를 반환한다고는 하지만 앞으로 getter는 class로부터 참조가 필요로 해지는 private 선언된 멤버변수를 찾을 때 필요하다.
	}
	public void setX(int x) { // set + ctrl + spacebar
		this.x = x; // 위의 getter로 멤버변수값을 불러내어 처리과정을 거친 해당 멤버변수를 setter를 이용해 해당 클래스(this.변수)의 멤버변수 값에 저장( = 처리과정을 거친 변수)한다.
	}
/*  ------------- 이해하기 to getter, setter --------------
 예를 들어 틀을 가진 클래스, A(현재는  Adder class) 클래스가 있고, 객체가 있는 클래스, B(현재는 AddTest class)가 있다.
 이때 B라는 객체가 있는 클래스는 A의 변수에는 접근하지 못하지만 A의 메서드에는 접근할 수 있다. 따라서 A의 메서드(getter, setter)를 이용하여
 A의 변수에 접근할 수가 있게 되는 것이다.
*/
	
	// ● 멤버 메서드
	public void add(int x) {
		this.x = x + 50;
	}
	
	public void add(int[] arr) { // 사실 배열도 참조변수(객체)임.
		arr[0] ++; // 첫 번째 원소
	}
	
	public void add(Adder a1) { // 매개변수로 참조변수(Adder형), a1을 선언. 참조변수를 사용했기 때문에 이것 또한 같은 Class이더라도 어찌 보면 외부의 변수를 가져다가 쓴 격이다.
		int x = a1.getX() + 40; // 따라서 getter, setter를 사용하여야 한다. 그래서 a1 class의 x의 값을 가져온 뒤 + 40.
		a1.setX(x);				// setter를 이용하여 a1의 x의 값(this.x)에 위의 연산 결과를 대입한다( = x;).
	}							// 메서드가 끝이 나면 Adder a1은 stack 영역의 데이터이기 때문에 함수가 끝이 나면 제거됨.
	
	// a1.getX()를 쓰니까, 이게 무슨 말이냐면  x 값을 가져온다는거야. 입력자체가 클래스이지만 getter를 이용해서 그 클래스의 특정한 변수를 얻는다는 것.
	// 그러고 난 뒤, setter를 이용해 그 변수의 처리결과값을 저장한다는 것.
	
	
	public Adder addNew(Adder a2) { // 어차피 얘는 public 선언된 함수의 것으로 동작되기 때문에 참조변수를 사용했다 한들 직접적인 외부의 private 변수를 필요로
		a2 = new Adder(1); // new Adder니까 heap 영역, 그리고 x값은 1로 초기화됨. 그 1이 a2로 대입되고 
		return a2;					// 하지 않는다. 따라서 getter와 setter를 사용할 필요가 없음.
		// 코드 설명 : new Adder이라서 heap 영역의 데이터를 생성(AddTest class에서). 따라서 이것 또한 변수가 생성됐다가 함수가 끝나면 또 제거됨.
	}	
}
