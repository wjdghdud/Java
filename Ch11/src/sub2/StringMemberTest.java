package sub2;

// ���� : ��Ʈ�� ��� �ǽ�.

public class StringMemberTest {
	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
	// �ֿ� ��� �޼��� 7����.
		// length - ���ڿ��� ����(���� ����)
		System.out.println("str ���ڿ� ����(space ����) : "+str.length());
		
		// charAt - ���ڿ��� N+1��° ����(�迭�� ù ��° ���Ҵ� 0�̱� ������ N+1.) ����
		System.out.println("str�� 6��° ���� : "+str.charAt(6));
		
		// substring - ���ڿ� �ڸ���
		System.out.println("str�� 0������ 5�������� ���ڿ� : "+str.substring(0, 5));
		System.out.println("str�� 6������ ������������ ���ڿ� : "+str.substring(6));
		
		// indexOf, lastIndexOf. ����(0)���� ã��, ������(������ ����)���� ã��. ���ڿ����� ���� �ε�����ȣ ����
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("���ڿ� str���� �տ��������� ����, e�� �ε����� : "+idx1);
		System.out.println("���ڿ� str���� �ڿ��������� ����, e�� �ε����� : "+idx2);
		
		// replace - ���ڿ� ��ü
		String newstr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newstr);
				
		// valueOf - �Ϲ�Ÿ�� ������ String������  data type ��ȯ
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1); // ���� 1�� ���ڿ� 1�� �ٲ�. int���� String����. 
		String s2 = String.valueOf(var2); // �Ǽ� 2.13�� ���ڿ� 2.13���� �ٲ�. double���� String����
		String s3 = "" + var3; // ���� true�� ���ڿ� true�� �ٲ�. boolean���� String����. �����ϰ� �̷��Ե� ǥ�� ����
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
	}
}