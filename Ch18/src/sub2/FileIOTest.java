package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 내용 : 입출력 실습

public class FileIOTest {
	public static void main(String[] args) throws Exception {	//그냥 Exception으로 통합 예외처리 ㄱㄱ
		
/*		String originFile = "C:\\Users\\bigdata\\Desktop\\Sample.txt";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.txt"; // console이 아닌 파일로의 출력을 원함. 그래서 이녀석을 이용할거야. 
		String originFile = "C:\\Users\\bigdata\\Desktop\\rabbit.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";*/
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target1.jpg"; // 이거 진짜 느리거든? 그래서 버퍼를 이용할꺼야. 이건 BufferIOTest 내용에서 다룰게.
		
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		int value = 0;
		while(true) {	//계속 읽어들이기 위해 while문 써야 해.
			// InputStream으로 데이터 읽어들이기
			value = fis.read();
			
			if(value == -1) {
				break;
			}
			// OutputStream으로 데이터 내보내기
			fos.write(value);
		}
		
		//스트림 해제(연결된 자원 반납)
				fis.close();
				fos.close();
				
		System.out.println("프로그램 종료...");
	}
}
