package sub4;

// ��¥ : 2020.05.11
// ���� : Ŭ��������(��������), Ŭ�����޼���(�����޼���) �ǽ��ϱ�(���� p236).

/*
	�޸𸮱����� stack, heap, Method Area�� �� ������ ������.
	������ Method Area�� ���� ������ �ٷ�.
*/
public class StaticTest {
	public static void main(String[] args) {
		
		// �� StaticTest, Increment class�� ���ϴ� ����.
		// �޸� �����Ҵ翵��(Method Area)�� �̹� Increment�� add() �޼��尡
		// ���ǵǾ� �ֱ� ������ ��ü �������� �ٷ� static �޼����� ȣ���� ����.
		// ���� : Method Area ����(static ����)�� ������ �޼���� ���� ���� ������ �����Ǳ� �����̰��� �Ƹ�?
		Increment.add(); // Increment class�� add�Լ� ����
		
		Increment inc1 = new Increment();	// Increment�� ��ü�� ������. �̶� Increment�� ������ �����ڷ� ȣ���� ����.
		Increment inc2 = new Increment();	// ������ �� : �ڵ� ��ü�� �����ؾ� ��. inc�� �����ϰ� �ּҸ� �����ϸ鼭 �Լ��� ����?????
		Increment inc3 = new Increment();	// ������� �� �ϰ� ����ϸ� num1, 2�� ���� 1(num2�� static keyword �ֱ� ��).
											// int�� ������ �⺻ �� : 0. �׷��� num1�� ++���꿡 ���� 1.
		
		/* ---------- note ----------
		static keyword�� �߰��ϰ� �Ǹ� ���� ��ü�� ����� �����Ǵ� ���� �ƴ�
		�������� �� �ϳ��� ������ ��޵ǰ� �ȴ�. static ������ ���� ���� �����Ǹ鼭 ���� ���߿� �Ҹ���.
		
		������ ���� : static Test class(���� class. ��� main �Լ��� ���ʿ� static ����), Increment class�� num2(static),
		Increment class�� static void add() �޼���, inc1, inc1 class Increment, inc2, inc2 class Increment, 
		inc3, inc3 class Increment�� ���� garbage collector�� ���� �Ҹ�Ǵ� ������ ����. ������� ������ Calc class �����ϰ���.
		*/
		
		
		// �� Calc class ����
		// �̱��� ��ü ����
//		Calc c = new Calc();	// �̹� Calc class�� ��ü�� ������ �ֱ� ������ new�� �� �ʿ䰡 ����.
								// new�� ���� �Ǹ� heap ������ �޸𸮰� �� �ٽ� �Ҵ�Ǳ� ������(new ������ ���� heap����).
								// �׷��ٸ� �̹� Method Area�� ������ Calc��  �����ϸ� ��. �׳� ������(get�� ����) �ȴٴ� ��.
								// new��� ���� ������ �ϴ� ����� �����ڸ� private���������ν� ������.
		
		// �̱��� ��ü ������
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c2.multi(2, 3);
		int r4 = c2.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
	}
}



























