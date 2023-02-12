package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.SKYBLUE);
        stage.setTitle("HelloFX program");
        Image icon = new Image("D:\\Programmes\\NetBeansProjects\\HelloFX\\src\\assets\\Java-Logo.png");
        stage.getIcons().add(icon);
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("Press q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        Text text = new Text("Hello World!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.RED);
        root.getChildren().add(text);
        Line line = new Line();
        line.setStartX(-100);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStroke(Color.AQUAMARINE);
        line.setStrokeWidth(2);
        line.setRotate(45);
        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setOpacity(0.5);
        rectangle.setFill(Color.CHOCOLATE);
        root.getChildren().add(rectangle);

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            200.0, 200.0,
            300.0, 300.0,
            200.0, 300.0});
        polygon.setFill(Color.YELLOW);
        root.getChildren().add(polygon);
        
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(40);
        circle.setFill(Color.INDIGO);
        root.getChildren().add(circle);
        
        Image image = new Image("D:\\Programmes\\NetBeansProjects\\HelloFX\\src\\assets\\Java-Logo.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(300);
        imageView.setY(300);
        imageView.setFitHeight(250.0);
        imageView.setFitWidth(250.0);
        root.getChildren().add(imageView);
        //text.setText("");
        stage.setScene(scene);
        stage.show();

        //throw new UnsupportedOperationException("Not supported yet."); 
    }

}
