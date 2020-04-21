package week2solutions;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 * Solution to Week 2 Exercise 3a. 
 *
 * @author Sam Scott
 */
public class Exercise3a extends Application {

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
        Canvas canvas = new Canvas(400, 300); // Set canvas Size in Pixels
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        stage.setTitle("FXGraphicsTemplate"); // Window title

        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("What kind of shape? 1=square, 2=circle, 3=arc");
        choice = sc.nextInt();
        System.out.print("Enter the x and y coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Enter the RGB color values: ");
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        gc.setFill(Color.rgb(r, g, b));
        switch (choice) {
            case 1:
                System.out.print("Side length: ");
                double size = sc.nextDouble();
                gc.fillRect(x, y, size, size);
                break;
            case 2:
                System.out.print("Radius: ");
                double rad = sc.nextDouble();
                gc.fillOval(x, y, rad * 2, rad * 2);
                break;
            case 3:
                System.out.print("Width and Length: ");
                double w = sc.nextDouble();
                double len = sc.nextDouble();
                System.out.println("Start and Arc angles: ");
                double s = sc.nextDouble();
                double a = sc.nextDouble();
                gc.fillArc(x, y, w, len, s, a, ArcType.OPEN);
                break;
            default:
                System.out.println("ERROR! Bad choice.");
        }
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
