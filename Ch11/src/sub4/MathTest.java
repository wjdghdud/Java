package sub4;

// ���� : ���� Ŭ���� �ǽ�, ���� p533

public class MathTest {
	public static void main(String[] args) {
		
//		math m = new Math(); // Math��� �⺻���� �ڹ����� Ŭ�����ε�, �̰� ��ü������ �ȵǴ� ������ ��Ŭ��(singleton) ��ü�� �׷���.
		
		// �⺻���� ��
		System.out.println("PI�� : "+ Math.PI);
		System.out.println("���밪 : "+ Math.abs(-5));
		System.out.println("���밪 : "+ Math.abs(-3.14));
		System.out.println("������ : "+ Math.sqrt(9)); // square root
		System.out.println("�ø��� : "+ Math.ceil(1.2));
		System.out.println("�ø��� : "+ Math.ceil(1.8));
		System.out.println("������ : "+ Math.floor(1.2));
		System.out.println("������ : "+ Math.floor(1.8));
		System.out.println("�ݿø��� : "+ Math.round(1.2));
		System.out.println("�ݿø��� : "+ Math.round(1.8));
		
		// random
		double num1 = Math.random(); // double�� ���ϵǴ� ���� math �޼���. 0 ~ 1����.
		System.out.println("num1 : "+num1); // 0 ~ 1 ������ ������ �Ǽ�.
		
		double num2 = num1 * 77; // 0 ~ 77 ������ ������ �Ǽ�
		System.out.println("num2 = num1 * 10 : "+num2);
		
		double num3 = Math.ceil(num2); // 1 ~ 77 ������ ����.
		System.out.println("num3 : "+num3);
		
		double lotto = Math.ceil(Math.random()*45);
		System.out.println("lotto : "+lotto);
	}
}
