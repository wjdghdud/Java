package sub2;

public class Count {

	private int num;
	
	// getter
	public int getNum() {
		return num;
	}

/*
	// ������ setter
	public void setNum() { // synchronized ������ ���� ����ȭ�� �����ϵ��� ��
		num++;
	}	// ��Ƽ������ Ȯ�ο� ���� setter.
*/
	
	// ����ȭ�� �ο��� setter. ����ȭ ��ϼ������� �����尣 ������ ���´�.
	public synchronized void setNum() { // synchronized ������ ���� ����ȭ�� �����ϵ��� ��
		num++;
	}	// ��Ƽ������ Ȯ�ο� ���� setter.
	
/* ----- �̷��� �ص� �� -----

����ȭ ��ϼ������� �����尣 ������ ���´�.

	public  void setNum() { // synchronized ������ ���� ����ȭ�� �����ϵ��� ��
		synchronized(this){
		num++;
		}
	}	// ��Ƽ������ Ȯ�ο� ���� setter.
*/
}
