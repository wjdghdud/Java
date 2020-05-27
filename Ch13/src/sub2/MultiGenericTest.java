package sub2;

// ���� : ���׸� Ŭ����, ���� p654.

public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		System.out.println("tv : "+tv);
		System.out.println("phone : "+phone);
		
//		Product<A, B> p1 = new Product<A, B>(item, info);				// ���� ���׸��� �ݾ��൵ ��. ������ <> ��ȣ�� ���൵ ��� ����.
//		Product<TV, int> p1 = new Product(item, info);					// ���׸��� ��ü�� ����ϱ� ������ int�� ���� ġȯ������ �� �� ����.
		Product<TV, Integer> p1 = new Product<>(tv, 100);				// �׷��� int�� ��ü���� Integer�� �������ش�.
		Product<SmartPhone, String> p2 = new Product(phone, "Galaxy s20");	// String�� ��ü�ΰ� ����?

		p1.show();
		p2.show();
	}
}
