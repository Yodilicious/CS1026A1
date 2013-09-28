public class Program {
  
  public static void main (String[] args) {
    
    Program program = new Program();
    program.initialize ();
    
    Square square = new Square (program.world);
    square.draw (200,0,0);
  }
 
  private void initialize () {
    
    world = new World (600, 600);
  }
  
  private World world;
}



