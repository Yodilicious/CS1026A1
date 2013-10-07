import java.awt.Color; 

public class TurtleArt { 
 
  // Starting point of my program
  public static void main (String[] args) {
    
    TurtleArt myArt = new TurtleArt ();
   
    myArt.drawHouse ();
    myArt.drawTree ();
    myArt.drawChristmasTree();
    myArt.drawDoor ();
    myArt.drawWindows ();
    myArt.drawSun ();
    myArt.drawDriveway ();
    myArt.hideDrawingTurtle ();    
  }
 
  // Drawing a house
  public void drawHouse () {
    
    // Drawing the main part of the house
    drawFilledRectangle (400, 200, 350, 500, new Color(151, 51, 29));
    
    // Drawing the roof of the house
    drawEquilateralTriangle (400, 350, 225, 8, new Color(58, 51, 29));
  }
  
  // Drawing a christmas tree
  public void drawChristmasTree () {
    
    drawRectangle (50, 75, 75, 650, 2, new Color(152, 91, 0));
    drawEquilateralTriangle (100, 75, 570, 2, new Color(0, 255, 0));
  }
  
  // Drawing a tree
  public void drawTree () {
    
    drawFilledRectangle (100, 300, 650, 450, new Color(137, 73, 0));
    drawCircle (150, 650, 189, 5, new Color(38, 255, 77));
    drawCircle (55, 650, 450, 5, new Color(0, 0, 0));
  }
  
  // Drawing windows
  public void drawWindows () {
    
    drawSquare (100, 225, 500, 6, new Color(255, 255, 255));
    drawSquare (100, 475, 500, 6, new Color(255, 255, 255));
    drawSquare (66, 350, 325, 8, new Color(255, 101, 84));
    
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
    drawingTurtle.turnRight ();
    drawingTurtle.forward (100);
    drawingTurtle.turnLeft ();
    
    // draw horizontal line for left window
    positionTurtleAt (425, 500);
    drawingTurtle.turnRight ();
    drawingTurtle.forward (100);
    drawingTurtle.turnLeft ();
    
    // set the color for the roof window
    setTurtleLineColor (new Color(255, 101, 84));
    
    // drawing vertical line for roof window
    positionTurtleAt (350, 358);
    drawingTurtle.forward (66);
    
    // drawing horizontal line for roof window
    positionTurtleAt (317, 325);
    drawingTurtle.turnRight ();
    drawingTurtle.forward (66);
    drawingTurtle.turnLeft ();
  }
  
  // Drawing a door
  public void drawDoor () {
    
    drawFilledRectangle (75, 100, 350, 550, new Color(58, 51, 29));
  }
  
  // Drawing a sun
  public void drawSun () {
    
    drawCircle (100, 100, 125, 15, new Color(255, 233, 20));
  }
    
  // Drawing a driveway
  public void drawDriveway () {
   
    // drawing driveway
    drawRectangle (70, 200, 350, 700, 5, new Color(0, 148, 255));
  }
  
  // Drawing a filled rectangle with width, height, and centre position x, y
  public void drawFilledRectangle (int width, int height, int x, int y) {
    
    setTurtleLineWidth (1);
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawFilledRectangle (width, height);
  }
  
  // Drawing a filled rectangle with width, height, centre position x, y and color
  public void drawFilledRectangle (int width, int height, int x, int y, Color penColor) {
    
    setTurtleLineColor (penColor);
    drawFilledRectangle (width, height, x, y);
  }
  
  // Drawing a square with length and centre position x, y
  public void drawSquare (int length, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfSquare (length);
    drawingTurtle.drawSquare (length);
  }
  
  // Drawing a square with length, centre position x, y and pen width
  public void drawSquare (int length, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    drawSquare (length, x, y);
    setTurtleLineWidth (1);
  }
  
