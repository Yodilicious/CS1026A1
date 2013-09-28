import java.awt.Color;

// Rectangle class draws a rectangle with the turtle
// in the world.
public class Rectangle {
  
  // This function draws the square.
  public void draw(int length, int x, int y, Color penColor, int penWidth) {
        
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAtCentreOfRectangle (x, y);
    positionTurtleAtBottomLeftCornerOfRectangle (length);   
    drawRectangle (length);
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
  
  private void positionTurtleAtCentreOfRectangle (int x, int y) {
    
    // Pick the pen up.
    stopDrawing ();
    
    // Positions the turtle in the centre of the rectangle.
    drawingTurtle.moveTo (x, y);
  }
   
  private void positionTurtleAtBottomLeftCornerOfRectangle (int length) {
  
    // This moves the turtle from the centre of the rectangle 
    // to the bottom left corner for easy drawing.
    drawingTurtle.turnLeft();
    drawingTurtle.forward(length / 2);
    drawingTurtle.turnLeft();
    drawingTurtle.forward(length / 2);
    drawingTurtle.turnRight();
    drawingTurtle.turnRight();
  }
  
  private void drawRectangle (int length) {
    
    // Place the pen down.
    startDrawing ();
    
    // Drawing rectangle.
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length);
  }
  
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished.
    drawingTurtle.hide();
  }
  
  public Rectangle (World world) {
  
    drawingTurtle = new Turtle (world);
  }

  private Turtle drawingTurtle;
}

