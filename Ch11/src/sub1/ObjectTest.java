package sub1;

// ��¥ : 2020.05.18
// ���� : Object Ŭ���� �ǽ��ϱ�, ���� p457.

/*
 ----- Object Ŭ���� -----
	- �ڹ��� �ֻ��� Ŭ����
	- ��� Ŭ������ �θ� Ŭ������ ������ ���뿡 Ȱ��ȴ�.


*/

public class ObjectTest {
	public static void main(String[] args) {

		
		// �̰� �ȵ�. �ؿ� ���� ����.
//		Apple a1 = new Apple("�ѱ�", 3000);
//		Object a2 = new Apple("�Ϻ�", 2000); // �θ� Object�̱� ������ 
//		Banana b1 = new Banana("�븸", 2500);
//		Object b2 = new Banana("�߱�", 1500); // �θ� Object�̱� ������
		
		
		
		// �������� Ȱ��Ǵ� Object Ŭ����
		Apple obj1 = new Apple("�ѱ�", 3000);
		Object obj2 = new Apple("�Ϻ�", 2000); // �θ� Object�̱� ������ 
		Banana obj3 = new Banana("�븸", 2500);
		Object obj4 = new Banana("�߱�", 1500); // �θ� Object�̱� ������
		
		// �̰� Apple�� �������� toString �޼���. �̰��� �������ϸ� �ٿ�ĳ������ �ʿ䰡 ����. 
		obj1.toString();
		obj2.toString();
		
		
//		a1.info();
//		b1.info();
		
		/*
		Object Ŭ������ ��ӹ޴� ���� Ŭ������ �� ��� �޼��尡 �ִ�. �� �� �θ�Ŭ������ �����ϴ� ���������� ���� ���� ������ Object�̴�.
		���� Object�� ���� Ŭ������ ��� �޼���(����� info)�� �ִٸ� �װ��� ������ ���� ����. �̹� ������� �ڹٿ��� �����Ǵ� Object Ŭ����(���� Ŭ����)����
		���� ������ info �޼��尡 ���ٴ� ���̾�. �׷��� ���� �� Casting.
		*/
		
		// �ٿ�ĳ����
		Apple a1 = (Apple) obj1; // Down Casting
		Banana b3 = (Banana) obj3;
		
		a1.info();
		b3.info();
		
		Object fruit[] = {obj1, obj2, obj3, obj4}; // Object Ŭ������ ����ϴ� ���(�������� �̿�).
		
		// �̰� ���ϴ°ǵ�?? �ƹ�ư ��� �������� �ϴ°ǰ�����.
		Apple a2 = (Apple) fruit[1];
		Banana b4 = (Banana) fruit[3];
		
		a2.info();
		b4.info();
	}
}
		
		
		
