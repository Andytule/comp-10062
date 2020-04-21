package com.assignment3_000805099;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Implementation of the Door Class. The door is a white rectangle that is half as wide as it is high
 * @author Andy Le
 */
public class Door {
    /** The X coordinate for the Door **/
    private double x;
    /** The Y coordinate for the Door **/
    private double y;
    /** The Height for the DOor **/
    private double height;

    /**
     * Constructor for the door class
     * @param x The X coordinate of the Door
     * @param y The Y coordinate of the Door
     * @param height The Height of the Door
     */
    public Door (double x, double y, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    /**
     * Method for drawing the Door
     * @param gc Graphics Context for drawing
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, height / 2, height);
    }
}
