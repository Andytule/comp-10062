package com.assignment3_000805099;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * Implementation of the world of "Two Villages". The user can enter in two village names and the program will create a
 * world containing two villages and an emperor's house. A village has a name and contains 3 houses, all the same color,
 * each with one or more occupants. A house has a door and a window. The emperor's house is the biggest in the world.
 * It's a different color and is not part of one of the two villages
 *
 * @author Andy Le
 */
public class FXGraphicsTemplate extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1000, 500); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
        // *** processing
        gc.setFill(Color.rgb(154, 206, 223));
        gc.fillRect(0, 0, 1000, 500);
        TwoVillages temp = new TwoVillages("Ham", "Cheese");
        temp.draw(gc);

        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
