package com.assignment3_000805099;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Implementation of the Village Class. A village is a collection of houses that are all the same color.
 * @author Andy Le
 */
public class Village {
    /** X coordinate for Village **/
    private double x;
    /** Y coordinate for Village **/
    private double y;
    /** Size of Village in pixels **/
    private double size;
    /** Color of Village **/
    private Color color;
    /** Name of the Village **/
    private String name;
    /** House1, House2, House3 **/
    private House h1, h2, h3;

    /**
     * Constructor for the Village Class
     * @param name The name of the Village
     * @param x The x coordinate of the Village
     * @param y The y coordinate of the Village
     * @param color The color of the Village
     */
    public Village(String name, int x, int y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        double h1Size = ((Math.random() * 50.0) + 150.0);
        double h2Size = ((Math.random() * 50.0) + 75.0);
        double h3Size = ((Math.random() * 25.0) + 50.0);
        this.size = (((h1Size + h2Size + h3Size) * 20.0) / 100);
        this.h1 = new House(this.x + 30.0, (this.y - h1Size - 30.0), h1Size, this.color);
        this.h2 = new House((this.x + h1Size + 60.0), (this.y - h2Size - 30.0), h2Size, this.color);
        this.h3 = new House((this.x + h1Size + h2Size + 90.0), (this.y - h3Size - 30.0), h3Size, this.color);
    }

    /**
     * A method that draws the houses using their drawing methods and draws information about the village
     * @param gc Graphic Context for drawing
     */
    public void draw(GraphicsContext gc) {
        h1.draw(gc);
        h2.draw(gc);
        h3.draw(gc);
        gc.setStroke(Color.BLACK);
        int temp = (h1.getOccupants() + h2.getOccupants() + h3.getOccupants());
        gc.strokeText((this.name + " (size " + String.format("%.1f", this.size) + "m, population " + temp + ")"),
                this.x + 30.0, 490);
    }

}
