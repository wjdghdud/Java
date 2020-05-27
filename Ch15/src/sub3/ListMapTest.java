package sub3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sub1.Apple; // �̰��ϸ� Apple ���� �ϳ��� sub�ȿ� �ȸ��� ȣ���ؼ� ���� ����

// List + Map. ����Ʈ�� �� �÷��� ���� �ǽ��ϱ�

public class ListMapTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>(); // �̰ŷ� �ؿ� �ִ� map 1 ~ 3�� �迭ȭ���ѹ������� �Ѵ�. �� �迭 �ȿ� ������ġ���� �� �� ��
		
		Map<Integer, Apple> map1 = new HashMap<Integer, Apple>();
		map1.put(101, new Apple("�ѱ�", 3000));
		map1.put(102, new Apple("�̱�", 5000));
		map1.put(103, new Apple("�Ϻ�", 4000));
		
		Map<Integer, Apple> map2 = new HashMap<Integer, Apple>();
		map2.put(201, new Apple("�߱�", 3000));
		map2.put(202, new Apple("����", 5000));
		map2.put(203, new Apple("ȣ��", 4000));
		
		Map<Integer, Apple> map3 = new HashMap<Integer, Apple>();
		map3.put(301, new Apple("�븸", 3000));
		map3.put(302, new Apple("ȫ��", 5000));
		map3.put(303, new Apple("�±�", 4000));
		
		// ����Ʈ�� �� ����. �̰ɷ� �迭ȭ �Ϸ�.
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		// �ѱ���� ���
		Map<Integer, Apple> m1 = list.get(0);
		Apple a1 = m1.get(101);
		a1.show();	// �� �̰� �帧 �� �ľ��ض�. �̰ŷ� ������ ���ظ��� �� ���� ������
		
		// ȣ�ֻ�� ���
		list.get(1).get(203).show(); // �̰͵� �����Ѱ���.
		
		// �±���� ���
		list.get(2).get(303).show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
