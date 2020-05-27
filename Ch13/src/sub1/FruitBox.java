package sub1;

//public class FruitBox {	// 원래의 형태에서 제네릭을 적용하기 위해
public class FruitBox<T> {	// 치환변수 <T> 선언해줌. 이게 제네릭클래스! T 말고 아무거나 다 써도 됨. 딱히 상관 없음.

//	private Apple fruit; 처음에 이렇게 선언했었고 'box.setFruit(b);	// Banana를 취급할 수 없음'의 문제로 바나나까지 취급하기 위해서 
//	private Object fruit; Object로 선언해줌. 근데 더 좋은 미정의 치환변수, T(딱히 의미없음)로 선언해보자
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
