package sub1;

//���� : �ڹ� �迭 ���� �ǽ��ϱ�

public class ArrayTest {

	public static void main(String[] args) {
		
		// ����
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
		
		// �迭
		int nums[] = {1, 2, 3, 4, 5}; // index = [0] ~ [4], length = 5.
		
		// �迭 ���� ���
		System.out.println("�迭 nums�� 1��° ���� : "+nums[0]);
		System.out.println("�迭 nums�� 2��° ���� : "+nums[1]);
		System.out.println("�迭 nums�� 3��° ���� : "+nums[2]);
		System.out.println("�迭 nums�� 4��° ���� : "+nums[3]);
		System.out.println("�迭 nums�� 5��° ���� : "+nums[4]);
		System.out.println();
		
		// for���� Ȱ���� ���
		for(int i=0 ; i<5 ; i++) {
			System.out.println("�迭 nums�� "+(i+1)+"��° ���� : "+nums[i]);
		}
			
		System.out.println();
		
		// �迭�� ���̸� �̿��� for��
		System.out.println("�迭 nums�� ������ ���� : " +nums.length);
		
		for(int i=0 ; i<nums.length ; i++) {
			System.out.println("�迭 nums�� "+(i+1)+"��° ���� : "+nums[i]);
		}
		
		System.out.println();
		
		// Practice for string array 
		String p1 = "�缼��";
		String p2 = "�ڳ���";
		String p3 = "�嵵��";
		String p4 = "������";
		String p5 = "��ȣ��";
		
		String []people = {p1, p2, p3, p4, p5}; // string[] people �ص� ��� ������ ������ ������ �ڿ� []�� �ٰų� �տ� []�� �ٴ� �� �Ϲ���.
		
		// �迭�� �ݺ���
		
		
		for(String person : people) { // people �迭�� �ִ� ���� ':'
			System.out.print(person+ ", "); // �����ͼ� �����ǵ�, ��ȣ���� +�� �����̳� ln�� �ٰ� �Ⱥٰ��� ���̸� �ָ��ض�. �̰� �غ� +���⿡ ���� �ٸ�����
		}
		
		
		
		
		
		
		

	}

}
