package sub1;

// 내용 : 다차원 배열

public class MultiArrayTest {
	
	public static void main(String[] args) {
		
		// ●1차원. 선형구조. 1자
		int[] scores = {80, 60, 78, 62, 92}; // 단수형이 아닌 복수형(~es, s)으로 표기해야 하는 룰이 있음.
		int sum = 0;
		
		for(int n=0 ; n<scores.length ; n++) {
			sum += scores[n]; // sum이 초기화가 되어 있어야 됨. 위에서 int sum;만 했다가 오류나서 안됐음.
		}
		
		System.out.println("배열 scores의 총합 : " +sum);
		
//		배열의 반복문으로 표현 : for(int score : scores) {sum += score} System.out.println(score+ "");
		
		System.out.println();
		
		
		
		
		
		// ●2차원. 2차원 구조. 직교좌표계에서의 (x,y), 행과 열.
		int arr2d[][] = { {1,  2,  3,  4},
						  {5,  6,  7,  8},
						  {9, 10, 11, 12} }; // 행을 중괄호로 한 번 더 해서 표현해줘
		
/*개노가다 출력
		System.out.println("배열 arr2d의 1행 1열 원소 : " +arr2d[0][0]);
		System.out.println("배열 arr2d의 1행 2열 원소 : " +arr2d[0][1]);
		System.out.println("배열 arr2d의 1행 3열 원소 : " +arr2d[0][2]);
		System.out.println("배열 arr2d의 1행 4열 원소 : " +arr2d[0][3]);
		
		System.out.println("배열 arr2d의 2행 1열 원소 : " +arr2d[1][0]);
		System.out.println("배열 arr2d의 2행 2열 원소 : " +arr2d[1][1]);
		System.out.println("배열 arr2d의 2행 3열 원소 : " +arr2d[1][2]);
		System.out.println("배열 arr2d의 2행 4열 원소 : " +arr2d[1][3]);
		
		System.out.println("배열 arr2d의 3행 1열 원소 : " +arr2d[2][0]);
		System.out.println("배열 arr2d의 3행 2열 원소 : " +arr2d[2][1]);
		System.out.println("배열 arr2d의 3행 3열 원소 : " +arr2d[2][2]);
		System.out.println("배열 arr2d의 3행 4열 원소 : " +arr2d[2][3]);
*/
		
		// 2 중 for문을 활용한 출력
		for(int a=0 ; a<arr2d.length ;a++) { // arr2d.length = 3. 크게 봐야 함. 이건 행의 갯수를 count
			for(int b=0 ; b<arr2d[a].length ; b++) { // arr2d[a].length = 4. 행에서 열의 갯수.

				System.out.println("배열 arr2d의 " + (a+1) + "행 " + (b+1) + "열 원소" +arr2d[a][b]);
				
			}
		}
		
		System.out.println();
			
		
		// ●3차원. 3차원 구조. 직교좌표상에서, (z, x, y)로 이해하고, x축과 y축(2차원 단면)에서 z축이 면과 면을 구분하는 number로 이해하면 편함.
		int arr3d[][][] = { {{1,   2,  3},
							{4,   5,  6},
							{7,   8,  9},
							{10, 11, 12}},
						   {{13, 14, 15},
							{16, 17, 18},
							{19, 20, 21},
							{22, 23, 24}},
						   {{25, 26, 27},
							{28, 29, 30},
							{31, 32, 33},
							{34, 35, 36}} }; // 3개의 면, 4개의 행, 3개의 열.
		
		// 3중 for문을 활용한 출력
		for(int i=0 ; i<arr3d.length ; i++) {
			
			for(int j=0 ; j<arr3d[i].length ; j++) {
				
				for(int k=0 ; k<arr3d[i][j].length ; k++) {
					
					System.out.println("배열 arr3d의 " + (i+1) + "면 " + (j+1) + "행" + (k+1) + "열 원소"+arr3d[i][j][k]);
				}
			}
		}

		
	}
}
