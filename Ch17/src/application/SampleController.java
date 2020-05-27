package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SampleController implements Initializable { // implements Initializable 하고 컨트롤 스페이스바만 존나 해라

	@FXML private Button btnClear; // 이거는 따로 해.
	@FXML private Button btnRegister; // 이것도 따로 해.
	
	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtHp;
	@FXML private TextField txtPos;
	@FXML private TextField txtDep;
	@FXML private DatePicker txtRegDate; // datepicker형 항목이라서.
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// btnRegister 버튼
		btnRegister.setOnAction(event->btnRegister());	// 버튼을 누르면 btnRegister() 메서드 실행.
		
		
		// 초기화 버튼 이벤트 핸들러
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtUid.clear();
				txtName.clear();
				txtHp.clear();
				txtPos.clear();
				txtDep.clear();
				txtRegDate.getEditor().clear();
				
			}
		});
	}	// Initialize end
	
	public void btnRegister() {
		String uid = txtUid.getText();
		String name = txtName.getText();
		String hp = txtHp.getText();
		String pos = txtPos.getText();
		String dep = txtDep.getText();
		String regDate = txtRegDate.getEditor().getText();
		
		System.out.println("================================");
		System.out.println("아이디 : "+uid);
		System.out.println("이름 : "+name);
		System.out.println("휴대폰 : "+hp);
		System.out.println("직급 : "+pos);
		System.out.println("부서 : "+dep);
		System.out.println("입사일 : "+regDate);
	}
}
