/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longmethodsolution;

import longmethod.*;
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Steffany Vallejo
 */
public class ExtractMethod extends Application {

    Boolean cambiarColor = true;

    public void dibujarRectangulo(Rectangle rectangulo) {
        rectangulo.setX(50);
        rectangulo.setY(50);
        rectangulo.setWidth(100);
        rectangulo.setHeight(70);
    }

    public void cambiarColor(Rectangle rectangulo) {

        rectangulo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (cambiarColor) {
                    rectangulo.setFill(Color.BLACK);
                    cambiarColor = false;
                } else {
                    rectangulo.setFill(Color.AQUA);
                    cambiarColor = true;

                }

            }
        });
    }

    public void diseñarPantalla(Stage primaryStage, Pane root) {
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();

        Rectangle rectangulo = new Rectangle();
        dibujarRectangulo(rectangulo);
        cambiarColor(rectangulo);
        diseñarPantalla(primaryStage, root);
        root.getChildren().add(rectangulo);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
