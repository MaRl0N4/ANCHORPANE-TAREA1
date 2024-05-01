package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
        AnchorPane root = new AnchorPane();

        // Creamos tres áreas en el AnchorPane
        AnchorPane leftArea = new AnchorPane();
        leftArea.setStyle("-fx-background-color: lightblue;");
        AnchorPane.setTopAnchor(leftArea, 0.0);
        AnchorPane.setLeftAnchor(leftArea, 0.0);
        AnchorPane.setBottomAnchor(leftArea, 0.0);
        AnchorPane.setRightAnchor(leftArea, 200.0);

        AnchorPane rightArea = new AnchorPane();
        rightArea.setStyle("-fx-background-color: lightgreen;");
        AnchorPane.setTopAnchor(rightArea, 0.0);
        AnchorPane.setBottomAnchor(rightArea, 0.0);
        AnchorPane.setRightAnchor(rightArea, 0.0);
        AnchorPane.setLeftAnchor(rightArea, 200.0);

        AnchorPane bottomRightArea = new AnchorPane();
        bottomRightArea.setStyle("-fx-background-color: lightcoral;");
        AnchorPane.setTopAnchor(bottomRightArea, 0.0);
        AnchorPane.setBottomAnchor(bottomRightArea, 100.0);
        AnchorPane.setRightAnchor(bottomRightArea, 0.0);
        AnchorPane.setLeftAnchor(bottomRightArea, 200.0);
        
       
        Label label1 = new Label();
        label1.setText("Michael Jordan");
        
        Image image1 = null;
        image1 = new Image("Michael_Jordan_in_2014.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(50);
        imageView1.setFitHeight(50);
        label1.setGraphic(imageView1);
        AnchorPane.setTopAnchor(label1, 30.0);
         
        
        Label label2 = new Label();
        label2.setText("Shaquille O'Neal");
        
        Image image2 = new Image("Shaquille_O'Neal.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(50);
        imageView2.setFitHeight(50);
        label2.setGraphic(imageView2);
        AnchorPane.setTopAnchor(label2, 100.0);
      
        
        
        Label label3 = new Label();
        label3.setText("Kobe Bryant");
        Image image3 = new Image("Kobe_Bryant_8.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(50);
        imageView3.setFitHeight(50);
        label3.setGraphic(imageView3);
        AnchorPane.setTopAnchor(label3, 170.0);
       
        

        Label label4 = new Label();
        label4.setText("Allen Iverson");
        
        Image image4 = new Image("Allen_Iverson_4.jpg");
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitWidth(50);
        imageView4.setFitHeight(50);
        label4.setGraphic(imageView4);
        AnchorPane.setTopAnchor(label4, 240.0);
        

        Label label5 = new Label();
        label5.setText("Dennis Rodman");
        
        Image image5 = new Image("Dennis_Rodman.jpg");
        ImageView imageView5 = new ImageView(image5);
        imageView5.setFitWidth(50);
        imageView5.setFitHeight(50);
        label5.setGraphic(imageView5);
        AnchorPane.setTopAnchor(label5, 310.0);
     

        leftArea.getChildren().addAll(label1, label2, label3, label4, label5);
        
        
        ListView<String> listView = new ListView<>();
        listView.setItems(FXCollections.observableArrayList("PYTHON", "JAVA", "JAVASCRIP", "C++", "C#", "RUBY", "PHP")); // Agregamos algunos elementos al ListView
        AnchorPane.setTopAnchor(listView, 10.0);
        AnchorPane.setLeftAnchor(listView, 10.0);
        AnchorPane.setRightAnchor(listView, 10.0);
        AnchorPane.setBottomAnchor(listView, 10.0);
        
        
        bottomRightArea.getChildren().add(listView);
        
        
        TextField textField = new TextField("PROGRAMACIÓN EN JAVAFX");
        textField.setPrefWidth(200); // Ajustar el ancho del TextField
        textField.setStyle("-fx-text-fill: black; -fx-background-color: white;"); 
        AnchorPane.setTopAnchor(textField, 300.0);
        AnchorPane.setLeftAnchor(textField, 20.0);
        AnchorPane.setRightAnchor(textField, 20.0);
        
        rightArea.getChildren().add(textField);
        
        // Agregamos las áreas al AnchorPane
        root.getChildren().addAll(leftArea, rightArea, bottomRightArea);
        
        
        Scene scene = new Scene(root, 425, 365);
        
                primaryStage.setScene(scene);
        primaryStage.setTitle("AnchorPane Tarea1");
        
        
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
