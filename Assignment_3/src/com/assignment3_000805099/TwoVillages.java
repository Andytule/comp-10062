package com.assignment3_000805099;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Implementation of the TwoVillages class. This class creates two villages and a King's house and draws them.
 * @author Andy Le
 */

public class TwoVillages {
    /** Village One **/
    private Village v1;
    /** Village Two **/
    private Village v2;
    /** King House **/
    private House king;

    /**
     * Constructor class for TwoVillages
     * @param name1 The name of village one
     * @param name2 The name of village two
     */
    public TwoVillages(String name1, String name2) {
        this.v1 = new Village(name1, 0, 500, Color.rgb(193, 179, 215));
        this.v2 = new Village(name2, 500, 500, Color.rgb(134, 207, 190));
        this.king = new House(800.0, 0.0);
    }

    /**
     * A method that draws the villages and house by calling their respective draw methods
     * @param gc GraphicsContext for drawing
     */
    public void draw(GraphicsContext gc) {
        v1.draw(gc);
        v2.draw(gc);
        king.draw(gc);
    }
}
