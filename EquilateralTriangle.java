import java.awt.Color;

// Triangle class draws a equilateral triangle with the turtle
// in the world.
public class EquilateralTriangle {
  
  // This function draws the Equilateral Triangle.
  public void draw(int length, int x, int y, Color penColor, int penWidth) {
        
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAtCentreOfEquilateralTriangle (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);   
    drawEquilateralTriangle (length);
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
  
  private void positionTurtleAtCentreOfEquilateralTriangle(int x, int y) {
    
    // Pick the pen up.
    stopDrawing ();
    
    // Positions the turtle in the centre of the equilateral triangle.
    drawingTurtle.moveTo (x, y);
  }
   
  private void positionTurtleAtBottomLeftCornerOfEquilateralTriangle (int length) {
    
    // Positioning the turtle at the left corner of the equilateral triangle.    
    drawingTurtle.turnLeft ();
    drawingTurtle.forward (length / 2);
    drawingTurtle.turnLeft ();
    
    int height = (int)Math.round ((Math.sqrt(3) / 2) * length);
    
    drawingTurtle.forward (height / 2);
    drawingTurtle.turnRight ();
    drawingTurtle.turnRight ();
  }
  
  private void drawEquilateralTriangle (int length) {
    
    // Place the pen down.
    startDrawing ();
    
    // Drawing equilateral triangle.
    drawingTurtle.turn(30);
    drawingTurtle.forward (length);
    drawingTurtle.turn(120);
    drawingTurtle.forward (length);
    drawingTurtle.turn(120);
    drawingTurtle.forward (length);
    drawingTurtle.turnRight ();
  }
  
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished.
    drawingTurtle.hide();
  }
  
  public EquilateralTriangle (World world) {
  
    drawingTurtle = new Turtle (world);
  }

  private Turtle drawingTurtle;
}