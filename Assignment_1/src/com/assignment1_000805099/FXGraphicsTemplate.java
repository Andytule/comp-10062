package com.assignment1_000805099;

import java.sql.SQLOutput;
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
 * COMP 10062 - Assignment 1
 * January 26, 2020
 * Andy Le
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
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 1000, 500);
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.WHITE);
        for (int x = 0; x < 200; x++) {
            gc.fillRect((Math.random() * 1000), (Math.random() * 500), ((Math.random() * 2) + 0.5), ((Math.random() * 2) + 0.5));
        }
        Scanner input = new Scanner(System.in);
        int in_star = 1;
        int linePosX = -1;
        int linePosY = -1;
        boolean first = true;
        while (in_star == 1) {
            System.out.print("Would you like to draw a star? (Yes: 1, No: 2): ");
            in_star = input.nextInt();
            if (in_star == 1) {
                int xPos = -1;
                int yPos = -1;
                while ((xPos < 0) || (1000 < xPos)) {
                    System.out.print("Please enter an X coordinate from 0 - 1000: ");
                    xPos = input.nextInt();
                    if ((xPos < 0) || (1000 < xPos)) {
                        System.out.println("Error, user input is not valid!");
                    }
                }
                while ((yPos < 0) || (500 < yPos)) {
                    System.out.print("Please enter an Y coordinate from 0 - 500: ");
                    yPos = input.nextInt();
                    if ((yPos < 0) || (500 < yPos)) {
                        System.out.println("Error, user input is not valid!");
                    }
                }
                gc.fillRect(xPos, yPos, 4, 4);
                if (first == true) {
                    first = false;
                } else {
                    gc.strokeLine(linePosX, linePosY, xPos, yPos);
                }
                linePosX = xPos;
                linePosY = yPos;
            }
        }
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
