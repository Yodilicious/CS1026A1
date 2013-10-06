import java.awt.Color; 

public class TurtleArt { 
 
  public static void main (String[] args) {
    
    TurtleArt myArt = new TurtleArt();
    
    myArt.drawSquare(100, 75, 75, 5);
    myArt.drawRectangle(100, 200, 200, 150);
    myArt.drawEquilateralTriangle(200, 350, 300);
    myArt.drawCircle(100, 300, 600);
    
    myArt.hideDrawingTurtle();
  }
  
  public void drawSquare(int length, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfSquare (length);   
    drawingTurtle.drawSquare (length);
  }
  
  public void drawSquare(int length, int x, int y, int penWidth) {
    
    setTurtleLineWidth(penWidth);
    drawSquare(length, x, y);
    setTurtleLineWidth(1);
  }
  
  public void drawRectangle(int width, int height, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle(width, height);
  } 
  
  public void drawEquilateralTriangle(int length, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateralTriangle (length);
  }
  
  public void drawCircle(int radius, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle(radius);
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
  
  private void positionTurtleAt(int x, int y) {
    
    // Pick the pen up.
    stopDrawing ();
    
    // Positions the turtle in the centre of the equilateral triangle.
    drawingTurtle.moveTo (x, y);
    
    // Put pen down
    startDrawing();
  }
  
  private void positionTurtleAtTheEdgeOfCircle (int radius) {
  
    // Pick the pen up.
    stopDrawing ();
    
    drawingTurtle.forward (radius);
    drawingTurtle.turnRight ();
    
    // Put pen down
    startDrawing();
  }
  
  private void positionTurtleAtTopLeftCornerOfSquare (int length) {
  
    // Pick the pen up.
    stopDrawing ();
    
    // This moves the turtle from the centre of the square 
    // to the bottom left corner for easy drawing.
    drawingTurtle.turnLeft();
    drawingTurtle.forward(length / 2);
    drawingTurtle.turnRight();
    drawingTurtle.forward(length / 2);
    
    // Put pen down
    startDrawing();
  }
  
  private void positionTurtleAtTopLeftCornerOfRectangle (int width, int height) {
  
    // Pick the pen up.
    stopDrawing ();
    
    // This moves the turtle from the centre of the rectangle 
    // to the bottom left corner for easy drawing.
    drawingTurtle.turnLeft();
    drawingTurtle.forward(width / 2);
    drawingTurtle.turnRight();
    drawingTurtle.forward(height / 2);
    
    // Put pen down
    startDrawing();
  }
   
  private void positionTurtleAtBottomLeftCornerOfEquilateralTriangle (int length) {
    
    // Pick the pen up.
    stopDrawing ();
    
    // Positioning the turtle at the left corner of the equilateral triangle.    
    drawingTurtle.turnLeft ();
    drawingTurtle.forward (length / 2);
    drawingTurtle.turnLeft ();
    
    int height = (int)Math.round ((Math.sqrt(3) / 2) * length);
    
    drawingTurtle.forward (height / 2);
    drawingTurtle.turnRight ();
    drawingTurtle.turnRight ();
    
    // Put pen down
    startDrawing();
  }
  
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished.
    drawingTurtle.hide();
  }
  
  public TurtleArt() {
    World world = new World(800, 800);
    drawingTurtle = new Turtle(world);
  }
  
  private Turtle drawingTurtle;
}