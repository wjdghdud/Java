package sub1;

// ���� : ������

public class OperatorTest {

	public static void main(String[] args) {
		
		// ���������
		int num1 = 1;
		int num2 = 2;
		int num3 = 3, num4 = 4; // �̷��� �����ص� ��
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num2;
		int rs4 = num4 / num2; // �� ���ϱ�.
		int rs5 = num4 % num3; // ������ ���ϱ�.
		int rs6 = num4 % num2;
		int rs7 = 11 % 4;
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		System.out.println("rs6 : "+rs6);
		System.out.println("rs7 : "+rs7);
		System.out.println();
		
		
		// ����, ���� ������
		int n1 = 1;
		int n2 = 2;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println();
		
		n1 ++; // +1
		n2 --; // -1
		
		System.out.println("n1` : "+n1);
		System.out.println("n2` : "+n2);
		System.out.println();
		
		n1 ++;
		n2 --;
		
		System.out.println("n1`` : "+n1);
		System.out.println("n2`` : "+n2);
		System.out.println();
		
		
		// ���մ��Կ�����
		int no1 = 1;
		int no2 = 3;
		int no3 = 3;
		int no4 = 9;
		
		no1 += 1; // �º����� �캯�� ���� ����. no1 = no1 + 1;
		no2 -= 2; // �º����� �캯�� ���� ��. no2 = no2 - 2;
		no3 *= 3; // �º����� �캯�� ���� ����. no3 = no3 * 3;
		no4 /= 4; // �º����� �캯�� ���� ������ ���� ����. no4 = no4 / 4;
			// �� �캯�� ������ �����Ͽ� +, -, *, /�� ������ �º��� �Ͱ� �Ѵ�. ���� : �º� -> ����(+, -, *, /) -> �캯 = �º��� ��� ��.
		
		System.out.println("no1 : "+no1);
		System.out.println("no2 : "+no2);
		System.out.println("no3 : "+no3);
		System.out.println("no4 : "+no4);
		System.out.println();
		
		
		// �񱳿�����
		int var1 = 1, var2 = 2;
		
		boolean res1 = (var1 > var2); // var1�� var2���� ũ��. �´� Ʋ����?
		boolean res2 = (var1 < var2); // var1�� var2���� �۴�. �´� Ʋ����?
		boolean res3 = (var1 >= var2); // var1�� var2���� ũ�ų� ����. �´� Ʋ����?
		boolean res4 = (var1 <= var2); // var1�� var2���� �۰ų� ����. �´� Ʋ����?
		boolean res5 = (var1 == var2); // var1�� var2�� ���� ����. �´� Ʋ����?
		boolean res6 = (var1 != var2); // var1�� var2�� ���� �ٸ���. �´� Ʋ����?
		
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
		System.out.println("res6 : "+res6);
		System.out.println();
		
		
		// ��������. �񱳽� �� �� �̻��� �ϳ��� ������ ����.
		boolean r1 = (var1 > 0) && (var2 > 1); // &&(and. �׸���). var1�� 0���� ũ��. �׸��� var2�� 1���� ũ��. �´� Ʋ����?
		boolean r2 = (var1 > 0) && (var2 > 2); // &&(and. �׸���). var1�� 0���� ũ��. �׸��� var2�� 2���� ũ��. �´� Ʋ����?
		// �� �� �ϳ��� false�� ��, ��°� = false. �� &&�� �� �� true���� true ���
		
		boolean r3 = (var1 > 0) || (var2 > 1); // ||(or. �Ǵ�). var1�� 0���� ũ��. �Ǵ� var2�� 1���� ũ��. �´� Ʋ����?
		boolean r4 = (var1 > 0) || (var2 > 2); // ||(or. �Ǵ�). var1�� 0���� ũ��. �Ǵ� var2�� 2���� ũ��. �´� Ʋ����?
		boolean r5 = (var1 > 1) || (var2 > 2); // ||(or. �Ǵ�). var1�� 1���� ũ��. �Ǵ� var2�� 2���� ũ��. �´� Ʋ����?
		// �� �� �ϳ��� true�� ��, ��°� = true. �� ||�� �ϳ��� true��� true ���
		
		boolean r6 = !(var1 > var2); // var1�� var2���� ũ�� �ʴ�. �´� Ʋ����?
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4); // ��� : && = �� �� true, true ���.
		System.out.println("r5 : "+r5);	//		|| = �ϳ��� true, true ���
		System.out.println("r6 : "+r6);
		
	}
}
