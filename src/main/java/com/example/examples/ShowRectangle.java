package com.example.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowRectangle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a circle and set its properties
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        //circle.setRadius(50);
        rectangle.setHeight(600);
        rectangle.setWidth(400);
        rectangle.setStroke(Color.BLACK); // Set circle stroke color
        rectangle.setFill(Color.WHITE);

        // Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(rectangle);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowRectangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