  // Drawing a square with length, centre position x, y, pen width, and color
  public void drawSquare (int length, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    drawSquare (length, x, y);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  // Drawing a rectangle with width, height, and centre position x, y
  public void drawRectangle (int width, int height, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle (width, height);
  }
  
  // Drawing a rectangle with width, height, centre position x, y and pen width
  public void drawRectangle (int width, int height, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle (width, height);
    setTurtleLineWidth (1);
  }
  
  // Drawing a rectangle with width, height, centre position x, y, pen width and pen color
  public void drawRectangle (int width, int height, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAt (x, y);
    positionTurtleAtTopLeftCornerOfRectangle (width, height);
    drawingTurtle.drawRectangle (width, height);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  // Drawing an equilateral triangle with length and centre position x, y
  public void drawEquilateralTriangle (int length, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateral (length);
  }
  
  // Drawing an equilateral triangle with length, x, y and pen width
  public void drawEquilateralTriangle (int length, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateral (length);
    setTurtleLineWidth (1);
  }

  // Drawing an equilateral triangle with length, centre position x, y , pen width, pen color
  public void drawEquilateralTriangle (int length, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAt (x, y);
    positionTurtleAtBottomLeftCornerOfEquilateralTriangle (length);
    drawingTurtle.drawEquilateral (length);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  // Drawing a circle with radius, centre position x, y 
  public void drawCircle (int radius, int x, int y) {
    
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle (radius);
  }
  
  // Drawing a circle with radius, centre position x, y and pen width
  public void drawCircle (int radius, int x, int y, int penWidth) {
    
    setTurtleLineWidth (penWidth);
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle (radius);
    setTurtleLineWidth (1);
  }
  
  // Drawing a circle with radius, centre position x, y pen width and color
  public void drawCircle (int radius, int x, int y, int penWidth, Color penColor) {
    
    setTurtleLineWidth (penWidth);
    setTurtleLineColor (penColor);
    positionTurtleAt (x, y);
    positionTurtleAtTheEdgeOfCircle (radius);
    drawingTurtle.drawCircle (radius);
    setTurtleLineWidth (1);
    setTurtleLineColor (new Color(0, 0, 0));
  }
  
  // Changing the width of the pen line 
  private void setTurtleLineWidth (int penWidth) {
  
    drawingTurtle.setPenWidth (penWidth);
  }
  
  // Changing the pen color
  private void setTurtleLineColor (Color penColor) {
    
    drawingTurtle.setPenColor (penColor);
  }
  
  // Start drawing
  private void startDrawing () {
    
    // Place the pen down.
    drawingTurtle.penDown ();
  }
  
  // Stop drawing
  private void stopDrawing () {
   
    // Pick the pen up
    drawingTurtle.penUp ();
  }
  
  // Positioning turtle at x and y coordinates
  private void positionTurtleAt (int x, int y) {
    
    // Pick the pen up
    stopDrawing ();
    
    // Positioning the turtle in the centre of the equilateral triangle
    drawingTurtle.moveTo (x, y);
    
    // Put pen down
    startDrawing ();
  }
  
  // Positioning thte turtle at the edge of circle
  private void positionTurtleAtTheEdgeOfCircle (int radius) {
  
    // Pick the pen up
    stopDrawing ();
    
    drawingTurtle.forward (radius);
    drawingTurtle.turnRight ();
    
    // Put pen down
    startDrawing ();
  }
  
  // Positioning the turtle at top left corner of square
  private void positionTurtleAtTopLeftCornerOfSquare (int length) {
  
    // Pick the pen up
    stopDrawing ();
    
    // This moves the turtle from the centre of the square 
    // to the bottom left corner for easy drawing.
    drawingTurtle.turnLeft ();
    drawingTurtle.forward (length / 2);
    drawingTurtle.turnRight ();
    drawingTurtle.forward (length / 2);
    
    // Put pen down
    startDrawing ();
  }
  
  // Positioning turtle at top left corner of rectangle
  private void positionTurtleAtTopLeftCornerOfRectangle (int width, int height) {
  
    // Pick the pen up
    stopDrawing ();
    
    // This moves the turtle from the centre of the rectangle 
    // to the bottom left corner for easy drawing
    drawingTurtle.turnLeft ();
    drawingTurtle.forward (width / 2);
    drawingTurtle.turnRight ();
    drawingTurtle.forward (height / 2);
    
    // Put pen down
    startDrawing ();
  }
   
  // Positioning the turtle at the bottom left corner of equilateral triangle
  private void positionTurtleAtBottomLeftCornerOfEquilateralTriangle (int length) {
    
    // Pick the pen up
    stopDrawing ();
    
    // Positioning the turtle at the left corner of the equilateral triangle  
    drawingTurtle.turnLeft ();
    drawingTurtle.forward (length / 2);
    drawingTurtle.turnLeft ();
    
    int height = (int)Math.round ((Math.sqrt(3) / 2) * length);
    
    drawingTurtle.forward (height / 2);
    drawingTurtle.turnRight ();
    drawingTurtle.turnRight ();
    
    // Put pen down
    startDrawing ();
  }
  
  // Hides the turtle 
  private void hideDrawingTurtle () {
  
    // Hiding turtle when finished
    drawingTurtle.hide ();
  }
  
  // Constructor for the TurtleArt class
  public TurtleArt() {
    World world = new World(800, 800);
    drawingTurtle = new Turtle(world);
  }
  
  // My drawing turtle
  private Turtle drawingTurtle;
}