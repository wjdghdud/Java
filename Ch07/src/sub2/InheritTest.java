package sub2;
/*
 * ��¥ : 2020/05/012
 * �̸� : ��¹�
 * ���� : Ŭ���� ��� �ǽ��ϱ�
 */
public class InheritTest {
	
	public static void main(String[] args) {
		
		SalaryStudent kim = new SalaryStudent("������", 31, "�ΰ��", "�濵��", "Samsung");
		Student lee = new Student("�̼���", 125, "�λ��", "������");
		
		kim.hello();
		lee.hello();
		
	}	
}

