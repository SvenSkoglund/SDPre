import java.util.Scanner;

public class SafeSquareRoot  {
  public static void main ( String [] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x,y;

    System.out.print("Give me a number, and I whill find its square root (no negatives) : ");
    x = keyboard.nextDouble();

    while ( x < 0 ){
      System.out.print("No negatives. Please enter a positive number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y );
  }
}
