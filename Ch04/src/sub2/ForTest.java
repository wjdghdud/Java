package sub2;

/*
 * 날짜 : 2020/05/01
 * 이름 : 배승범
 * 제목 : 반복문 for 실습하기 
 */



public class ForTest {
	
	
	public static void main(String[] args) {
	
		// for
		
		for(int i = 1;i<=10;i++){
			System.out.println("Hello Java!");
		}
		
		
		
		
		// 1부터 10까지 합
		int sum = 0;
		
		
		for(int j = 1; j<=10; j++) {
			sum += j;
		}
		
		System.out.println("1부터 10까지합 : "+sum);
		
		
		
		// 1부터 10까지 짝수합
		int k = 0;
		
		for(int x = 1; x<=10; x++) {
			if(x%2 == 0) {
				k += x;
			}
			
		}
		System.out.println("1부터 10까지 짝수합 : "+k);
		
		
		
		
		
		
		// 이중 for문
		for(int a = 1; a<=3; a++) {
			
			System.out.println("a : "+a);
			
			for(int b=1; b<=5; b++) {
				System.out.println("b : "+b);
			}
		}
		
		
		
		
		
		// 구구단
		for(int t = 2; t<=9; t++){
			System.out.println(t+" 단");
			for(int l=1; l<=9; l++)
			{
				int m = t * l;
				System.out.println(t+ " x "+l+ "=" +m);
			}
		}
		
		
		
		// 별 삼각형 I
		for(int n = 1; n <= 5; n++)
		{
			for(int o = 1; o<=n; o++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		
		
		// 별 삼각형 II
		for(int v = 5; v >= 1; v--)
		{
			for(int c = 1; c<=v; c++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		//?
		
		for(int v = 40; v >= 1; v--)
		{			
			for(int z = 0; z<=v; z++) {
				System.out.print(" ");
			}
			for(int c = 15; c<=v; c++) {
				System.out.print("★");
			}
			for(int u = 16; u<=v; u++) {
				System.out.print("●");
			}
			
			System.out.print("\n");
			
		}
	
		
		
	}

}
