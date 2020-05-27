package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaCalcController implements Initializable{

	@FXML private TextField txtDisp;
	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btnPlus;
	@FXML private Button btnMinus;
	@FXML private Button btnMulti;
	@FXML private Button btnDiv;
	@FXML private Button btnEq;
	@FXML private Button btnClear;
	
	private int operator; // ��� ����. �̰Ű��� �ĺ��ϰڵ�. plus~ ������
	private int firstNum; // ���꿡���� ù ��° ���ڸ� ����
	private int secondNum; // ���꿡���� �� ��° ���ڸ� ����
	private boolean isFirst = true;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// ���ǵ� �ڵ鷯�� �̺�Ʈ ��ü�� ����
		btn0.setOnAction(event->btn0Handler());
		btn1.setOnAction(event->btn1Handler());
		btn2.setOnAction(event->btn2Handler());
		btn3.setOnAction(event->btn3Handler());
		btn4.setOnAction(event->btn4Handler());
		btn5.setOnAction(event->btn5Handler());
		btn6.setOnAction(event->btn6Handler());
		btn7.setOnAction(event->btn7Handler());
		btn8.setOnAction(event->btn8Handler());
		btn9.setOnAction(event->btn9Handler());
		btnPlus.setOnAction(event->btnPlusHandler());
		btnMinus.setOnAction(event->btnMinusHandler());
		btnMulti.setOnAction(event->btnMultiHandler());
		btnDiv.setOnAction(event->btnDivHandler());
		btnEq.setOnAction(event->btnEqHandler());
		btnClear.setOnAction(event->btnClearHandler());
		
	} // Initialize end
	
	// ���ո޼���
	public void setNum(int num) {
		if(isFirst) {
		txtDisp.setText(""+num); // txtDisp.setText(""+num); �̰͵� ��. �� ����  String strNum = String.valueOf(num); �̰Ÿ� �����ϰ� ""+ �ٿ��ָ�  ����.
//		firstNum = num; 1���ڸ��� ���길 ����
		isFirst = false;	// �̰����� else�� �ڿ������� �Ѿ.
		}else {
			
			String getNum = txtDisp.getText();	// ���簪(getNum)�� ������ �´�.
			String totNum = getNum + num;		// �ܼ� ���������� �ƴ�. getNum�� string���̰� num�� int���̶� �ϳ��� ����ó�� ��.
			
//			txtDisp.setText(""+num);			���� �̰ſ���
			txtDisp.setText(totNum);			// �ٵ� �̰ŷ� 1���ڸ��� �̻��� ������ ����
//			secondNum = num; 1���ڸ��� ���길 ����
		}
	}
	
	public void setOperator(int operator) {	
		this.operator = operator;
		
		String getNum = txtDisp.getText();
		firstNum = Integer.parseInt(getNum);	// ���ڿ��� ���ڷ� ��ȯ����� ��
		
		isFirst = true;		// �ʱ�ȭ
	}
		
	// �ڵ鷯 ����
	public void btn0Handler(){setNum(0);} 
	public void btn1Handler(){setNum(1);} 
	public void btn2Handler(){setNum(2);} 
	public void btn3Handler(){setNum(3);} 
	public void btn4Handler(){setNum(4);} 
	public void btn5Handler(){setNum(5);} 
	public void btn6Handler(){setNum(6);} 
	public void btn7Handler(){setNum(7);} 
	public void btn8Handler(){setNum(8);} 
	public void btn9Handler(){setNum(9);} 

	public void btnPlusHandler(){
		setOperator(1); // �������� �ĺ��� = operator.
	} 
	public void btnMinusHandler(){
		setOperator(2);
	} 
	public void btnMultiHandler(){
		setOperator(3);
	} 
	public void btnDivHandler(){
		setOperator(4);
	} 
	public void btnEqHandler(){
		
		String getNum = txtDisp.getText();
		secondNum = Integer.parseInt(getNum);
		
		int result = 0;
		switch (operator) {
		case 1:
			result = firstNum + secondNum;
			break;
			
		case 2:
			result = firstNum - secondNum;
			break;
			
		case 3:
			result = firstNum * secondNum;
			break;
			
		case 4:
			result = firstNum / secondNum;
			break;
		}
		txtDisp.setText(""+result); // ""+ �� �Է������ν� string
	}
	public void btnClearHandler(){
		txtDisp.clear();
		operator = 0;
		firstNum = 0;
		secondNum = 0;
		isFirst = true;	// �ʱ�ȭ�� ��.
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
