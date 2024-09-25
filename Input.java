import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println("Sum of x+y = " + z);
    
    Scanner test = new Scanner(System.in);
    System.out.println("Enter anything: ");
    
    
    String input = test.nextLine();
    System.out.println("You inputted: " + input);
  }
}
