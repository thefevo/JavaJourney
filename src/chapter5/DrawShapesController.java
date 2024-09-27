import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawShapesController {
    // Reference to the Canvas object in the FXML file
    private Canvas canvas;

    // Handles the "Draw Rectangles" button press
    void strokeRectanglesButtonPressed(ActionEvent event) {
        drawShapes("rectangles");
    }

    // Handles the "Draw Ovals" button press
    void strokeOvalsButtonPressed(ActionEvent event) {
        drawShapes("ovals");
    }

    // Method to draw either rectangles or ovals based on the choice
    public void drawShapes(String choice) {
        // Get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Clear the canvas before drawing new shapes
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        int step = 10;  // Distance between the shapes

        // Loop to draw 10 shapes (either rectangles or ovals)
        for (int i = 0; i < 10; i++) {
            // Draw based on the user's choice
            switch (choice) {
                case "rectangles":
                    // Draw a rectangle at increasing positions and sizes
                    gc.strokeRect(10 + i * step, 10 + i * step, 50 + i * step, 50 + i * step);
                    break;

                case "ovals":
                    // Draw an oval at increasing positions and sizes
                    gc.strokeOval(10 + i * step, 10 + i * step, 50 + i * step, 50 + i * step);
                    break;
            }
        }
    }
}
