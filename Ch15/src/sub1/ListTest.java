package sub1;

import java.util.ArrayList;
import java.util.List;

// ���� : �÷��� �����ӿ�ũ �ǽ�, ���� p724

public class ListTest {
	public static void main(String[] args) {
		
		// �� ����Ʈ ���� �� ���� ������ ����
//		ArrayList<E> // ��� ����Ʈ�� ������ �� '��ü'�� Ÿ��(E)�� �����̴�?
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
			// interface�� �ڵ带 �����ϰ� ��ȭ������. �׷��� List�� ����������??? �ռ�
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);	// 0 ��ġ���� ���������� 1 ~ 5 �Ҵ�(1, 2, 3, 4, 5)
		list1.remove(2);// 2������ ��ġ�� ��ü�� ����(1, 2, 4, 5)
		list1.add(0, 3);// 0�� ������ ��ġ�� ��ü�� 3 �Ҵ�(3, 1, 2, 4, 5)
		
		for(int i=0 ; i<list1.size() ; i++) {
			System.out.println("list1�� "+ (i+1) +"��° ���� : "+list1.get(i));
		}
		
		
		// �� ����Ʈ ���� �� ���ڿ� ������ ����
		List<String> list2 = new ArrayList();
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
		System.out.println(list2.get(4));
		
		// �� ����Ʈ ���� �� ��� �����͸� ����
//		Apple a1 = new Apple("�ѱ�", 3000);
//		Apple a2 = new Apple("�Ϻ�", 2000);
//		Apple a3 = new Apple("�븸", 4000);
		
		List<Apple> list3 = new ArrayList<Apple>();
//		list3.add(a1);
//		list3.add(a2);
//		list3.add(a3);
		
		list3.add(new Apple("�ѱ�", 3000));
		list3.add(new Apple ("�Ϻ�", 2000));
		list3.add(new Apple("�븸", 4000)); // �̷������� �� �ٿ� �ٷ� ����
		
		// �ѱ���� ���
		Apple a1 = list3.get(0);
		a1.show();
		
		// �Ϻ���� ���
		list3.get(1).show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
