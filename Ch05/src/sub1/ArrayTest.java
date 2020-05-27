package sub1;

//내용 : 자바 배열 기초 실습하기

public class ArrayTest {

	public static void main(String[] args) {
		
		// 변수
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
		
		// 배열
		int nums[] = {1, 2, 3, 4, 5}; // index = [0] ~ [4], length = 5.
		
		// 배열 원소 출력
		System.out.println("배열 nums의 1번째 원소 : "+nums[0]);
		System.out.println("배열 nums의 2번째 원소 : "+nums[1]);
		System.out.println("배열 nums의 3번째 원소 : "+nums[2]);
		System.out.println("배열 nums의 4번째 원소 : "+nums[3]);
		System.out.println("배열 nums의 5번째 원소 : "+nums[4]);
		System.out.println();
		
		// for문을 활용한 출력
		for(int i=0 ; i<5 ; i++) {
			System.out.println("배열 nums의 "+(i+1)+"번째 원소 : "+nums[i]);
		}
			
		System.out.println();
		
		// 배열의 길이를 이용한 for문
		System.out.println("배열 nums의 원소의 갯수 : " +nums.length);
		
		for(int i=0 ; i<nums.length ; i++) {
			System.out.println("배열 nums의 "+(i+1)+"번째 원소 : "+nums[i]);
		}
		
		System.out.println();
		
		// Practice for string array 
		String p1 = "양세형";
		String p2 = "박나래";
		String p3 = "장도연";
		String p4 = "문세윤";
		String p5 = "정호영";
		
		String []people = {p1, p2, p3, p4, p5}; // string[] people 해도 상관 없지만 보통은 변수의 뒤에 []가 붙거나 앞에 []가 붙는 게 일반적.
		
		// 배열의 반복문
		
		
		for(String person : people) { // people 배열에 있는 원소 ':'
			System.out.print(person+ ", "); // 이제와서 알은건데, 괄호안의 +의 방향이나 ln이 붙고 안붙고의 차이를 주목해라. 이거 해봐 +방향에 따라 다르더라
		}
		
		
		
		
		
		
		

	}

}
