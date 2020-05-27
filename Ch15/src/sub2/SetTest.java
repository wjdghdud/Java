package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 내용 : 컬렉션 프레임워크 Set, 교재 p724.

public class SetTest {
	public static void main(String[] args) {

		// ※ 집합 생성 및 실수 데이터 저장
		Set<Double> set = new HashSet<Double>();
		set.add(1.1);
		set.add(2.1);
		set.add(3.1);
		set.add(1.1);	// 중복은 적용이 안된다고 했지?
		set.add(5.1);	// 즉 원소는 네 개. 그리고 배열처럼 순서는 없음.
		
		System.out.println("집합 원소 갯수 : "+set.size());
		// add로 집어넣을 수는 있는데 어떻게 다시 가져올까? 그래서 반복자를 이용한다.
		
		// ※ 반복자를 이용한 집합원소 출력
		Iterator<Double> iter = set.iterator(); // 원소 빼내는 녀석
		
		while(iter.hasNext()) { // hasNext : 다음의 것이 있니?
			System.out.println("원소 : "+iter.next()); // 순서는 없음.
		}
	}
}
