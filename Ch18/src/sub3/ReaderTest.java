package sub3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 문자 입출력 스트림, 교재 p1032.

public class ReaderTest {
	public static void main(String[] args) {
		
	
	// sub2의 FileInputTest에서 sample 파일을 읽어들이는데 한글이 적용이 안될거야. 이것을 문자 입출력 스트림으로 해결.
	
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
}	// ㅆㅂ 모르겠슴다 안돼요 이거
