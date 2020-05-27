package sub3;

import java.util.Scanner; 
// �Է±���� ������ �ִ� Ŭ������ ���Խ�Ű�� ����. ��ĳ�� ��ü������ ��ü �巡�� + ctrl + shift + o�� �Է��ϸ� �˾Ƽ� ������.

// ���� : ���(���ǹ�. if, switch), ������(�ݺ���. for, while), �ý��� �Է� ����

/*
     ------���------
     
�� 1. [if]

�⺻ ���� : 
 - if (���ǽ�) { A }
  : ���� �ܼ��ϰ� if�� ���. (���ǽ�)�� ����(true)�ϸ� A�� ������. false�� �� �ƹ��� ����� ���� ����. 
  
 - if (���ǽ�) { A } else { B }
  :  (���ǽ�)�� �����ϸ� A�� ���������� (���ǽ�)�� �������� ���ϸ� B�� ������. else = �ٸ�.
  
 - if (���ǽ�) { A } else if (���ǽ�) { B } ~ ~ ~ else { C }
  : if else if�� ����ؼ� �ݺ��� �� ����. (���ǽ�)�� �����ϸ� A�� ���������� �������� ���Ѵٸ� 
  else if (���ǽ�)���� �̵��Ͽ� �ٽ� true�� false�� �Ǵ��ϰ�, ���̸� B�� �����ϰ� �װ͸��� false��� ���� else�� C�� ������. 



�� 2. [switch]

switch (���� �Ǵ� ���ǽ�) {
case �񱳰� :
 	ó������
  break;
case �񱳰� :
	ó������
  break;
default :
	ó������
  break; 
}
 : �⺻ ���� ������ (���� �Ǵ� ���ǽ�)�� ���� ������� �񱳰��� �´��� �Ǵ��� �ϰ�, �� �񱳰��� �����Ѵٸ� ó�����뿡 ���� ó���Ǹ�
 �׷��� ���� ���� ���, ������ case ������ ����ؼ� �̵��Ѵ�. �̶� break;�� ����Ͽ� �񱳰��� �����ϴ� case���� ó�����븸 ������ �� �ֵ���
 �ϸ�, break;�� ������� ������ ����ؼ� ������ case������ �̵��� �Ͽ� ó�������� ����ؼ� �����ϰ� �ȴ�.
 �������� default�� ��ġ if else �������� else�� ���� ���ҷ�, �� ��� case�� �񱳰����� �������� �ʴ� ���, default�� ó��������
 �������� �Ѵ�.



     ------������------
     
�� 1. [for]

�⺻ ���� : for(����Ÿ�� �ʱⰪ ; ���ǽ� ; ������) { ó������ }


- for(int i=0; i<10 ; i++) {
	ó������
}
- break : �������� �������´�.
- continue : �������� ó������ ����.
 : ��ȣ �ȿ� �ʱⰪ, ���ǽ�, �������� ��� �־ { } �ȿ��� �׳� ������ ����ϸ� �ȴ�.


�� 2. [while]
 : ���ǽ��� ���� ���� ������ ����.

 - while��
   �⺻���� : while(���ǽ�){ó������}
   : ��ȣ �ȿ��� ���ǽĸ� ������ �� ������, ó�� ���� �ȿ��� �����İ� ���� ���� �ʿ��ϰ� ������ ���� �����Ͽ� �ʱⰪ���� �����ؾ� �Ѵ�.
   
ex)

while (i <= 10) {
  System.out.printn(i);
  i++;
}
  
 - do ~ while��
   �⺻���� : do { ó������ } while(���ǽ�);
   : �켱 �� �״��, do -> ó������. ó�������� ���� �����ϰ�  (���ǽ�)�� ��ġ�Ѵٸ� �ٽ� ó�������� �ݺ��Ѵ�.



     ------�ý��� �Է�------
�⺻������ Java�� I/O���� Out�� system.out���� �ٷιٷ� ��¹��� �ۼ��� �� �ִ�.
������ �ݴ�� System.in�̶�� �Է� ����� ����� ���� �ִµ� �׷��� ���� scanner��� class�� �����Ͽ�
�� scanner class �ȿ� �Է¹ްڴٴ� System.in�̶�� ���� �������־�� �Ѵ�(���� scanner ��ü���� Ȯ��).

scanner ��ü ���� : Scanner scanner = new Scanner(System.in);

�׸��� �� ��ü ������ ��ü �巡���ϰ� ctrl + shift + o�� �Է��ϸ� �� ����
import java.util.Scanner;�� �����ȴ�.


1. String ���� = scanner.next(); // ������ �������� �ʴ� ���ڿ��� �Է¹���.

2. String ���� = scanner.nextLine(); // ������ �����ϴ� ���ڿ��� �Է¹���.

3. int ���� = scanner.nextInt(); // �������� �Է¹���.

4. double ���� = scanner.nextDouble(); // �Ǽ����� �Է¹���.

�Է¹��� �� ����ϱ� : System.out.println("�Է� Ȯ�� : "+ ����);

����� ��� �ϰ� ��ĳ�ʸ� �������ִ� ���� ����.
scanner ���� : scanner.close();


*/


public class review {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner ��ü ����
		
		// -- scanner �ǽ� --
		
		System.out.println("--- scanner �ǽ� ---");
		System.out.println("�̸��� �Ӱ� : ");
		String name = scanner.next(); // nextLine���� �ϸ� �ȵǴµ� �� �׷������� �𸣰���..	
		
		System.out.println("���縮�� : ");
		int age = scanner.nextInt();
		
		System.out.println("�� " + name + "�̴�." + age + "���̾�.");
		System.out.println();
		
		
		// -- if else if �ǽ� --
		
		System.out.println("--- if else if �ǽ� ---");
		System.out.println("�̹� ���� �����̰� : ");
		int score = scanner.nextInt();
		
		if(score < 60) {
			System.out.println("������ F��");
		}else if(score < 70) {
			System.out.println("���� D��");
		}else if(score < 80) {
			System.out.println("���� C��");
		}else if(score < 90) {
			System.out.println("�Ѥ� B��");
		}else if(score < 95) {
			System.out.println("��. A��");
		}else if(score < 100) {
			System.out.println("���� A+.");
		}
		System.out.println();
		
		
		// -- switch �ǽ� --
		System.out.println("switch �ǽ�");
		System.out.println("�����̰� : ");
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
		
		
		// -- for �ǽ� --
		System.out.println("for �ǽ�");
		
		int evensum = 0;
		for(int j = 0 ; j <= 10 ; j++) {
			if(j % 2 == 0) {
				evensum += j;
			}
		}
		System.out.println("1���� 10���� ¦�� �� : " + evensum);
		
		System.out.println();
		
		
		// -- do ~ while �ǽ� --
		System.out.println("do ~ while �ǽ�");
		int oddsum = 0;
		int i = 0;
		
		do {
			if(i % 2 != 0) {
				oddsum += i;
			}
			i ++;
		}
		while(i <= 10);
		System.out.println("1���� 10������ Ȧ���� : " + oddsum);
		
		
		
		

	}
}
