package sub2;

// ���� : �پ���  ����ó��, ���� p433.

public class KindOfExceptionTest {
	public static void main(String[] args) {
		
		
		// �迭�� ũ�⿡�� ��� �ε����� ��������
		int arr[] = new int[3]; // �迭 ������ �Ҵ�(3��).
		
		for(int i = 0 ; i <= 3 ; i++) { // �迭�� ������ 3���ε� i = 0 ~ 3���� �� �� �̴�. �� ����.
			
			try {
			arr[i] = (i+1);
			}catch (ArrayIndexOutOfBoundsException e) { // Exception�̶�� Ŭ������ �پ��� �������� �����ϴ� ��ü�̴�. �̰� Array�� ġ�� ��Ʈ�� �����̽��� ������. �̰� �迭 ����ĳġ�ϴ� �ڵ�
				System.out.println("�迭�� �ε������� �����ϴ�.");
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		
		
		// NullPoint ����
//		Tiger tiger = new Tiger(); �̷��� ���ϰ�
//		Tiger tiger; // �̷��� ���� �ص� ��� stack �������� Tiger ��ü�� ���� �ȵ����� ���� tiger �� ������.

//		Tiger tiger = null; �̰Ŵ� �׳� null���� ���� ������ �ƴϱ� �� �̷��� �� ��
		
//		tiger.move(); ��ü�� �������� �ʾұ� ������ �翬�� ���� ��ü�� ���� �޼���� ȣ���� ���� ����. �̰� Null��.
//		tiger.hunt();
		
		try {
			Tiger tiger = null;
			
			tiger.move();
			tiger.hunt();
		}catch(NullPointerException e) { // ���� Null�� ġ�� ��Ʈ�� �����̽��� ��
			System.out.println("Tiger ��ü�� �������� �ʾҽ��ϴ�.");
		}
		
		
		// ĳ���� ����
		
		try {
		Animal a1 = new Eagle(); // ��ĳ����(������)
		Animal a2 = new Shark(); // ��ĳ����(������)
		
//		Eagle eagle = (Eagle)a1; // Animal�� a1�� Eagle�� �ٿ�ĳ����. �׷��� ��ȣ �ȿ� Eagle�� ����
		Shark shark = (Shark)a1; // ���������δ� ���Ǵµ�, ������ a1�� Shark ������ ��ȯ�� ���� ����. ������ �̰� �����ڵ��. ���� ��ü������ try�ȿ� ���θ�
		}catch (ClassCastException e) { // ���� Class�� ġ�� ��Ʈ�� �����̽��� ��
			System.out.println("ĳ���� ������ �߸��Ǿ����ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		System.out.println("���α׷� ����...");
	}
}
