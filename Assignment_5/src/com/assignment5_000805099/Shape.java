package com.assignment5_000805099;
/**
 * Implementation of Shape class which takes in the color and the number of sides
 * @author Andy Le
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Shape {
    /** The number of sides of the polygon **/
    private int numSides;
    /** The color of the polygon **/
    private Color tint;
    /** The x coordinates for the polygon **/
    private double[] x;
    /** The y coordinates for the polygon **/
    private double[] y;

    /**
     * Constructor for the Shape class which takes in the number of sides and color of the polygon
     * @param numSides of the polygon
     * @param tint is the color of the polygon
     */
    public Shape(int numSides, Color tint) {
        this.numSides = numSides;
        this.tint = tint;
        this.x = new double[numSides];
        this.y = new double[numSides];
        for (int i = 0; i < numSides; i++) {
            this.x[i] = 100 * Math.cos(2 * Math.PI * i / numSides) + 250.0;
            System.out.print(this.x[i]);
            System.out.print(" ");
            this.y[i] = 100 * Math.sin(2 * Math.PI * i / numSides) + 250.0;
            System.out.println(this.y[i]);
        }
    }

    /**
     * A method to set the number of sides of the polygon
     * @param numSides the number of sides
     */
    public void setNumSides(int numSides) {
        if (numSides <= 2) {
            System.out.println("ERROR! Number of sides must be greater than 2.");
        } else {
            this.numSides = numSides;
        }
    }

    /**
     * A method to set the color of the polygon
     * @param tint the color of the polygon
     */
    public void setTint(Color tint) {
        this.tint = tint;
    }

    /**
     * A method to return the number of sides of the polygon
     * @return
     */
    public int getNumSides() {
        return this.numSides;
    }

    /**
     * A method to return the color of the polygon
     * @return
     */
    public Color getTint() {
        return this.tint;
    }

    /**
     * A method to draw the polygon
     * @param gc graphics context
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(this.tint);
        gc.fillPolygon(this.x, this.y, this.numSides);
    }
}
