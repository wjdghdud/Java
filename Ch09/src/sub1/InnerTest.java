package sub1;

import sub1.Outer.Inner;

// ��¥ : 2020.05.14
// ���� : ��øŬ����, ���� p390. Ŭ���� �ȿ� Ŭ������ �ִ�.

public class InnerTest {
	public static void main(String[] args) {
		
		// Outer�� ��ü�Ҵ� ����� �׳� �Ȱ���.
		Outer out = new Outer(10);
		out.info();
		
		/* ������ Outer(�ܺ�) Ŭ������ Inner(����) Ŭ������ ��ü�Ҵ� ����� �ٸ���.
		Inner inner = new Inner(20);
		inner.info();
		*/
		
		// Inner(����)Ŭ������ ��ü�Ҵ�
		Inner inner = out.new Inner(20); // �̷������� �ܺ�Ŭ������ ������ �ʿ�� �Ѵ�.
		inner.info();
	}
}
