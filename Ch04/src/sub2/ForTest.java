package sub2;

/*
 * ��¥ : 2020/05/01
 * �̸� : ��¹�
 * ���� : �ݺ��� for �ǽ��ϱ� 
 */



public class ForTest {
	
	
	public static void main(String[] args) {
	
		// for
		
		for(int i = 1;i<=10;i++){
			System.out.println("Hello Java!");
		}
		
		
		
		
		// 1���� 10���� ��
		int sum = 0;
		
		
		for(int j = 1; j<=10; j++) {
			sum += j;
		}
		
		System.out.println("1���� 10������ : "+sum);
		
		
		
		// 1���� 10���� ¦����
		int k = 0;
		
		for(int x = 1; x<=10; x++) {
			if(x%2 == 0) {
				k += x;
			}
			
		}
		System.out.println("1���� 10���� ¦���� : "+k);
		
		
		
		
		
		
		// ���� for��
		for(int a = 1; a<=3; a++) {
			
			System.out.println("a : "+a);
			
			for(int b=1; b<=5; b++) {
				System.out.println("b : "+b);
			}
		}
		
		
		
		
		
		// ������
		for(int t = 2; t<=9; t++){
			System.out.println(t+" ��");
			for(int l=1; l<=9; l++)
			{
				int m = t * l;
				System.out.println(t+ " x "+l+ "=" +m);
			}
		}
		
		
		
		// �� �ﰢ�� I
		for(int n = 1; n <= 5; n++)
		{
			for(int o = 1; o<=n; o++) {
				System.out.print("��");
			}
			System.out.print("\n");
		}
		
		
		
		// �� �ﰢ�� II
		for(int v = 5; v >= 1; v--)
		{
			for(int c = 1; c<=v; c++) {
				System.out.print("��");
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
				System.out.print("��");
			}
			for(int u = 16; u<=v; u++) {
				System.out.print("��");
			}
			
			System.out.print("\n");
			
		}
	
		
		
	}

}
