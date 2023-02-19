/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package handleevents;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author risha
 */
public class HandleEvents extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(HandleEvents.class.getResource("main.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            //apply style sheet
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            String CSS = this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(CSS);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
