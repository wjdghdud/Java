package sub3;

// ���� : Ŭ���� ��ü �޸� ���� �ǽ��ϱ�


public class AddTest {
	public static void main(String[] args) {
		
		int []arr = {10, 20, 30};
		Adder a = new Adder(100); // x�� 100���� �ʱ�ȭ��Ų�ٴ°�
		
		a.add(100);
		System.out.println("��ü a�� ��� x : " + a.getX());
		System.out.println();
		
		a.add(a); // a�� �����Ѵٴ� ���ε� ������ �Լ�ȣ�⿡�� 
		System.out.println("��ü a�� ��� x : " + a.getX());
		System.out.println();
		
		a.add(arr);
		System.out.println("�迭 arr�� 1��° ���� : " + arr[0]);
		System.out.println("�迭 arr�� 2��° ���� : " + arr[1]);
		System.out.println("�迭 arr�� 3��° ���� : " + arr[2]);
		System.out.println();
		
		a = a.addNew(a); // return���� �ٽ� a�� ����
		System.out.println("��ü a�� ��� x : " + a.getX());
	}
}

/* --- ������ �� ---
Adder class���� 
public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;					
	}
	
	��
	
public void addNew(Adder a2) {
	a2 = new Adder(1)
}

	�� ��ġ�� ���� ȣ��ο��� a = a.addNew(a);��  a.addNew(a);�� ���ļ� �ٽ� �غ���

 */