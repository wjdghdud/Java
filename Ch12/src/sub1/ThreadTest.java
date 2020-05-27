package sub1;

// ���� : ������(Thread, ��), ���� p576

/* ------ Thread ------ 
������� ��ġ �̾߱��� �帧�� ��, ���α׷��� ���� �帧�̴�.

	- �ϳ��� ���μ������� ����Ǵ� ���� �帧
	- ���α׷��� ����� �� �����Ǵ� �����帧
	- Thread Ŭ������ ��ӹ޾� start() �޼���� ���꽺���� ����
	
 */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
		
		// �񵿱�(Asyncronize)������� ����. run�̶� start�� ���ε��� �����ض�.
//		sub1.start();
//		sub2.start();
		
		sub1.run(); // run���� �ϸ� ���Ͻ�����
		sub2.run(); // ������ run���� start�� �ٲ㼭�� �غ���. �̰� ��Ƽ������
		
		for(int i=1 ; i<=10 ; i++) {
			
			Thread.sleep(1000); // ���⿡�� try catch�ϵ簡 �ƴϸ� throws���� �ϵ簡. �̰� ���� �����.
			
			System.out.println("Main Thread ����...");
		}
		System.out.println("Main Thread ����...");
	}
}

/* -- ���� --
main �޼��� �ϳ����� ��� ���� ������ �Ǵµ� 
sub1.run();
sub2.run();
�� ���� ���Ͻ�����

sub1.start();
sub2.start();
�϶��� ��Ƽ������

�̴�. ����ؼ� Ȯ���غ��� �ȴ�.
*/
