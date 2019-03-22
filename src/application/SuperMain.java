package application;
	
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;




/**
 * Aplicación realizada para la prueba de recuperacion T1
 * del módulo de Desarrollo de Interfaces.
 
 * @author ALEJANDRO BARO CARCAJONA
 * @version 0.1
 * @see application.SuperControl
 * 
 *
 */


public class SuperMain extends Application {
	
	/**
	 * Metodo main de la aplicación que lanza el primaryStage que recibe como argumento.
	 * @return no tiene
	 */
	
	
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/VistaMain.fxml"));
		try {
			AnchorPane panelPrincipal = loader.load();
			panelPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Poiret+One");
			primaryStage.setScene(new Scene(panelPrincipal));
			primaryStage.setTitle("Examen Recuperacion Primer Trimestre Alejandro Baro");
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
