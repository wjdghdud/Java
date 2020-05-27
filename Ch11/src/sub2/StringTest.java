package sub2;

// ���� : String Ŭ���� �ǽ��ϱ�, ���� p496.

/*
----- String Ŭ���� -----
	- ���ڿ��� �����ϴ� ������ Ÿ��
	- ���ڿ� ������ �迭�� ���� ������ ���´�.
	- ���ڿ� �񱳴� equals �޼��带 ȣ���Ѵ�.
*/

public class StringTest {
	public static void main(String[] args) {
	
		// ���ڿ� = ���� = �迭.
		String str = "Hello"; // ����� ���ڿ� ����
		char[] arr = {'H', 'e', 'l', 'l', 'o'}; // ���ڸ� �����ϴ� Data type.
			// ������ Ÿ���� stock ������, String�� ��ü�� heap ������ ����.
		
		// ���ڿ� ��ü����
		String str1 = new String("Hello"); // ������ ���ڿ� ����
		String str2 = new String("Hello"); // ������ ���ڿ� ����
		String str3 = "Hello"; // literal ����
		String str4 = "Hello"; // literal ����
		
		// ������ ���ڿ�  ����. new ������ ���� ������ ������ ���� �������(to heap) ���ڿ�.
		if(str1 == str2) { // str1�� ������(�ּҰ�)�� str2�� �������� ���Ѵ�. �̵��� "Hello"��� ���ڿ��� ����Ų��. ������ �ּҰ��� �翬�� �ٸ���.
			System.out.println("str1�� str2�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� �ٸ���.");
		} // ����
		
		
		// literal ���� String
		if(str3 == str4) { // �׷��� ��ü�����ϵ��� �ϴ� �Ͱ��� �ٸ� ��ҿ� ����ϴ� �������� ����ϸ� �ּҰ��� ����.
			System.out.println("str3�� str4�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		if(str == str4) {
			System.out.println("str�� str4�� ������(�ּҰ�)�� ����.");
		}else {
			System.out.println("str�� str4�� ������(�ּҰ�)�� �ٸ���.");
		}
		
		// ���ڿ� ��(by .equals(). ���ڿ� �� �޼���(���� Ŭ������ ���� �޼���))
		if(str1.equals(str3)) { // ������ ���� ���ڿ� ��� �־��. �� ���ٰ� ��.
			System.out.println("str1�� str3�� ���ڿ� ���� ����.");
		}else {
			System.out.println("str1�� str3�� ���ڿ� ���� �ٸ���.");
		}
	}
}
