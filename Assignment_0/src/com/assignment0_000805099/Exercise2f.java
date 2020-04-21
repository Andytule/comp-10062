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
 * Solution to Week 2 Exercise 2f. Really, this is just an example of what could
 * be done. Yours can be anything you like.
 *
 * @author Sam Scott
 */
public class Exercise2f extends Application {

    /**
     * Sets up the stage and starts the main thread. Your drawing code should
     * NOT go here.
     *
     * @param stage The first stage
     */
    @Override
    public void start(Stage stage) {
        stage.setTitle("Fireworks!!!"); // window title here
        Canvas canvas = new Canvas(500, 300); // canvas size here
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

        final int NUM_FLASHES = 5;      // number of times to flash the opening text
        final int EXPLODE_HEIGHT = 100; // the y coordinate where the rocket explodes
        final int PARTICLE_SIZE = 5;    // size of the explosion particles
        final int NUM_EXPLOSIONS = 20;  // number of explosions after the first one
        final int MAX_SIZE = 50;        // size of the explosions
        final int WIDTH = 500;
        final int HEIGHT = 300;

        int x, y, red, blue, green; // positions and colors
        int count;                  // loop counter
        int offSet;                 // counter for processing explosions

        // ***** clear screen
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 500, 300);

        // ***** FLASH INTRO TEXT
        count = 0;
        while (count < NUM_FLASHES) {
            gc.setFont(new Font("Courier New", 50));
            gc.setFill(Color.WHITE);
            gc.fillText("Fireworks!", WIDTH / 2 - 150, HEIGHT / 2);
            pause(500);
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, 500, 300);
            pause(500);
            count = count + 1;
        }

        // ***** ROCKET ANIMATION
        y = HEIGHT;
        while (y > EXPLODE_HEIGHT) {
            gc.setFill(Color.BLUE);
            // when creating animations, you must "synchronize" the access to
            // the buffer object to avoid screen flicker.
            gc.fillOval(WIDTH / 2, y, 10, 30);
            pause(5);
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, 500, 300);
            y = y - 1;
        }

        // ***** EXPLOSION ANIMATION
        offSet = 0;
        while (offSet < MAX_SIZE) {
            gc.setFill(Color.RED);
            gc.fillOval(WIDTH / 2 + offSet, EXPLODE_HEIGHT + offSet, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2 + offSet, EXPLODE_HEIGHT - offSet, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2 - offSet, EXPLODE_HEIGHT + offSet, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2 - offSet, EXPLODE_HEIGHT - offSet, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2, EXPLODE_HEIGHT + offSet, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2, EXPLODE_HEIGHT - offSet, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2 + offSet, EXPLODE_HEIGHT, PARTICLE_SIZE, PARTICLE_SIZE);
            gc.fillOval(WIDTH / 2 - offSet, EXPLODE_HEIGHT, PARTICLE_SIZE, PARTICLE_SIZE);
            pause(5);
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, 500, 300);
            offSet = offSet + 1;
        }

        // ***** PAUSE
        pause(2000);

        // ***** MULTIPLE EXPLOSIONS 
        //       Note: Contains a nested while loop
        count = 0;
        while (count < NUM_EXPLOSIONS) { // outer loop - once per explosion
            x = (int) (Math.random() * WIDTH);
            y = (int) (Math.random() * HEIGHT);
            red = (int) (Math.random() * 128) + 127;
            green = (int) (Math.random() * 128) + 127;
            blue = (int) (Math.random() * 128) + 127;

            offSet = 0;
            while (offSet < MAX_SIZE) { // inner loop moves the particles for each explosion
                gc.setFill(Color.rgb(red, green, blue));
                gc.fillOval(x + offSet, y + offSet, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x + offSet, y - offSet, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x - offSet, y + offSet, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x - offSet, y - offSet, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x, y + offSet, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x, y - offSet, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x + offSet, y, PARTICLE_SIZE, PARTICLE_SIZE);
                gc.fillOval(x - offSet, y, PARTICLE_SIZE, PARTICLE_SIZE);
                pause(5);
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, 500, 300);
                offSet = offSet + 1;
            }
            count = count + 1;
            pause(50);
        }
        pause(2000);
        System.exit(0);
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
