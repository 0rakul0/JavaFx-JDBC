package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
		//menuOperacional
		@FXML
		private MenuItem menuItemAluno;
		//menuEditar
		@FXML
		private MenuItem menuItemVer;
		@FXML
		private MenuItem menuItemAtualizar;
		@FXML
		private MenuItem menuItemDeletar;
		@FXML
		private MenuItem menuItemCriar;
		
		//declaração da função
		@FXML
		public void onMenuItemAlunoAction() {
			System.out.println("clicou em aluno");
		}
		
		@FXML
		public void onMenuItemVerAction() {
			System.out.println("clicou em ver");
		}
		
		@FXML
		public void onMenuItemAtualizarAction() {
			System.out.println("clicou em att");
		}
		
		@FXML
		public void onMenuItemDeletarAction() {
			System.out.println("clicou em deletar");
		}
		
		@FXML
		public void onMenuItemCriarAction() {
			System.out.println("clicou em vriar");
		}
		
		
		@Override
		public void initialize(URL uri, ResourceBundle rb) {
			// TODO Auto-generated method stub
			
}

}
