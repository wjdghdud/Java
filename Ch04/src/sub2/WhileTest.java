package sub2;

/*
 * ��¥ : 2020.05.04
 * ���� : �ݺ��� while �ǽ��ϱ�.
 * 
 */


public class WhileTest {
	public static void main(String[] args) {
		
		// �� while, 1���� 10���� ��
		// �⺻ ���� : while(���ǽ�){�۵�}
		int sum = 0;
		int k = 1;
		
		while( k <= 10) { // (���ǽ�)�� ���� �� { �۵� }��
			sum += k; // �� �ڵ常 �����ϸ� ���� ������.
			k++; // �긦 �־���� ��.
		}
		System.out.println("1���� 10���� �� : "+sum);
		
		
		// ��do ~ while. �ϴ��� �Ѵ�(do). �׸��� �Ǵ�(while)
		// �⺻ ���� : do {}while();
		int eSum = 0;
		int i = 1;
		
		do {
			if(i % 2 == 0) {
				eSum += i;
			}
			i++;
		}
		while(i <= 10);
		
		System.out.println("1���� 10���� ¦�� �� : "+eSum);
		
		
		// ��break
		int num = 0;
		
		while(true) { // (true)�� �ϰ� �Ǹ� ����roof. �׷��� if�� Ȱ���Ͽ� break�� �����.
			
			num ++;
			
			if(num%5 == 0 && num%7 == 0) {
				break; // �ݺ��� Ż��.
			}
			
		}
		System.out.println("5�� 7�� �ּҰ���� : " +num);
		
		
		// ��continue
		int total = 0;
		
		for(int j = 1 ; j <= 10 ; j++) {
			
			if(j%2 == 1) {
				continue; // ������ �����ϴ� ��� continue. �� ���״�� �ٽ� �ǵ��ư��� for���� ó������ ������. ���� �������� ���ϸ� �׳� �� ������.
			}
			
			total += j;
			
			System.out.println("1���� 10���� ¦���� : " +total);
			
		}
	}
}
