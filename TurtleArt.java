import java.awt.Color; 


public class TurtleArt { 
 
  public static void main (String[] args) {
    
    TurtleArt myArt = new TurtleArt();
   
    myArt.drawHouse ();
    myArt.drawTree ();
    myArt.drawChristmasTree();
    myArt.drawDoor ();
    myArt.drawWindow ();
    myArt.drawSun ();
    myArt.drawDriveway ();
    myArt.hideDrawingTurtle();
    
  }
 
  public void drawHouse () {
    
    // drawing the main part of the house.
    drawFilledRectangle (400, 200, 350, 500, new Color(151, 51, 29));
    
    // drawing the roof of the house.
    drawEquilateralTriangle (400, 350, 225, 8, new Color(58, 51, 29));
  }
  
  public void drawChristmasTree() {
    
    // drawing stumppy
    drawRectangle (50, 75, 75, 650, 2, new Color(152, 91, 0));
    drawEquilateralTriangle (100, 75, 570, 2, new Color(0, 255, 0));
  }
  
  public void drawTree () {
    
    drawFilledRectangle (100, 300, 650, 450, new Color(137, 73, 0));
    drawCircle (150, 650, 189, 5, new Color(38, 255, 77));
    drawCircle (55, 650, 450, 5, new Color(0, 0, 0));
  }
  
  public void drawWindow () {
    
    drawSquare (100, 225, 500, 6, new Color(255, 255, 255));
    drawSquare (100, 475, 500, 6, new Color(255, 255, 255));
    
    setTurtleLineWidth (3);
    setTurtleLineColor (new Color(255, 255, 255));
    
    // draw the vertical line for left window
    positionTurtleAt (225, 550);
    drawingTurtle.forward (100);
    
    // draw the vertical line for right window
    positionTurtleAt (475, 550);
    drawingTurtle.forward (100);
    
    // draw horizontal line for left window
    positionTurtleAt (175, 500);
    drawingTurtle.turnRight();
    drawingTurtle.forward (100);
    drawingTurtle.turnLeft();
    
    // draw horizontal line for left window
    positionTurtleAt (425, 500);
    drawingTurtle.turnRight();
    drawingTurtle.forward (100);
    drawingTurtle.turnLeft();
  }
  
  public void drawDoor () {
    
    drawFilledRectangle (75, 100, 350, 550, new Color(58, 51, 29));
  }
  
  public void drawSun () {
    
    drawCircle (100, 100, 125, 15, new Color(255, 233, 20));
  }
    
  public void drawDriveway () {
   
    // drawing driveway
    drawRectangle (70, 200, 350, 700, 5, new Color(0, 148, 255));
  }
  
  public void drawFilledRectangle (int width, int height, int x, int y) {
    
    setTurtleLineWidth (1);
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawFilledRectangle (width, height);
  }
  
  public void drawFilledRectangle (int width, int height, int x, int y, Color penColor) {
    
    setTurtleLineColor (penColor);
    drawFilledRectangle (width, height, x, y);
  }
  
  public void drawSquare (int length, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfSquare (length);
    drawingTurtle.drawSquare (length);
  }
  
  public void drawSquare (int length, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    drawSquare (length, x, y);
    setTurtleLineWidth (1);
  }
  
  public void drawSquare (int length, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    drawSquare (length, x, y);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  public void drawRectangle (int width, int height, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle (width, height);
  }
  
  public void drawRectangle (int width, int height, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle (width, height);
    setTurtleLineWidth (1);
  }
  
  public void drawRectangle (int width, int height, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle (width, height);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  public void drawEquilateralTriangle (int length, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateralTriangle (length);
  }
  
  public void drawEquilateralTriangle (int length, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateralTriangle (length);
    setTurtleLineWidth (1);
  }

  public void drawEquilateralTriangle (int length, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateralTriangle (length);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  public void drawCircle (int radius, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle (radius);
  }
  
  public void drawCircle (int radius, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle (radius);
    setTurtleLineWidth (1);
  }
  
  public void drawCircle (int radius, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle (radius);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
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