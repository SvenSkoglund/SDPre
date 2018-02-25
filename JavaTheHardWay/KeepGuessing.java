import java.util.Scanner;

public class KeepGuessing {
  public static void main ( String [] args ){
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)( 10 * Math.random() );

    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("Try to guess it!");
    System.out.print( "Your guess: ");
    guess = keyboard.nextInt();

    while ( secret != guess ) {
      if ( guess < secret ) {
        System.out.print("That is incorrect.");
        System.out.print("Try again. \n> ");

        //added these lines to break the ifinite loop
        guess = keyboard.nextInt();
        System.out.println();
      }

    }
    System.out.println( "You guessed it! The coorect number was:\t" + secret);


  }
}
