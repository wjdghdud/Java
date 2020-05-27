package sub3;

import java.util.Scanner; 
// 입력기능을 가지고 있는 클래스를 포함시키는 문장. 스캐너 객체생성문 전체 드래그 + ctrl + shift + o를 입력하면 알아서 생성됨.

// 내용 : 제어문(조건문. if, switch), 루프문(반복문. for, while), 시스템 입력 복습

/*
     ------제어문------
     
● 1. [if]

기본 형태 : 
 - if (조건식) { A }
  : 가장 단순하게 if만 사용. (조건식)을 만족(true)하면 A를 실행함. false일 때 아무런 출력을 하지 않음. 
  
 - if (조건식) { A } else { B }
  :  (조건식)을 만족하면 A를 실행하지만 (조건식)을 만족하지 못하면 B를 실행함. else = 다른.
  
 - if (조건식) { A } else if (조건식) { B } ~ ~ ~ else { C }
  : if else if를 계속해서 반복할 수 있음. (조건식)을 만족하면 A를 실행하지만 만족하지 못한다면 
  else if (조건식)으로 이동하여 다시 true와 false를 판단하고, 참이면 B를 실행하고 그것마저 false라면 끝의 else의 C를 실행함. 



● 2. [switch]

switch (변수 또는 조건식) {
case 비교값 :
 	처리내용
  break;
case 비교값 :
	처리내용
  break;
default :
	처리내용
  break; 
}
 : 기본 동작 원리는 (변수 또는 조건식)의 값을 대상으로 비교값이 맞는지 판단을 하고, 그 비교값에 부합한다면 처리내용에 따라 처리되며
 그렇게 하지 못할 경우, 하위의 case 문으로 계속해서 이동한다. 이때 break;를 사용하여 비교값에 부합하는 case문의 처리내용만 실행할 수 있도록
 하며, break;를 사용하지 않으면 계속해서 하위의 case문으로 이동을 하여 처리내용을 계속해서 동작하게 된다.
 마지막의 default는 마치 if else 문에서의 else와 같은 역할로, 그 어떠한 case의 비교값에도 부합하지 않는 경우, default의 처리내용을
 따르도록 한다.



     ------루프문------
     
● 1. [for]

기본 형태 : for(데이타형 초기값 ; 조건식 ; 증감식) { 처리내용 }


- for(int i=0; i<10 ; i++) {
	처리내용
}
- break : 루프문을 빠져나온다.
- continue : 루프문의 처음으로 간다.
 : 괄호 안에 초기값, 조건식, 증감식이 모두 있어서 { } 안에는 그냥 동작을 기술하면 된다.


● 2. [while]
 : 조건식이 참일 동안 루프를 돈다.

 - while문
   기본형태 : while(조건식){처리내용}
   : 괄호 안에는 조건식만 기입할 수 있으며, 처리 내용 안에서 증감식과 같은 것이 필요하고 변수를 따로 선언하여 초기값까지 지정해야 한다.
   
ex)

while (i <= 10) {
  System.out.printn(i);
  i++;
}
  
 - do ~ while문
   기본형태 : do { 처리내용 } while(조건식);
   : 우선 뜻 그대로, do -> 처리내용. 처리내용을 먼저 실행하고  (조건식)이 일치한다면 다시 처리내용을 반복한다.



     ------시스템 입력------
기본적으로 Java의 I/O에서 Out은 system.out으로 바로바로 출력문을 작성할 수 있다.
하지만 반대로 System.in이라는 입력 기능을 사용할 수는 있는데 그러기 전에 scanner라는 class를 생성하여
그 scanner class 안에 입력받겠다는 System.in이라는 것을 전달해주어야 한다(밑의 scanner 객체생성 확인).

scanner 객체 생성 : Scanner scanner = new Scanner(System.in);

그리고 저 객체 생성문 전체 드래그하고 ctrl + shift + o를 입력하면 맨 위에
import java.util.Scanner;가 생성된다.


1. String 변수 = scanner.next(); // 공백을 포함하지 않는 문자열을 입력받음.

2. String 변수 = scanner.nextLine(); // 공백을 포함하는 문자열을 입력받음.

3. int 변수 = scanner.nextInt(); // 정수형을 입력받음.

4. double 변수 = scanner.nextDouble(); // 실수형을 입력받음.

입력받은 값 출력하기 : System.out.println("입력 확인 : "+ 변수);

사용을 모두 하고 스캐너를 종료해주는 것이 좋다.
scanner 종료 : scanner.close();


*/


public class review {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner 객체 선언
		
		// -- scanner 실습 --
		
		System.out.println("--- scanner 실습 ---");
		System.out.println("이름이 머고 : ");
		String name = scanner.next(); // nextLine으로 하면 안되는데 왜 그러는지는 모르겠음..	
		
		System.out.println("맻사리고 : ");
		int age = scanner.nextInt();
		
		System.out.println("난 " + name + "이다." + age + "살이야.");
		System.out.println();
		
		
		// -- if else if 실습 --
		
		System.out.println("--- if else if 실습 ---");
		System.out.println("이번 시험 맻점이고 : ");
		int score = scanner.nextInt();
		
		if(score < 60) {
			System.out.println("개ㅆㅂ F다");
		}else if(score < 70) {
			System.out.println("ㅆㅂ D다");
		}else if(score < 80) {
			System.out.println("ㅁㅊ C네");
		}else if(score < 90) {
			System.out.println("ㅡㅡ B다");
		}else if(score < 95) {
			System.out.println("하. A네");
		}else if(score < 100) {
			System.out.println("ㅇㅋ A+.");
		}
		System.out.println();
		
		
		// -- switch 실습 --
		System.out.println("switch 실습");
		System.out.println("맻점이고 : ");
		int scoreSwitch = scanner.nextInt();
		
		int scorecase = scoreSwitch / 10;
		
		switch (scorecase) {
		case 9:
			System.out.println("A");
			break;
		
		case 8:
			System.out.println("B");
			break;
		
		case 7:
			System.out.println("C");
			break;
			
		default : 
			System.out.println("F");
		}
		System.out.println();
		
		
		// -- for 실습 --
		System.out.println("for 실습");
		
		int evensum = 0;
		for(int j = 0 ; j <= 10 ; j++) {
			if(j % 2 == 0) {
				evensum += j;
			}
		}
		System.out.println("1부터 10까지 짝수 합 : " + evensum);
		
		System.out.println();
		
		
		// -- do ~ while 실습 --
		System.out.println("do ~ while 실습");
		int oddsum = 0;
		int i = 0;
		
		do {
			if(i % 2 != 0) {
				oddsum += i;
			}
			i ++;
		}
		while(i <= 10);
		System.out.println("1부터 10까지의 홀수합 : " + oddsum);
		
		
		
		

	}
}
