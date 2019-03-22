package application;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class SuperControl2 {

	///pensaba hacer algo mas que un simple texto, pero como no me ha dado tiempo a mas... lo dejo asi
	@FXML
	private AnchorPane vSecundaria;
	@FXML
	private JFXButton btnSalir;
	
	
	public void initialize() {
		
		salir();
	}
	
	
	/**
	 * Metodo void que al hacer click en el botón salir ejecuta el system.exit(0)
	 * @return no tiene
	 */
	public void salir() {
		System.exit(0);
	}
	
}
