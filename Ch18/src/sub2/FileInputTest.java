package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 내용 : 파일 입출력, 교재 p1018.

public class FileInputTest {
	public static void main(String[] args){
		
		String file = "C:\\Users\\bigdata\\Desktop\\Sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(file); // 14번째 줄, 빨간 밑줄, Add throws 클릭
			int value = 0;
			
			while(true) {
				
				value = fis.read(); // 읽어들이는 메서드, 위에서 만든 value를 여기에 할당
					// 여기에서 발생하는 또 다른 예외처리가 있다. 그것을 38~40 번째 줄에 또 catch문을 만듦. 근데 이것을 통합 Exception으로 무마함.
				if(value == -1) {	// value == -1 : 읽어들일 데이터가 없을 경우
					// 더이상 읽어들일 데이터가 없을 경우
					break;
				}
				char c = (char) value;	// 이것으로 10진수 출력을 char형으로 바꿔줌
				System.out.println(c);	// 하나씩 읽어들임.
			}
			
			// 입력스트림 해제
			fis.close(); // 이거 닫아주는 이유 : 당연히 연결을 해줬으면 닫아줘야지ㅋㅋㅋ
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		/* catch (FileNotFoundException e) {
			e.printStackTrace();
		} // 예외처리하는 이유 : 파일이 해당 위치에 없을 수도 있으니까. NotFound라 하잖아.
		catch(IOException e) {
			e.printStackTrace();
		} */
		System.out.println("프로그램 종료...");
	}
}
