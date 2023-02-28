package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class HelloController {

    @FXML
    protected Canvas canvas;

    public void onHelloButtonClick(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.GREEN);
        gc.moveTo(70, 200);
        gc.lineTo(200, 150);
        gc.lineTo(330, 200);
        gc.fill();
        gc.setFill(Color.BLACK);
        gc.fillRect(100, 200, 200, 100);
        gc.setFill(Color.WHITE);
        gc.fillOval(185, 250, 20, 50);

        gc.closePath();
    }
}
