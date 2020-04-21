package com.assignment3_000805099;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Implementation of the House class. A house is a square. Its location is the top left corner, and it contains a
 * window and door, appropriately sized, somewhere within the square.
 * @author Andy Le
 */
public class House {
    /** X coordinate for House **/
    private double x;
    /** Y coordinate for House **/
    private double y;
    /** Size of the House **/
    private double size;
    /** Number of occupants **/
    private int occupants;
    /** Color of House **/
    private Color color;
    /** House's Window **/
    private Window window;
    /** House's Door **/
    private Door door;

    /**
     * Constructor for House class
     * @param x The x coordinate of the House
     * @param y The y coordinate of the House
     * @param size The size of the House
     * @param color The color of the House
     */
    public House (double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.occupants = (int)((Math.random() * 10));
        this.color = color;
        this.window = new Window((this.x + (this.size / 6.0)), (this.y + (this.size / 4.0)), (this.size / 5.0));
        this.door = new Door((this.x + (this.size / 2.0)), (this.y + (this.size / 2.0)), (this.size / 2.0));
    }

    /**
     * Overloaded constructor for King House
     * @param x The x coordinate of the House
     * @param y The y coordinate of the House
     */
    public House (double x, double y) {
        this.x = x;
        this.y = y;
        this.size = 200.0;
        this.color = Color.rgb(252, 169, 133);
        this.window = new Window((this.x + (this.size / 6.0)), (this.y + (this.size / 4.0)), (this.size / 5.0));
        this.door = new Door((this.x + (this.size / 2.0)), (this.y + (this.size / 2.0)), (this.size / 2.0));
    }

    /**
     * Method to draw the House
     * @param gc Graphics Context for drawing
     */
    public void draw (GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x, y, size, size);
        window.draw(gc);
        door.draw(gc);
    }

    /**
     * Method to get the number of Occupants
     * @return The number of occupants of the House
     */
    public int getOccupants() {
        return occupants;
    }

    /**
     * Method to change the number of occupants of a house
     * @param n The new number of occupants
     */
    public void setOccupants(int n) {
        occupants = n;
    }

    /**
     * Method to get the size of the House
     * @return The size of the House
     */
    public double getSize() {
        return size;
    }
}
