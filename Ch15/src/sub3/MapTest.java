package sub3;

import java.util.HashMap;
import java.util.Map;

// ���� : Map, ���� p740.

public class MapTest {
	public static void main(String[] args) {
		
		// �� �� ���� �� ���ڿ� ������ ����
//		Map<K, V> // Map�ϰ� ��Ʈ�� + �����̽���(���� array�� set ���� �Ȱ���)�ϸ� �˾Ƽ� �̷��� ����. import�� �˾Ƽ� ����
		Map<Integer, String> map1 = new HashMap<Integer, String>(); // key�� : Integer, ���� : String
		map1.put(101, "������");
		map1.put(102, "������");
		map1.put(103, "�庸��");
		map1.put(104, "������");
		map1.put(105, "�̼���");
		
		// ��ü ������ ����
		System.out.println("map1 ������ ���� : "+map1.size());
		
		// �� ���� ���
//		map1.get(key) // �⺻���¾�. key���� ���϶�� ��
		String value = map1.get(102);
		System.out.println("map1�� 102�� Ű �� : "+value);
		
		
		// �� �� ���� �� ��� ������ ����
		
/*		----- �̰� ���İ� �� �̷��ٰ� �����°ų� �������� �̰� �־��� --------
		Apple a1 = new Apple("�ѱ�", 3000);
		Apple a2 = new Apple("�̱�", 2000);
		Apple a3 = new Apple("�Ϻ�", 4000);
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(101, a1);
		map2.put(102, a2);
		map2.put(103, a3);
*/
		Map<Integer, Apple> map2 = new HashMap<>();
		
		map2.put(101, new Apple("�ѱ�", 3000));
		map2.put(102, new Apple("�ѱ�", 3000));
		map2.put(103, new Apple("�ѱ�", 3000));
		
		// �ѱ���� ���
		Apple korApple = map2.get(101);
		korApple.show();
		
		// �̱���� ���
		map2.get(102).show();
		
		
		
		
		
		
		
		
		
		
		
	}
}
