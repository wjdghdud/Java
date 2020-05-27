package sub3;

// ���� : Wrapper Ŭ���� �ǽ��ϱ�, ���� p527. 
// �ڿ� ��� collection���� Ȱ��Ǵ� ����.

// stack ������ �⺻������ wrapper Ŭ������ wrapping��. �� ��ü�� ����ٴ� �ǹ��̴�.

public class WrapperRest {
	public static void main(String[] args) {
		
		// �⺻����. �⺻ type�� ����. stack�� �����.
		int var1 = 1;
		double var2 = 1.1;
		boolean var3 = true;
		char var4 = 'A';
		
		// wrapper Ŭ����. �⺻Ÿ�� ������ ��ü�� �������ش�.
		Integer w1 = new Integer(var1);
		Double w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		Character w4 = new Character(var4);
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		// ���ڿ� -> �⺻Ÿ�� ��ȯ(�Ʊ�(valueOf)�� �ݴ�). �̰��� wrapper Ŭ������ Ȱ���Ѵ�.
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "false";
		
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);

		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
		// ���ڿ� -> Wrapper ��ȯ.
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		// Wrapper -> ���ڿ� ��ȯ
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}
}
