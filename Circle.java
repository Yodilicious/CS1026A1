import java.awt.Color;

// Circle class draws a squar with the turtle
// in the world.
public class Circle {
  
  // This function draws the circle.
  public void draw(int radius, int x, int y, Color penColor, int penWidth) {
        
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAtCentreOfCircle (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);   
    drawCircle (radius);
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
  
  private void positionTurtleAtCentreOfCircle(int x, int y) {
    
    // Pick the pen up.
    stopDrawing ();
    
    // Positions the turtle in the centre of the circle.
    drawingTurtle.moveTo (x, y);
  }
   
  private void positionTurtleAtTheEdgeOfCircle (int radius) {
  
    drawingTurtle.forward (radius);
    drawingTurtle.turnRight ();
  }
  
  private void drawCircle (int radius) {
    
    // Place the pen down.
    startDrawing ();
    
    // Drawing circle.
    double circumference = 2 * Math.PI * radius;
    int sectionLength = (int)Math.round (circumference / 360);
    int angle = (int)Math.round(360 / sectionLength);
    for (int i = 0; i < sectionLength; i++) {
    
      drawingTurtle.turn (angle);
      drawingTurtle.forward (sectionLength);
    }
  }
  
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished.
    drawingTurtle.hide();
  }
  
  public Circle (World world) {
  
    drawingTurtle = new Turtle (world);
  }

  private Turtle drawingTurtle;
}