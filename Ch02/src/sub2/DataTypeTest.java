package sub2;

// ���� : ������ �ڷ���

public class DataTypeTest {

	public static void main(String[] args) {
		
		// ������. ������ �Ʒ��� ũ�Ⱑ Ŀ��. 
		byte var1 = 1; // maximum : 127. 1bite = 8bit. �� 2^7 = 128.
		short var2 = 2;
		int var3 = 3;
		long var4 = 4;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		
		// �Ǽ���. ���� ������ �Ʒ��� ũ�Ⱑ Ŀ��.
		float var5 = 1.123456789f; // �������� f(������) �ٿ��־�� ��. �Ҽ����ڷ� 7���� �ڸ������� ���, �� �ڿ��� �ݿø���.
		double var6 = 1.123456789; // �������� f�� �Ⱥٿ��൵ ��. 16�ڸ����� ���
		
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		
		// bool(true of false, ��)��. boolean
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		
		
		
		// ������. 
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		
		// ���ڿ�(�ܾ�).
		String str1 = "Apple";
		String str2 = "�ڼ���";
		String str3 = "������"; // �� ����ǥ(")�� ����ؾ� ��.
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);		
		
	}	
}
