package org.example.book6_chap01;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn;

    @Override
    public void start(Stage primaryStage) {
        //creating button
        btn = new Button();
        btn.setText("Click Me!");
        btn.setOnAction(e -> buttonClick());
        //adding layout
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        Scene scene = new Scene(pane, 300, 250);
        //show stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome to the Click Me App");
        primaryStage.show();
    }

    public void buttonClick() {
        if(btn.getText() == "Click Me!") {
            btn.setText("You clicked!");
        }else {
            btn.setText("Click Me!");
        }
    }

}