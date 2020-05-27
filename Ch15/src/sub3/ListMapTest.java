package sub3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sub1.Apple; // 이거하면 Apple 굳이 하나의 sub안에 안만들어도 호출해서 쓰기 가능

// List + Map. 리스트와 맵 컬렉션 응용 실습하기

public class ListMapTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>(); // 이거로 밑에 있는 map 1 ~ 3을 배열화시켜버릴려고 한다. 즉 배열 안에 서류뭉치같은 게 세 개
		
		Map<Integer, Apple> map1 = new HashMap<Integer, Apple>();
		map1.put(101, new Apple("한국", 3000));
		map1.put(102, new Apple("미국", 5000));
		map1.put(103, new Apple("일본", 4000));
		
		Map<Integer, Apple> map2 = new HashMap<Integer, Apple>();
		map2.put(201, new Apple("중국", 3000));
		map2.put(202, new Apple("영국", 5000));
		map2.put(203, new Apple("호주", 4000));
		
		Map<Integer, Apple> map3 = new HashMap<Integer, Apple>();
		map3.put(301, new Apple("대만", 3000));
		map3.put(302, new Apple("홍콩", 5000));
		map3.put(303, new Apple("태국", 4000));
		
		// 리스트에 맵 저장. 이걸로 배열화 완료.
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		// 한국사과 출력
		Map<Integer, Apple> m1 = list.get(0);
		Apple a1 = m1.get(101);
		a1.show();	// 야 이거 흐름 잘 파악해라. 이거로 이전에 이해못한 거 이해 ㅆ가능
		
		// 호주사과 출력
		list.get(1).get(203).show(); // 이것도 가능한갑다.
		
		// 태국사과 출력
		list.get(2).get(303).show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
