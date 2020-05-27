package sub2;

/*
 * 날짜 : 2020.05.04
 * 내용 : 반복문 while 실습하기.
 * 
 */


public class WhileTest {
	public static void main(String[] args) {
		
		// ● while, 1부터 10까지 합
		// 기본 형태 : while(조건식){작동}
		int sum = 0;
		int k = 1;
		
		while( k <= 10) { // (조건식)이 참일 때 { 작동 }함
			sum += k; // 이 코드만 실행하면 무한 루프임.
			k++; // 얘를 넣어줘야 함.
		}
		System.out.println("1부터 10까지 합 : "+sum);
		
		
		// ●do ~ while. 일단은 한다(do). 그리고 판단(while)
		// 기본 형태 : do {}while();
		int eSum = 0;
		int i = 1;
		
		do {
			if(i % 2 == 0) {
				eSum += i;
			}
			i++;
		}
		while(i <= 10);
		
		System.out.println("1부터 10까지 짝수 합 : "+eSum);
		
		
		// ●break
		int num = 0;
		
		while(true) { // (true)만 하게 되면 무한roof. 그래서 if를 활용하여 break를 사용함.
			
			num ++;
			
			if(num%5 == 0 && num%7 == 0) {
				break; // 반복문 탈출.
			}
			
		}
		System.out.println("5와 7의 최소공배수 : " +num);
		
		
		// ●continue
		int total = 0;
		
		for(int j = 1 ; j <= 10 ; j++) {
			
			if(j%2 == 1) {
				continue; // 조건을 충족하는 경우 continue. 즉 말그대로 다시 되돌아가서 for문의 처음부터 시작함. 조건 충족하지 못하면 그냥 죽 내려감.
			}
			
			total += j;
			
			System.out.println("1부터 10까지 짝수합 : " +total);
			
		}
	}
}
