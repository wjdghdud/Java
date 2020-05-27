package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// ���� : BufferIO, ����p1018

public class BufferIOTest {
	public static void main(String[] args) throws Exception {

		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\targetbuffer.jpg"; 
		
		// �⺻ ��������� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		// ���۽�Ʈ�� ���� �� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {	//��� �о���̱� ���� while�� ��� ��.
			// InputStream���� ������ �о���̱�
			value = bis.read();
			
			if(value == -1) {
				break;
			}
			// OutputStream���� ������ ��������
			bos.write(value);
		}
		
/*		�̷��� �ϸ� ������ ��. ������ �߿���.

 		// ��Ʈ�� ����
		fis.close();
		fos.close();
		
		// ���� ��Ʈ�� ����(����� �ڿ� �ݳ�)
		bis.close();
		bos.close();
*/
		
		// ��Ʈ�� ����
		bis.close();
		bos.close();
		
		// ���� ��Ʈ�� ����(����� �ڿ� �ݳ�)
		fis.close();
		fos.close();
		
		System.out.println("���α׷� ����...");
	}
}
