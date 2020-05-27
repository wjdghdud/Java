package sub5;

// ��¥ : 2020.05.13
// ���� : ĳ���� �ǽ��ϱ�, ���� p306.
import sub4.Animal; // �ڵ��߰� ��� : ��ü �����ϰ� ��Ʈ�� + �����̽���.
import sub4.Tiger;
import sub4.Eagle;
import sub4.Shark;


public class CastingTest {
	public static void main(String[] args) {
		
		// ĳ����(����ȯ)
		int		num1 = 1;
		double	num2 = num1;	// Ÿ���� ���� �޶� ��Ģ�����δ� ���Ǿ����� ����. int�� double������ ����ȯ�Ѵ�.
		
		double	var1 = 1.12;
		int		var2 = (int)var1;	// ������ ���� int -> double���� double -> int�� , '(int)'�� ���Եž� ��(int������ �ٲ��). �׷��� �Ǽ��δ� ��� ������� �����θ� ����.
		
		// ��ĳ����(������ ����)
		Animal a1 = new Tiger(); // Animal�� Tiger�� ��ĳ����(???)
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		// �ٿ�ĳ����
		Tiger tiger = (Tiger)a1; //a1�� �ٽ� Tiger�� �ٿ�ĳ����. ���� �׳��� �ȵǰ� '(Tiger)'�� ���Խ�Ŵ(Animal�� Tiger�� ����ȯ�ض�).
		Eagle eagle = (Eagle)a2;
//		Tiger shark = (Tiger)a3; // errorǥ�ô� �ȵǳ�, �̰� �������غ��� Shark�� Tiher�� �ɽ����� �� ���� �Ұ�.
		Shark shark = (Shark)a3;
		
		// unstanceof : ����������(��ü)�� ���� �ν��Ͻ��� �����ϴ� ������
		if(a1 instanceof Tiger) { // a1�� Tiger ��ü ���� �ϳ��ΰ�?
			System.out.println("a1�� Tiger�Դϴ�.");
		}else if(a1 instanceof Eagle) { // �ƴϸ� Eagle ��ü���� �ϳ��ΰ�?
			System.out.println("a1�� Eagle�Դϴ�.");
		}else if(a1 instanceof Shark) { // �ƴϸ� Shark ��ü���� �ϳ��ΰ�?
			System.out.println("a1�� Shark�Դϴ�.");
		}
	}
}
