package sub3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// ���� ����� ��Ʈ��, ���� p1032.

public class ReaderTest {
	public static void main(String[] args) {
		
	
	// sub2�� FileInputTest���� sample ������ �о���̴µ� �ѱ��� ������ �ȵɰž�. �̰��� ���� ����� ��Ʈ������ �ذ�.
	
	String file = "C:\\Users\\bigdata\\Desktop\\Sample.txt";
	
	try {
		FileReader fr = new FileReader(file);
		
		int value = 0;
		
		while(true) {
			value = fr.read();
			
			if(value == -1) {
				break;
			}
		}
		char c = (char) value;
		
		System.out.println((char)c);
		
		fr.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}	// ���� �𸣰ڽ��� �ȵſ� �̰�
