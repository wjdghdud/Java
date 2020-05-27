package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 내용 : BufferIO, 교재p1018

public class BufferIOTest {
	public static void main(String[] args) throws Exception {

		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\targetbuffer.jpg"; 
		
		// 기본 파일입출력 스트림 생성
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		// 버퍼스트림 생성 및 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {	//계속 읽어들이기 위해 while문 써야 해.
			// InputStream으로 데이터 읽어들이기
			value = bis.read();
			
			if(value == -1) {
				break;
			}
			// OutputStream으로 데이터 내보내기
			bos.write(value);
		}
		
/*		이렇게 하면 에러가 나. 순서가 중요함.

 		// 스트림 해제
		fis.close();
		fos.close();
		
		// 버퍼 스트림 해제(연결된 자원 반납)
		bis.close();
		bos.close();
*/
		
		// 스트림 해제
		bis.close();
		bos.close();
		
		// 버퍼 스트림 해제(연결된 자원 반납)
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료...");
	}
}
