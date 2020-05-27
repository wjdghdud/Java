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
	
	private int operator; // 멤버 선언. 이거갖고 식별하겠데. plus~ 연산을
	private int firstNum; // 연산에서의 첫 번째 숫자를 저장
	private int secondNum; // 연산에서의 두 번째 숫자를 저장
	private boolean isFirst = true;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 정의된 핸들러와 이벤트 객체의 연결
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
	
	// 통합메서드
	public void setNum(int num) {
		if(isFirst) {
		txtDisp.setText(""+num); // txtDisp.setText(""+num); 이것도 됨. 저 위의  String strNum = String.valueOf(num); 이거를 생략하고 ""+ 붙여주면  편함.
//		firstNum = num; 1의자릿수 연산만 가능
		isFirst = false;	// 이것으로 else로 자연스럽게 넘어가.
		}else {
			
			String getNum = txtDisp.getText();	// 현재값(getNum)을 가지고 온다.
			String totNum = getNum + num;		// 단순 덧셈연산이 아님. getNum은 string형이고 num은 int형이라서 하나의 문자처럼 됨.
			
//			txtDisp.setText(""+num);			원랜 이거였어
			txtDisp.setText(totNum);			// 근데 이거로 1의자릿수 이상의 연산이 가능
//			secondNum = num; 1의자릿수 연산만 가능
		}
	}
	
	public void setOperator(int operator) {	
		this.operator = operator;
		
		String getNum = txtDisp.getText();
		firstNum = Integer.parseInt(getNum);	// 문자열을 숫자로 변환해줘야 함
		
		isFirst = true;		// 초기화
	}
		
	// 핸들러 정의
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
		setOperator(1); // 연산자의 식별값 = operator.
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
		txtDisp.setText(""+result); // ""+ 를 입력함으로써 string
	}
	public void btnClearHandler(){
		txtDisp.clear();
		operator = 0;
		firstNum = 0;
		secondNum = 0;
		isFirst = true;	// 초기화가 됨.
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
