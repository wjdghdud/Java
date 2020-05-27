package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// ���� : ����� �ǽ�

public class FileIOTest {
	public static void main(String[] args) throws Exception {	//�׳� Exception���� ���� ����ó�� ����
		
/*		String originFile = "C:\\Users\\bigdata\\Desktop\\Sample.txt";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.txt"; // console�� �ƴ� ���Ϸ��� ����� ����. �׷��� �̳༮�� �̿��Ұž�. 
		String originFile = "C:\\Users\\bigdata\\Desktop\\rabbit.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";*/
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target1.jpg"; // �̰� ��¥ �����ŵ�? �׷��� ���۸� �̿��Ҳ���. �̰� BufferIOTest ���뿡�� �ٷ��.
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		while(true) {	//��� �о���̱� ���� while�� ��� ��.
			// InputStream���� ������ �о���̱�
			value = fis.read();
			
			if(value == -1) {
				break;
			}
			// OutputStream���� ������ ��������
			fos.write(value);
		}
		
		//��Ʈ�� ����(����� �ڿ� �ݳ�)
				fis.close();
				fos.close();
				
		System.out.println("���α׷� ����...");
	}
}
