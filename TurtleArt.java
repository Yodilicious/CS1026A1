import java.awt.Color; 

public class TurtleArt { 
 
  public static void main (String[] args) {
    
    TurtleArt myArt = new TurtleArt();
    
    myArt.positionTurtleAt(50, 50);
    myArt.drawingTurtle.drawSquare(100);
    
    myArt.positionTurtleAt(150, 150);
    myArt.drawingTurtle.drawRectangle(100, 200);
    
    myArt.positionTurtleAt(250, 250);
    myArt.drawingTurtle.drawEquilateralTriangle(100);
    
    myArt.positionTurtleAt(400, 400);
    myArt.drawingTurtle.drawCircle(100);
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
  
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished.
    drawingTurtle.hide();
  }
  
  public TurtleArt() {
    World world = new World(800, 800);
    drawingTurtle = new Turtle(world);
  }
  
  public Turtle drawingTurtle;
}