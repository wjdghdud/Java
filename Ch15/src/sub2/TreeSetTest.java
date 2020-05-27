package sub2;

import java.util.Set;
import java.util.TreeSet;

// 내용 : TreeSet, 교재 p752

public class TreeSetTest {
	public static void main(String[] args) {
		
		// Tree Set 생성 및 숫자 데이터 저장
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);	// 23
		tree.add(10);	// 23보다 작으니까 23의 밑왼쪽 저장
		tree.add(48);	// 23보다 크니까 23의 밑오른쪽 저장
		tree.add(15);	// 10보다 크니까 10의 밑오른쪽 저장
		tree.add(7);	// 10보다 작으니까 10의 밑왼쪽 저장
		tree.add(22);	// 15보다 크니까 15의 밑오른쪽 저장
		tree.add(56);	// 48보다 크니까 48의 밑오른쪽 저장
			// 왼쪽에서 오른쪽으로 출력이 되는 구조. tree모양. 그림그려서 이해하셈. 애는 출력이 순서가 있다는거야.
			// 문자로 한다면 A ~ Z 순임.
		
		for(int num : tree) {
			System.out.print(num+", ");
		}
	}
}
