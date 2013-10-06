
/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods //////////////////////
  
  // drawSquare method that draws a square starting at the top
  // left corner facing up and finishing in the same position.
  public void drawSquare(int length) {
    
    for(int i = 0; i < 4; i++) {
      
      this.turnRight();
      this.forward(length);
    }
  }
  
  // drawRectangle method that draws a rectangle starting at the top
  // left corner facing up and finishing in the same position.
  public void drawRectangle(int width, int height) {
    
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(height);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(height);
  }

  // drawEquilateralTriangle method that draws an equilateral triangle starting at one vertex
  // facing up and finishing at the same vertex.
  public void drawEquilateralTriangle(int length) {
    
    this.turn(30);
    this.forward (length);
    this.turn(120);
    this.forward (length);
    this.turn(120);
    this.forward (length);
    this.turnRight ();
  }
  
  // drawCircle method that draws a circle
  public void drawCircle (int radius) {
    
    int steps = 90;
    
    // Drawing circle.
    double circumference = 2 * Math.PI * radius;
    int sectionLength = (int)Math.round (circumference / steps);
    int angle = (360 / steps);
    for (int i = 0; i < steps; i++) {
    
      this.forward (sectionLength);
      this.turn (angle);
    }
  }
    
  // drawRectangle method that draws a rectangle starting at the top
  // left corner facing up and finishing in the same position.
  public void drawFilledRectangle(int width, int height) {
      
    this.turnRight();
    for(int i = 0; i < height / 2; i++) {
        
      this.forward(width);
      this.turnRight();
      this.forward(1);
      this.turnRight();
      this.forward(width);
      this.turnLeft();
      this.forward(1);
      this.turnLeft();
    }
    this.setHeading(0.0);
  }
} // end of class Turtle, put all new methods before this