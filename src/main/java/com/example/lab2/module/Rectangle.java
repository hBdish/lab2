package com.example.lab2.module;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(Color color, double length, double width, double x, double y) {
        super(color, x, y);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
    @Override
    public void drow(GraphicsContext graphicsContext) {;
        graphicsContext.setFill(this.color);
        graphicsContext.fillRect(this.x, this.y, length, width);
        graphicsContext.closePath();
    }
}
