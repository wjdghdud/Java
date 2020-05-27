package sub3;

import java.util.HashMap;
import java.util.Map;

// 내용 : Map, 교재 p740.

public class MapTest {
	public static void main(String[] args) {
		
		// ※ 맵 생성 및 문자열 데이터 저장
//		Map<K, V> // Map하고 컨트롤 + 스페이스바(이전 array나 set 전부 똑같이)하면 알아서 이렇게 나옴. import도 알아서 생성
		Map<Integer, String> map1 = new HashMap<Integer, String>(); // key값 : Integer, 내용 : String
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		// 전체 데이터 갯수
		System.out.println("map1 데이터 갯수 : "+map1.size());
		
		// 맵 원소 출력
//		map1.get(key) // 기본형태야. key값을 정하라고 함
		String value = map1.get(102);
		System.out.println("map1의 102번 키 값 : "+value);
		
		
		// ※ 맵 생성 및 사과 데이터 저장
		
/*		----- 이게 뭐냐고 왜 이랬다가 저러는거냐 이전에도 이거 있었다 --------
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		Apple a3 = new Apple("일본", 4000);
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(101, a1);
		map2.put(102, a2);
		map2.put(103, a3);
*/
		Map<Integer, Apple> map2 = new HashMap<>();
		
		map2.put(101, new Apple("한국", 3000));
		map2.put(102, new Apple("한국", 3000));
		map2.put(103, new Apple("한국", 3000));
		
		// 한국사과 출력
		Apple korApple = map2.get(101);
		korApple.show();
		
		// 미국사과 출력
		map2.get(102).show();
		
		
		
		
		
		
		
		
		
		
		
	}
}
