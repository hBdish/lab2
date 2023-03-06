package com.example.lab2.module;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tringl extends Shape{

    double length;
    double width;


    public Tringl(Color color, double x, double y) {
        super(color, x, y);
    }
    @Override
    public void drow(GraphicsContext graphicsContext) {
        graphicsContext.setFill(this.color);
        graphicsContext.moveTo(this.x, this.y);
        graphicsContext.lineTo(this.x + 50 , this.y);
        graphicsContext.lineTo(this.x + 25 , this.y - 25);
        graphicsContext.fill();

//        graphicsContext.closePath();
    }
}
