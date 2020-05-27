package sub1;

public class Apple  extends Object{ // 굳이  extends Object를 기입하지 않아도 됨. 모든 클래스의 부모 클래스인  Object 클래스이기 때문

	private String country;
	private int price;
	
	// 생성자
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
	
	// 위의 info 말고 아예 override 메서드를 정의할 수 있음.
	@Override
		public String toString() { // tos하고 컨트롤+스페이스바. 이미 오브잭트 클래스에 정의되어 있는 메서드.

		System.out.println("원산지 : " +country);
		System.out.println("가격 : "+price);
		// 그래서 그냥 이렇게 넣고싶은 것 만들면 됨.
		
		return super.toString();
		}
}

/*

JRE System Library : 자바클래스를 모아둔 jar 파일이 있고, 또한 그 안에 패키지들이 있으며 각종 다양한 유형의 필요 내장 클래스(자바에서 기본적으로 제공해주는)들이 있다.
이 라이브러리에 있는 클래스들 중 Object 클래스가 있는데 이 Object 클래스는 모든 클래스들 중에서 최상위 클래스이다. 사실 여기에서 작성한 Apple 클래스도 Object 클래스에
상속을 받고 있는 것. 따라서 extends Object를 따로 명시해주지 않아도 상관이 없다

*/
