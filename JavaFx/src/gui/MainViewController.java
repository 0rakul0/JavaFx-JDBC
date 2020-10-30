package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	// menuOperacional
	@FXML private MenuItem menuItemAluno;
	// menuEditar
	@FXML private MenuItem menuItemVer;
	@FXML private MenuItem menuItemAtualizar;
	@FXML private MenuItem menuItemDeletar;
	@FXML private MenuItem menuItemCriar;

	// declaração da função
	@FXML public void onMenuItemAlunoAction() {
		System.out.println("clicou em aluno");
	}
	@FXML public void onMenuItemVerAction() {
		loadView("/gui/Editar.fxml");
	}
	@FXML public void onMenuItemAtualizarAction() {
		System.out.println("clicou em att");
	}
	@FXML public void onMenuItemDeletarAction() {
		System.out.println("clicou em deletar");
	}
	@FXML public void onMenuItemCriarAction() {
		System.out.println("clicou em vriar");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
	}
	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		}
		catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

}
