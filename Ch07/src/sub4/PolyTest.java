package sub4;

/*
 * ��¥ : 2020/05/12
 * �̸� : ��¹�
 * ���� : ������(Polymorphism) �ǽ��ϱ� ���� 305
 * 
 * �������̵�(Override)
 * - �θ�Ŭ������ �ɹ� �޼��带 �ڽ�Ŭ�������� �ٽ� �����ϴ°�(������)
 * - �ڽ�Ŭ������ �ٽ� ������ �޼���� �θ�Ŭ������ �޼��带 �����.(��������)
 * 
 * ������
 * - ��Ӱ��迡 �ִ� �θ�Ŭ������ ��ü���� ������ ��ӹ޴� �ڽ�Ŭ������ ���ϴ� ����  
 * - �θ�Ŭ������ Ÿ������ ��ü�� �����ϴ°�
 * 
 */

public class PolyTest {	
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// ������ Ȱ��
		Tiger ani1 = new Tiger();
		Eagle ani2 = new Eagle();
		Shark ani3 = new Shark();
		
		// ��ü�迭
		Animal arr[] = {ani1, ani2, ani3};
		arr[0].move();
		arr[1].move();
		arr[2].move();
	}
	
}
