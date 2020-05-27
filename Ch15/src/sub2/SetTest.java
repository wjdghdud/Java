package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// ���� : �÷��� �����ӿ�ũ Set, ���� p724.

public class SetTest {
	public static void main(String[] args) {

		// �� ���� ���� �� �Ǽ� ������ ����
		Set<Double> set = new HashSet<Double>();
		set.add(1.1);
		set.add(2.1);
		set.add(3.1);
		set.add(1.1);	// �ߺ��� ������ �ȵȴٰ� ����?
		set.add(5.1);	// �� ���Ҵ� �� ��. �׸��� �迭ó�� ������ ����.
		
		System.out.println("���� ���� ���� : "+set.size());
		// add�� ������� ���� �ִµ� ��� �ٽ� �����ñ�? �׷��� �ݺ��ڸ� �̿��Ѵ�.
		
		// �� �ݺ��ڸ� �̿��� ���տ��� ���
		Iterator<Double> iter = set.iterator(); // ���� ������ �༮
		
		while(iter.hasNext()) { // hasNext : ������ ���� �ִ�?
			System.out.println("���� : "+iter.next()); // ������ ����.
		}
	}
}
