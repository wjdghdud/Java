package sub3;

// MapTest를 위한 클래스

public class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("사과");
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}
