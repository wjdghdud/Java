package sub3;

// ���� : ���� ���ѱ��, ���� p440

public class ThrowsTest {
	public static void main(String[] args) throws Exception{ // div���� �������� ����(throws) ����ó��, �װ� �ٽ� �� ���ο��� JVM���� ����(throws).
		
		// �̱��� ��ü ������
//		Calc c = new Calc(); // �̰� �ȵ�
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(1, 2);
//		int r4 = c.div(4, 0or1or��������);
					// �̰� ��� �ȵǴϱ� Calc class�� div�޼��忡�� try~catch�� ����ص� �Ǵµ� throws�� ��. �׷��� c.div(x, y) �κ� �ؿ� ���� ���� �߰� ���콺Ŀ�� �ø� ����  surround with try/catch�� ����.
					// �װ� ������ �Ǳ� �ϴµ�, div �޼��忡�� throws�� �Ἥ main �޼���� ����(main �޼��忡�� ȣ���ϴϱ�). �ٵ� �װ� ���θ޼��尡 �� JVM���� ����(throws). �׸��� div �޼��忡 if�� �ۼ��ߴ�.
					// �Ǵ� ���콺Ŀ�� �ø� ���¿��� ù �� ° �� ������ �ڵ������� main �޼��忡  throws Exception�� �ڵ� ������.
		
		// ������ �߻��� throws�� ����� �޼��带 ȣ���ϴ� �ʿ����� ����ó��(try-catch)�� �ؾ� ��.
		// �Ǵ� �ٽ� throws �������� main�� ȣ���ϴ� �ڹ� JVM���� ���ܸ� ����.
		int r4 = c.div(4, 1);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("���α׷� ����...");
	}
}
