package sub2;

//public class Product { 
public class Product<A, B> {	// 치환변수 두 개를 갖는 제네릭 클래스.
		

//	private TV item;	// TV만 취급가능함.
	private A item;		// 제네릭 ㄱㄱ
//	private int info;	// 가격을 표시하고싶으면 Integer, 이름을 표시하고싶으면 String 등으로 다양하게 표현하고싶어! 
	private B info;		// 그래서 밑의 show 메서드의 제품정보에 할당될 info도 치환변수, B로 선언할래
	
	public Product(A item, B info) {
		this.item = item;
		this.info = info;
	}
	
	public void show() {
		System.out.println("제품 종류 : "+item);
		System.out.println("제품 정보 : "+info);
	}
}
