package p46;

/*
 - note -
��ġ�� ū�����͸� �ٷ�� ���α׷������� long Ÿ���� �ʼ������� ���ȴ�.
*/


public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; // ������ ����. int type�� ���� ������ �Ѿ�� ���� ���ͷ��� 'L'�� ������ �ʾұ� ������ error.
		long var4 = 1000000000000L;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var4 : " + var4);
	}
}
