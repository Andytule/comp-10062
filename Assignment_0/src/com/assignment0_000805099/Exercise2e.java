package week2solutions;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Solution to Week 2 Exercise 4d.
 *
 * @author Sam Scott
 */
public class Exercise2e extends Application {

    /**
     * Sets up the stage and starts the main thread. Your drawing code should
     * NOT go here.
     *
     * @param stage The first stage
     */
    @Override
    public void start(Stage stage) {
        stage.setTitle("Animation Example"); // window title here
        Canvas canvas = new Canvas(400, 400); // canvas size here
        Group root = new Group();
        Scene scene = new Scene(root);
        root.getChildren().add(canvas);
        stage.setScene(scene);
        stage.show();
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // This code starts a "thread" which will run your animation
        Thread t = new Thread(() -> animate(gc));
        t.start();
    }

    /**
     * Animation thread. This is where you put your animation code.
     *
     * @param gc The drawing surface
     */
    public void animate(GraphicsContext gc) {
        for (int size = 0; size <= 1000; size++) {
            // clear the screen to ALICEBLUE
            gc.setFill(Color.BLANCHEDALMOND);
            gc.fillRect(0, 0, 400, 400);

            // Draws the changing part
            gc.setFill(Color.BURLYWOOD);
            gc.fillRect(200 - size / 2.0, 200 - size / 2.0, size, size);

            // Draws the unchanging parts
            gc.setFont(Font.font("System", 30));
            gc.setLineWidth(1);
            gc.setStroke(Color.rgb(0, 0, 128));
            gc.strokeText("Animation is Fun!!!", 10, 95);

            // Slight pause
            pause(5);
        }
    }

    /**
     * Use this method instead of Thread.sleep(). It handles the possible
     * exception by catching it, because re-throwing it is not an option in this
     * case.
     *
     * @param duration Pause time in milliseconds.
     */
    public static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
        }
    }

    /**
     * Exits the app completely when the window is closed. This is necessary to
     * kill the animation thread.
     */
    @Override
    public void stop() {
        System.exit(0);
    }

    /**
     * Launches the app
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
