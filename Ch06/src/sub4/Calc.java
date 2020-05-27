package sub4;

public class Calc {
	
	// �̱��� ��ü
	private static Calc instance = new Calc();// Ŭ���� ����� �ڱ� �ڽ��̴�. �Ӱ� ���ÿ� �ڱ��� ��ü�� �����ϸ鼭 static
	
	// ������
	private Calc() {
		
	} // �����ڸ� private �����ϸ� new�� ���� heap���������� ������ ��ü�� ������ ����.
	
	// getter
	public static Calc getInstance() {
		return instance;
	}
	
	// method
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
