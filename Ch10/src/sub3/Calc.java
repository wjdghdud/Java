package sub3;

public class Calc {

	
	// �̱��� ��ü
	private static Calc instance = new Calc(); // instance �̰� ������ ��Ŀ���� �ٽ� �����ض�. Ch06 sub4 �����̴�. instance�� �ƴ� object�� ����.
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
		// ������� �̱��水ü ���� �ڵ巡. �����ض�
	
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	
	// div �޼���� ������ �߻��� �� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� �ʿ� �˸�
	public int div(int x, int y) throws Exception { // ������ sub1���� �ϴ� ��Ĵ�� �� ���� �ִµ� ��ü���� Ʋ�� �����ϰ�;�. �׷��� �޼��带 ȣ���ϴ� �ʿ��� ó���� �ϴ� ���(throws)���� �ؼ� ������.
													// �������̴ϱ� throw's'. 3 ���� ������. if�� �� 2��, 0�� ���� ���� 1��.
		// ������ �߻��� �� �޼��带 ȣ���ϴ� ������ ������ ������.
		if(y < 0) {
			Exception e = new Exception("y�� ������� �մϴ�.");
			throw e;
		}else if(y == 1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
			throw e;
		}
		
		int z = x / y;					
		return z;
	}
	
	
	
}
