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

public class SampleController implements Initializable { // implements Initializable �ϰ� ��Ʈ�� �����̽��ٸ� ���� �ض�

	@FXML private Button btnClear; // �̰Ŵ� ���� ��.
	@FXML private Button btnRegister; // �̰͵� ���� ��.
	
	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtHp;
	@FXML private TextField txtPos;
	@FXML private TextField txtDep;
	@FXML private DatePicker txtRegDate; // datepicker�� �׸��̶�.
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// btnRegister ��ư
		btnRegister.setOnAction(event->btnRegister());	// ��ư�� ������ btnRegister() �޼��� ����.
		
		
		// �ʱ�ȭ ��ư �̺�Ʈ �ڵ鷯
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
		System.out.println("���̵� : "+uid);
		System.out.println("�̸� : "+name);
		System.out.println("�޴��� : "+hp);
		System.out.println("���� : "+pos);
		System.out.println("�μ� : "+dep);
		System.out.println("�Ի��� : "+regDate);
	}
}
