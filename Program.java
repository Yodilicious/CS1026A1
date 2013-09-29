import java.awt.Color;

public class Program {
  
  public static void main (String[] args) {
    
    Program program = new Program();
    program.initialize ();
    
    Color myFirstPenColor = Color.blue;
    Color mySecondPenColor = Color.red;
    
    Square square = new Square (program.world);
    square.draw (200, program.world.getWidth() / 2, program.world.getHeight() / 2, myFirstPenColor, 10);
    square.draw (200, (program.world.getWidth() / 2) + 100, (program.world.getHeight() / 2) + 100, mySecondPenColor, 6);
  
    Rectangle rectangle = new Rectangle (program.world);
    rectangle.draw (200, 100, (program.world.getWidth() / 2) - 100, (program.world.getHeight() / 2) - 100, myFirstPenColor, 10);
    rectangle.draw (100, 200, (program.world.getWidth() / 2) - 200, (program.world.getHeight() / 2) - 200, mySecondPenColor, 10);
  
    EquilateralTriangle triangle =  new EquilateralTriangle (program.world);
    triangle.draw (200, (program.world.getWidth() / 2) + 200, (program.world.getHeight() / 2) + 200, mySecondPenColor, 6);
    
    Circle circle = new Circle (program.world);
    circle.draw (250, (program.world.getWidth() / 2) + 0, program.world.getHeight() / 2, myFirstPenColor, 2);
    circle.draw (90, (program.world.getWidth() / 2), (program.world.getHeight() / 2)+300, myFirstPenColor, 5);
  }
  
  public void drawSquare (int width) {
  
  }
  
  public void drawRectangle (int width, int height) {
  
  }
  
  public void drawEquilateral (int lenegth) {
  
  }
  
  private void initialize () {
    
    world = new World (800, 800);
  }
  
  private World world;
}



