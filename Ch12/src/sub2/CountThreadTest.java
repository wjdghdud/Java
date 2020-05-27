package sub2;

// ���� : ������ Ȱ��, ���� p576.

public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);

		// ����� ���Ͻ����� ����
//		ct1.run();
//		ct2.run();		
//		ct3.run();
		
		
/*
		ct1.start();
		ct2.start();
		ct3.start();	// run ��ü�� �ּ�ó���ϰ� �̰� start�� �� �غ�. ��°��� �õ��� �� ���� �� �ٸ���, start method�� �����Ǵµ����ε� �װŶ��� 
						// ���� ������� �ٷ� ������� �������°ž�. ��Ƽ�������̱� �����̰ŵ�.main thread�� ���� �Ű�Ƚ�. �׳� �帧�� ���� �������°Ű� 
						// �� ���� ��Ƽ start ������� �׳� �����ϰ�� �ִ°ž�. main thread�� ������ ����� ����ϱ� ���� �̳༮���� �� ������ ��������� ��ٸ��� ������,
						// �������� �����尡 ��� ������ ������ �շ�(join)��Ű�� ����� �ִ�.
*/
		

		ct1.start();
		ct2.start();
		ct3.start();

		// ���ξ����忡�� �Ļ��� ���꽺������ �۾��� �Ϸ�� ��, �ٽ� ���ξ������ �շ��Ǵ� ���� ����.
		ct1.join(); // ���� ���ٶ��ٵ� �ű⿡ Ŀ���÷��� throws���� ��Ű�簡 Ʈ����-ĳġ ���簡 �ϼ�. �ٵ� �̷��� �ȵǱ�� ��. 
		ct2.join();	// �ƹ����� ���ÿ�(����)������ �Ǵ� ���ϱ� �̰� �� ���� �׷�. ���� ��ü�� Count ��ü�� num�� ��� ++�Ǵ°ǵ�
		ct3.join();	// ���⼭ ���� ������ start�� ���ÿ� setNum�� �ߵ���Ű�� +1�� �Ǵ°ž�. �̰��� �ذ��ϴ� ����� ����ȭ�� ��Ű�� ����� �ִ�.
					// ����ȭ�� ��Ű�� ���� Count class�� ������ setter���� �������ش�(Count class, ����ȭ�� �ο��� setter �޼��� ����).
					// �����带 �ϳ����� �������� �ϰ� ��! synchronized ������ ���ָ� ��

		System.out.println("��� : "+count.getNum());
	}
}

/* ------ �����ϱ� ------






*/