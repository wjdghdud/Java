package sub4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

// 프로퍼티 컬렉션, 교재 p748.

public class PropertyTest {
	public static void main(String[] args) throws Exception {
		
		// 기본적인 사용.
		Properties prop = new Properties(); // map과 유사
		prop.setProperty("101", "서울");
		prop.setProperty("102", "대전");
		prop.setProperty("103", "대구");
		prop.setProperty("104", "부산");
		prop.setProperty("105", "문경");	// set으로 데이터 입력
		
		System.out.println("101번 데이터 : "+prop.getProperty("101"));
		System.out.println("101번 데이터 : "+prop.getProperty("104"));	// get으로 데이터 출력
		
		// 파일을 통해서 데이터를 입력받음.
			// 그전에 파일 아무거나(메모장) 하나 만들고 .txt를 .properties로 바꿔줘!! 그리고 eclipse로 드래그해서 옮겨라.
			// 그다음 아무거나 적고싶은 거 적고 save as UTF-8 ㄱㄱㄱ
		// 스트림을 통한 데이터 입력
		String file = "C:\\Users\\bigdata\\Desktop\\country.properties";
		
		FileReader fr = new FileReader(file);
		
		Properties country = new Properties();
		country.load(fr);
		
		System.out.println("101번 나라"+country.getProperty("101"));
		System.out.println("102번 나라"+country.getProperty("102"));
		
	}
}