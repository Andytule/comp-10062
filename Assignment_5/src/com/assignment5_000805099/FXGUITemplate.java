package com.assignment5_000805099;
/**
 * Implementation of a polygon generator. This app allows the user to enter an interger for the number of sides they
 * would like their polygon to have. Then program then outputs the filled perfect polygon.
 * @author Andy Le
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FXGUITemplate extends Application {
    // TODO: Instance Variables for View Components and Model
    private Shape poly;
    private GraphicsContext gc;
    private Label out;
    private Label lab;
    private TextField txt;
    private Button but;
    // TODO: Private Event Handlers and Helper Methods

    /**
     * A method to add an event when the button is pressed
     * @param e
     */
    private void buttonHandler(ActionEvent e) {
        System.out.println("Button clicked");
        Integer sides = Integer.parseInt(txt.getText());
        poly = new Shape(sides, Color.BLACK);
        refresh();
    }

    /**
     * A method to refresh the canvas and draw the new polygon
     */
    private void refresh() {
        System.out.println("Refresh()");
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0,0, 500, 500);
        poly.draw(gc);
        out.setText("This is a(n) " + poly.getNumSides() + " sided polygon");
        txt.requestFocus();
    }
    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 550); // set the size here
        stage.setTitle("Poly Paint"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here
        // 1. Create the model
        poly = new Shape(4, Color.BLACK);
        // 2. Create the GUI components
        Canvas c = new Canvas(500, 500);
        gc = c.getGraphicsContext2D();
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0,0, 500, 500);
        out = new Label("");
        lab = new Label("Enter an integer greater than 2: ");
        txt = new TextField();
        but = new Button("Create Polygon");
        // 3. Add components to the root
        root.getChildren().addAll(c, out, lab, txt, but);
        // 4. Configure the components (colors, fonts, size, location)
        out.relocate(175, 450);
        lab.setPrefWidth(250);
        lab.setFont(new Font("System", 15));
        lab.relocate(50, 513);
        txt.setPrefWidth(40);
        txt.relocate(275, 513);
        but.setPrefWidth(100);
        but.relocate(325, 513);
        // 5. Add Event Handlers and do final setup
        but.setOnAction(this::buttonHandler);
        // 6. Show the stage
        stage.show();
    }

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
