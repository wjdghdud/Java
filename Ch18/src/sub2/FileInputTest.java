package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ���� : ���� �����, ���� p1018.

public class FileInputTest {
	public static void main(String[] args){
		
		String file = "C:\\Users\\bigdata\\Desktop\\Sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(file); // 14��° ��, ���� ����, Add throws Ŭ��
			int value = 0;
			
			while(true) {
				
				value = fis.read(); // �о���̴� �޼���, ������ ���� value�� ���⿡ �Ҵ�
					// ���⿡�� �߻��ϴ� �� �ٸ� ����ó���� �ִ�. �װ��� 38~40 ��° �ٿ� �� catch���� ����. �ٵ� �̰��� ���� Exception���� ������.
				if(value == -1) {	// value == -1 : �о���� �����Ͱ� ���� ���
					// ���̻� �о���� �����Ͱ� ���� ���
					break;
				}
				char c = (char) value;	// �̰����� 10���� ����� char������ �ٲ���
				System.out.println(c);	// �ϳ��� �о����.
			}
			
			// �Է½�Ʈ�� ����
			fis.close(); // �̰� �ݾ��ִ� ���� : �翬�� ������ �������� �ݾ������������
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		/* catch (FileNotFoundException e) {
			e.printStackTrace();
		} // ����ó���ϴ� ���� : ������ �ش� ��ġ�� ���� ���� �����ϱ�. NotFound�� ���ݾ�.
		catch(IOException e) {
			e.printStackTrace();
		} */
		System.out.println("���α׷� ����...");
	}
}
