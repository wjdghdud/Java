package sub1;

// ���� : ������ �迭

public class MultiArrayTest {
	
	public static void main(String[] args) {
		
		// ��1����. ��������. 1��
		int[] scores = {80, 60, 78, 62, 92}; // �ܼ����� �ƴ� ������(~es, s)���� ǥ���ؾ� �ϴ� ���� ����.
		int sum = 0;
		
		for(int n=0 ; n<scores.length ; n++) {
			sum += scores[n]; // sum�� �ʱ�ȭ�� �Ǿ� �־�� ��. ������ int sum;�� �ߴٰ� �������� �ȵ���.
		}
		
		System.out.println("�迭 scores�� ���� : " +sum);
		
//		�迭�� �ݺ������� ǥ�� : for(int score : scores) {sum += score} System.out.println(score+ "");
		
		System.out.println();
		
		
		
		
		
		// ��2����. 2���� ����. ������ǥ�迡���� (x,y), ��� ��.
		int arr2d[][] = { {1,  2,  3,  4},
						  {5,  6,  7,  8},
						  {9, 10, 11, 12} }; // ���� �߰�ȣ�� �� �� �� �ؼ� ǥ������
		
/*���밡�� ���
		System.out.println("�迭 arr2d�� 1�� 1�� ���� : " +arr2d[0][0]);
		System.out.println("�迭 arr2d�� 1�� 2�� ���� : " +arr2d[0][1]);
		System.out.println("�迭 arr2d�� 1�� 3�� ���� : " +arr2d[0][2]);
		System.out.println("�迭 arr2d�� 1�� 4�� ���� : " +arr2d[0][3]);
		
		System.out.println("�迭 arr2d�� 2�� 1�� ���� : " +arr2d[1][0]);
		System.out.println("�迭 arr2d�� 2�� 2�� ���� : " +arr2d[1][1]);
		System.out.println("�迭 arr2d�� 2�� 3�� ���� : " +arr2d[1][2]);
		System.out.println("�迭 arr2d�� 2�� 4�� ���� : " +arr2d[1][3]);
		
		System.out.println("�迭 arr2d�� 3�� 1�� ���� : " +arr2d[2][0]);
		System.out.println("�迭 arr2d�� 3�� 2�� ���� : " +arr2d[2][1]);
		System.out.println("�迭 arr2d�� 3�� 3�� ���� : " +arr2d[2][2]);
		System.out.println("�迭 arr2d�� 3�� 4�� ���� : " +arr2d[2][3]);
*/
		
		// 2 �� for���� Ȱ���� ���
		for(int a=0 ; a<arr2d.length ;a++) { // arr2d.length = 3. ũ�� ���� ��. �̰� ���� ������ count
			for(int b=0 ; b<arr2d[a].length ; b++) { // arr2d[a].length = 4. �࿡�� ���� ����.

				System.out.println("�迭 arr2d�� " + (a+1) + "�� " + (b+1) + "�� ����" +arr2d[a][b]);
				
			}
		}
		
		System.out.println();
			
		
		// ��3����. 3���� ����. ������ǥ�󿡼�, (z, x, y)�� �����ϰ�, x��� y��(2���� �ܸ�)���� z���� ��� ���� �����ϴ� number�� �����ϸ� ����.
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
							{34, 35, 36}} }; // 3���� ��, 4���� ��, 3���� ��.
		
		// 3�� for���� Ȱ���� ���
		for(int i=0 ; i<arr3d.length ; i++) {
			
			for(int j=0 ; j<arr3d[i].length ; j++) {
				
				for(int k=0 ; k<arr3d[i][j].length ; k++) {
					
					System.out.println("�迭 arr3d�� " + (i+1) + "�� " + (j+1) + "��" + (k+1) + "�� ����"+arr3d[i][j][k]);
				}
			}
		}

		
	}
}
