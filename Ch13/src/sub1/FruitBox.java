package sub1;

//public class FruitBox {	// ������ ���¿��� ���׸��� �����ϱ� ����
public class FruitBox<T> {	// ġȯ���� <T> ��������. �̰� ���׸�Ŭ����! T ���� �ƹ��ų� �� �ᵵ ��. ���� ��� ����.

//	private Apple fruit; ó���� �̷��� �����߾��� 'box.setFruit(b);	// Banana�� ����� �� ����'�� ������ �ٳ������� ����ϱ� ���ؼ� 
//	private Object fruit; Object�� ��������. �ٵ� �� ���� ������ ġȯ����, T(���� �ǹ̾���)�� �����غ���
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
