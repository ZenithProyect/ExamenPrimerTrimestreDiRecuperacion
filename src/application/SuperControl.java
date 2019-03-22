package application;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SuperControl {
	
	
	
	@FXML
	private AnchorPane root;
	
	@FXML
	private JFXButton btnAceptar;
	
	@FXML
	private ImageView imagen;
	
	
	
	
	
	
	public void initialize() {
		fadeIn();
	}

	
	/**
	 * Metodo void que carga la segunda ventana de la aplicación, habilita tambien el maximizado de la misma.
	 * 
	 * @return no tiene 
	 */
	public void sendStage() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/VistaSecundaria.fxml"));	
		try {
			root =(AnchorPane) loader.load();
			Stage st = new Stage();
			st.setScene(new Scene(root));
			st.centerOnScreen();
			st.setMaximized(true);
			
			st.show();
			cerrarStage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * Metodo void que cierra el stage de la primera haciendo un fadeTransition de 3 segundos de duracion
	 * @return no tiene
	 */
	public void cerrarStage() {
		FadeTransition fade = new FadeTransition(Duration.seconds(3), root);
		fade.setFromValue(1);
		fade.setToValue(0);
		fade.play();
		fade.setOnFinished(event-> {
			sendStage();
			Stage st = (Stage) root.getScene().getWindow();
			st.close();
		});
	}
	
	
	
	/**
	 * Método void que al realizar hover sobre el botón aceptar cambia el background a color gris
	 * @return no tiene
	 */
	public void efectoHover() {
		btnAceptar.setStyle("-fx-background-color: grey"); 
	}
	
	
	
	
	/**
	 * Metodo void que al hacer release del botón aceptar, cambia el background a color naranja
	 * @return no tiene
	 */
	public void revHover() {
		btnAceptar.setStyle("-fx-background-color: orange"); 
	}
	
	
	
	
	

	/**
	 * Método void que realiza un fade in de una imagen al iniciar la aplicación
	 * @return no tiene
	 */
	private void fadeIn() {
		FadeTransition fade = new FadeTransition(Duration.seconds(5), imagen);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
		
	}

}
