package sub2;

// 날짜 : 2020.05.07
// 내용 : 자바 클래스 실습하기

/* 
 
코딩 단계가 이러함.
Account class 정의
현재 class에서 사용
private 선언(in Account class) -> 이러면 현재 class에서 객체초기화를 못함. 당연히 외부 class에서 사용되어지는 형태이기 때문.
생성자 선언(in Account class) -> 그래서 생성자로 객체생성을 함과 동시에 초기화를 할 수 있음(like 메서드(함수)).
객체생성과 동시에 객체 초기화(현재 class에서)

*/

public class ClassTest {
	public static void main(String[] args) {
		
		// ● 국민은행 객체생성
		Account kb = new Account("국민은행", "121-12-1234", "정호영", 10000); // 및 초기화
			// new라는 것으로 다른 클레스의 정보를 불러옴. 데이터 타입은 Account, 변수의 이름은 kb, 대입을 Account class에서 만든 Account class.
		
/*
 ---------------------------- 필독 -----------------------------
 객체생성을 하기 전에는 이렇게 해서 객체 초기화를 했는데 private 접근권한을 걸었어. 외부에서 함부로 접근하지 못하게.
 그래서 생성자를 따로 만들어서 위의 객체생성 단계에서 바로 초기화까지 하게 된거야.
 
		// 국민은행 객체 초기화(이러면서 이제 변수를 선언하듯이 그들의 데이터를 할당한다.)
		kb.bank = "국민은행";
		kb.id = "121-12-1234";
		kb.name = "정호영";
		kb.money = 10000;
*/
		
		// 국민은행 입금, 출금, 잔액조회하기
		kb.deposit(10000); // 입금
		kb.withdraw(5000); // 출금
		kb.info();
		
		// ● 신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "110-386-365606", "정호영", 10000);
		
/*
 마찬가지임.
		// 신한은행 객체 초기화
		sh.bank = "신한은행";
		sh.id = "110-386-365606";
		sh.name = "정호영";
		sh.money = 10000;
*/
		
		// 신한은행 입금, 출금, 잔액조회하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
		
	}
}
