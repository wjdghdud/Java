package sub1;

import java.util.ArrayList;
import java.util.List;

// 내용 : 컬렉션 프레임워크 실습, 교재 p724

public class ListTest {
	public static void main(String[] args) {
		
		// ※ 리스트 생성 및 숫자 데이터 저장
//		ArrayList<E> // 어레이 리스트에 저장이 될 '객체'의 타입(E)이 무엇이니?
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
			// interface는 코드를 유연하게 완화시켜줌. 그래서 List로 선언해주자??? 먼솔
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);	// 0 위치부터 오른쪽으로 1 ~ 5 할당(1, 2, 3, 4, 5)
		list1.remove(2);// 2번원소 위치의 객체를 삭제(1, 2, 4, 5)
		list1.add(0, 3);// 0번 원소의 위치의 객체에 3 할당(3, 1, 2, 4, 5)
		
		for(int i=0 ; i<list1.size() ; i++) {
			System.out.println("list1의 "+ (i+1) +"번째 원소 : "+list1.get(i));
		}
		
		
		// ※ 리스트 생성 및 문자열 데이터 저장
		List<String> list2 = new ArrayList();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
		System.out.println(list2.get(4));
		
		// ※ 리스트 생성 및 사과 데이터를 저장
//		Apple a1 = new Apple("한국", 3000);
//		Apple a2 = new Apple("일본", 2000);
//		Apple a3 = new Apple("대만", 4000);
		
		List<Apple> list3 = new ArrayList<Apple>();
//		list3.add(a1);
//		list3.add(a2);
//		list3.add(a3);
		
		list3.add(new Apple("한국", 3000));
		list3.add(new Apple ("일본", 2000));
		list3.add(new Apple("대만", 4000)); // 이런식으로 한 줄에 바로 정의
		
		// 한국사과 출력
		Apple a1 = list3.get(0);
		a1.show();
		
		// 일본사과 출력
		list3.get(1).show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
