package com.example.lab2;

import com.example.lab2.module.MyCicle;
import com.example.lab2.module.Rectangle;
import com.example.lab2.module.Tringl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private double x = 0;
    private double y = 0;

    public ColorPicker coloPicker;
    private GraphicsContext gc;

    @FXML
    protected Canvas canvas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }

    public void onHelloButtonClick(ActionEvent event) {
        Rectangle rec = new Rectangle(coloPicker.getValue(),50, 50, x, y);
        rec.drow(gc);
    }

    public void Cicle(ActionEvent event) {
        MyCicle cic = new MyCicle(coloPicker.getValue(),50, 50, x, y);
        cic.drow(gc);
    }

    public void Trin(ActionEvent event) {
        Tringl tringl = new Tringl(coloPicker.getValue(),x,y);
        tringl.drow(gc);
    }

    public MouseEvent click(MouseEvent mouseEvent) {
        this.x = mouseEvent.getX();
        this.y = mouseEvent.getY();
        return mouseEvent;
    }


}
