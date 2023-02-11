
package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HelloFX extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        stage.setTitle("HelloFX program");
        Image icon = new Image("D:\\Programmes\\NetBeansProjects\\HelloFX\\src\\assets\\Java-Logo.png");
        stage.getIcons().add(icon);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        
        
        stage.setScene(scene);
        stage.show();
        
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
