package sub2;

// ClassTest를 위한 클래스 특성과 기능을 정의해놓은 class.

public class Account {
	
	// 특성(Account class의 멤버변수). 되도록 멤버변수는 외부에서 접근할 수 없도록 보호되어져야 함. 그래서 캡슐화(private)함.
	//  - 접근권한 private 선언을 함.
	//    하지만 이렇게 하면 객체초기화를 할 수가 없지. 당연히 private 선언이니까.
	private String bank;
	private String id; // 계좌
	private String name; // 입금주
	private int money; // 계좌 잔액
	
	// 생성자. class이름과 동일하며 매개변수는 멤버변수를 그대로 한다. 생성자를 통해 private 선언된 멤버변수를 외부에서 함부로 사용하지 못하도록 하기도 하며
	      // 따라서 객체초기화를 따로 못하게 만들고 대신에 생성자를 활용함으로써 객체선언과 동시에 변수를 초기화할 수 있다.
	      // 객체를 생성할 때 멤버변수를 초기화하는 메서드.
	Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
		
	}
	
	// 기능(Account class의 멤버 메서드(=함수)). static 선언은 이제 안함. 근데 왜???????????????????????????
	//  - 접근권한 public 선언을 하여 함수 호출은 할 수 있게 함.
	public void deposit(int money) { // 입금
		this.money += money;	// 멤버변수 money와 메서드의 money의 구별 방법은 this지시자('.')를 사용함. 당연히 멤버변수 money가  왼쪽이겠지?
	} // input이 함수 내에서 생성된 지역변수이므로 밑의 함수에는 영향이 없어. 그래서 밑의 함수의 int money도 다른 것이지.
	
	public void withdraw(int money) { // 출금 
		this.money -= money;
	}
	
	public void info() { // 잔액
		System.out.println("================");
		System.out.println("은 행 명 : " + bank);
		System.out.println("계좌번호: " + id);
		System.out.println("입 금 주 : " + name);
		System.out.println("현재잔액: " + money);
	}
}

// 함수, 멤버변수를 포함하는 클래스 를 포함하는 라이브러리(~.jar형식)를 포함하는 프레임워크