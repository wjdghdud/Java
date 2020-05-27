package sub2;

import java.util.Set;
import java.util.TreeSet;

// ���� : TreeSet, ���� p752

public class TreeSetTest {
	public static void main(String[] args) {
		
		// Tree Set ���� �� ���� ������ ����
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);	// 23
		tree.add(10);	// 23���� �����ϱ� 23�� �ؿ��� ����
		tree.add(48);	// 23���� ũ�ϱ� 23�� �ؿ����� ����
		tree.add(15);	// 10���� ũ�ϱ� 10�� �ؿ����� ����
		tree.add(7);	// 10���� �����ϱ� 10�� �ؿ��� ����
		tree.add(22);	// 15���� ũ�ϱ� 15�� �ؿ����� ����
		tree.add(56);	// 48���� ũ�ϱ� 48�� �ؿ����� ����
			// ���ʿ��� ���������� ����� �Ǵ� ����. tree���. �׸��׷��� �����ϼ�. �ִ� ����� ������ �ִٴ°ž�.
			// ���ڷ� �Ѵٸ� A ~ Z ����.
		
		for(int num : tree) {
			System.out.print(num+", ");
		}
	}
}
