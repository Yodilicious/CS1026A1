import java.awt.Color;

// Square class draws a square with the turtle
// in the world.
public class Square {
  
  // This function draws the square.
  public void draw(int length, int x, int y, Color penColor, int penWidth) {
        
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAtCentreOfSquare (x, y);
    positionTurtleAtBottomLeftCornerOfSquare (length);   
    drawSquare (length);
    hideDrawingTurtle ();
  }
  
  private void setTurtleLineWidth (int penWidth) {
  
    drawingTurtle.setPenWidth (penWidth);
  }
  
  private void setTurtleLineColor (Color penColor) {
    
    drawingTurtle.setPenColor (penColor);
  }
  
  private void startDrawing () {
    
    // Place the pen down.
    drawingTurtle.penDown();
  }
  
  private void stopDrawing () {
   
    // Pick the pen up.
    drawingTurtle.penUp();
  }
  
  private void positionTurtleAtCentreOfSquare(int x, int y) {
    
    // Pick the pen up.
    stopDrawing ();
    
    // Positions the turtle in the centre of the square.
    drawingTurtle.moveTo (x, y);
  }
   
  private void positionTurtleAtBottomLeftCornerOfSquare (int length) {
  
    // This moves the turtle from the centre of the square 
    // to the bottom left corner for easy drawing.
    drawingTurtle.turnLeft();
    drawingTurtle.forward(length / 2);
    drawingTurtle.turnLeft();
    drawingTurtle.forward(length / 2);
    drawingTurtle.turnRight();
    drawingTurtle.turnRight();
  }
  
  private void drawSquare (int length) {
    
    // Place the pen down.
    startDrawing ();
    
    // Drawing square.
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
  }
  
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished.
    drawingTurtle.hide();
  }
  
  public Square (World world) {
  
    drawingTurtle = new Turtle (world);
  }

  private Turtle drawingTurtle;
}