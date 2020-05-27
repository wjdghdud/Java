package sub5;

// 날짜 : 2020.05.13
// 내용 : 캐스팅 실습하기, 교재 p306.
import sub4.Animal; // 자동추가 방법 : 객체 선택하고 컨트롤 + 스페이스바.
import sub4.Tiger;
import sub4.Eagle;
import sub4.Shark;


public class CastingTest {
	public static void main(String[] args) {
		
		// 캐스팅(형변환)
		int		num1 = 1;
		double	num2 = num1;	// 타입이 서로 달라서 원칙적으로는 허용되어지지 않음. int를 double형으로 형변환한다.
		
		double	var1 = 1.12;
		int		var2 = (int)var1;	// 하지만 위의 int -> double보다 double -> int는 , '(int)'가 이입돼야 함(int형으로 바꿔라). 그러면 실수부는 모두 사라지고 정수부만 남음.
		
		// 업캐스팅(다형성 적용)
		Animal a1 = new Tiger(); // Animal로 Tiger를 업캐스팅(???)
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		// 다운캐스팅
		Tiger tiger = (Tiger)a1; //a1을 다시 Tiger로 다운캐스팅. 역시 그냥은 안되고 '(Tiger)'를 이입시킴(Animal을 Tiger로 형변환해라).
		Eagle eagle = (Eagle)a2;
//		Tiger shark = (Tiger)a3; // error표시는 안되나, 이거 컴파일해보면 Shark는 Tiher로 케스팅할 수 없다 할거.
		Shark shark = (Shark)a3;
		
		// unstanceof : 참ㅈ조변수(객체)의 실제 인스턴스를 조사하는 연산자
		if(a1 instanceof Tiger) { // a1이 Tiger 객체 중의 하나인가?
			System.out.println("a1은 Tiger입니다.");
		}else if(a1 instanceof Eagle) { // 아니면 Eagle 객체중의 하나인가?
			System.out.println("a1은 Eagle입니다.");
		}else if(a1 instanceof Shark) { // 아니면 Shark 객체중의 하나인가?
			System.out.println("a1은 Shark입니다.");
		}
	}
}
