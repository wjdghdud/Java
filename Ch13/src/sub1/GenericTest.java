package sub1;

// ��¥ : 2020.05.20
// ���� : ���׸�, ���� p654.
/*
	----- ���׸� -----
Ŭ������ ���뼺�� ���� ���Ǵ� ����.
�÷��ǿ��� �̿�Ǵµ� �÷��� Ŭ������ ���� ���׸� Ŭ������.
*/
public class GenericTest {
	public static void main(String[] args) {
	
		Apple a = new Apple("�ѱ�", 3000);
		Banana b = new Banana("�븸", 2000);
		
//		FruitBox box = new FruitBox();
//		box.setFruit(b);	// Banana�� ����� �� ����.		
//		box.setFruit(a);	// ����� ����� ������ FruitBox. Banana�� ������� ����. �ֳ� �ϸ� FruitBox�� �ƿ� ����� Apple�� ����� ����.
							// �׷��� Object�� �������ش�.
		
		FruitBox<Apple> appleBox = new FruitBox<>();	// �׷��� �̷��� ġȯ���� �ڸ��� Apple�� ���ϸ�
		appleBox.setFruit(a);							// box�� apple�� ���� �� ����
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		
		a.show();
		b.show();
	}
}
