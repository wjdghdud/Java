package sub1;

public class Account {
	//특성(맴버변수)
	protected String bank; 
	//private 접근권한 
	//(즉 맴버변수는 중요한 기능을 하므로 보호를 해줘야하므로 private를 써서 캡슐화한다.)
	// 자식클래스에서 참조의 대상이 될때는 protected 선언으로 수정
	protected String id;
	protected String name;
	protected int money;
	
	// 생성자 : 객체를 생성 할때 맴버변수를 초기화하는 메서드
	// (즉 생성자는 수정이 가능하도록 만들어준다)
 	Account(String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	
	//기능(메서드)
	public void deposit(int money) {
		this.money += money;
	} //this.Account = Account 클래스에 money를 참조해라라는 뜻
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {	
		System.out.println("===================");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입 금 주 : "+name);
		System.out.println("현재잔액 : "+money);
	}	
} //함수를 모아둔걸 클래스라고한다.
  //클래스를 모아둔걸 라이브러리라고한다.	(.jar)
  //라이브러리를 모아둔걸 프레임워크라고한다.(Spring)

	
	
