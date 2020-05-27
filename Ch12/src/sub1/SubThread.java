package sub1;

public class SubThread extends Thread{ // thread�� ��ӹ���
	
	private String name;
	
	// ������
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override // run ġ�� ��Ʈ�� + �����̽���. �����忡 ���ǵ� �� �޼��带 ��
	public void run() {
		
		for(int i=1 ; i<=10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	// ������ try catch �ۿ� �ȵ�. �ֳ��ϸ� Thread�� ����� �޴� ������ Ŭ������ �������̵�Ǵ� run �޼����� ���¸� �ٲپ� throws 
				// ������ �ϰ� �Ǹ� �������̵� �޼��尡 �ƴϰ� �Ǳ� �����̴�. ����� throws������ �ϰ�ʹٸ� �ٷ� ���� �ִ� run �޼��忡 throws ������ �ؾ� �Ѵ�.
			System.out.println(name+"������ ����...");
		}
		System.out.println(name+"������ ����...");
	}
}
