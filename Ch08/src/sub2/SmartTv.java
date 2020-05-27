package sub2;

public class SmartTv extends Tv implements Computer { // Computer(interface)와 Tv(그냥 클래스)를 합침

	@Override
	public void booting() {
		System.out.println("SmartTv booting...");
	}

	@Override
	public void internet() {
		System.out.println("SmartTv internet...");
	}
}
