package sub2;

public class SmartTv extends Tv implements Computer { // Computer(interface)�� Tv(�׳� Ŭ����)�� ��ħ

	@Override
	public void booting() {
		System.out.println("SmartTv booting...");
	}

	@Override
	public void internet() {
		System.out.println("SmartTv internet...");
	}
}
