package sub4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

// ������Ƽ �÷���, ���� p748.

public class PropertyTest {
	public static void main(String[] args) throws Exception {
		
		// �⺻���� ���.
		Properties prop = new Properties(); // map�� ����
		prop.setProperty("101", "����");
		prop.setProperty("102", "����");
		prop.setProperty("103", "�뱸");
		prop.setProperty("104", "�λ�");
		prop.setProperty("105", "����");	// set���� ������ �Է�
		
		System.out.println("101�� ������ : "+prop.getProperty("101"));
		System.out.println("101�� ������ : "+prop.getProperty("104"));	// get���� ������ ���
		
		// ������ ���ؼ� �����͸� �Է¹���.
			// ������ ���� �ƹ��ų�(�޸���) �ϳ� ����� .txt�� .properties�� �ٲ���!! �׸��� eclipse�� �巡���ؼ� �Űܶ�.
			// �״��� �ƹ��ų� ������� �� ���� save as UTF-8 ������
		// ��Ʈ���� ���� ������ �Է�
		String file = "C:\\Users\\bigdata\\Desktop\\country.properties";
		
		FileReader fr = new FileReader(file);
		
		Properties country = new Properties();
		country.load(fr);
		
		System.out.println("101�� ����"+country.getProperty("101"));
		System.out.println("102�� ����"+country.getProperty("102"));
		
	}
}