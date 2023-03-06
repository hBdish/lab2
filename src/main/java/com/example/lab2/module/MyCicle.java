package com.example.lab2.module;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCicle extends Shape{

    double length;
    double width;

    public MyCicle(Color color, double length, double width, double x, double y) {
        super(color, x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public void drow(GraphicsContext graphicsContext) {
        graphicsContext.setFill(this.color);
        graphicsContext.fillOval(this.x, this.y, length , width);

    }


}
