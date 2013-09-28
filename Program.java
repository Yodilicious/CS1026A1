import java.awt.Color;

public class Program {
  
  public static void main (String[] args) {
    
    Program program = new Program();
    program.initialize ();
    
    Color myFirstPenColor = Color.blue;
    
    Square square = new Square (program.world);
    square.draw (200, program.world.getWidth() / 2, program.world.getHeight() / 2, myFirstPenColor);
  }
 
  private void initialize () {
    
    world = new World (800, 800);
  }
  
  private World world;
}



