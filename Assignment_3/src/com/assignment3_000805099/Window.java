package com.assignment3_000805099;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Implementation of the Window Class. The window is a white circle.
 * @author Andy Le
 */
public class Window {
    /** The X coordinate of the Window **/
    private double x;
    /** The Y coordinate of the Window **/
    private double y;
    /** The diameter of the Window **/
    private double diameter;

    /**
     * Constructor for the Window Class
     * @param x The x coordinate of the Window
     * @param y The y coordinate of the Window
     * @param diameter The diameter of the Window
     */
    public Window (double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /**
     * Method for drawing the Window
     * @param gc Graphics Context
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillOval(this.x, this.y, this.diameter, this.diameter);
    }
}
