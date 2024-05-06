package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox leftSide = new VBox();
        leftSide.setSpacing(5);
        leftSide.setPadding(new Insets(10));

        for (int i = 1; i <= 5; i++) {
            Label nameLabel = new Label("Nombre y apellido " + i);
            TextField nameField = new TextField();
            leftSide.getChildren().addAll(nameLabel, nameField);
        }

        AnchorPane rightSide = new AnchorPane();
        rightSide.setPadding(new Insets(10));

        ListView<String> listView = new ListView<>();
        rightSide.getChildren().add(listView);
        AnchorPane.setRightAnchor(listView, 10.0);
        AnchorPane.setTopAnchor(listView, 10.0);
        AnchorPane.setBottomAnchor(listView, 40.0);

        TextField textField = new TextField();
        rightSide.getChildren().add(textField);
        AnchorPane.setRightAnchor(textField, 10.0);
        AnchorPane.setBottomAnchor(textField, 10.0);
        AnchorPane.setLeftAnchor(textField, 10.0);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(leftSide, rightSide);
        AnchorPane.setTopAnchor(leftSide, 10.0);
        AnchorPane.setLeftAnchor(leftSide, 10.0);
        AnchorPane.setRightAnchor(rightSide, 10.0);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
