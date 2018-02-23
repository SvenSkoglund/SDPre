import java.util.Scanner;

public class ShallowGrandmother{
  public static void main(String [] args){
    Scanner keyboard = new Scanner ( System.in);
    int age;
    double income, cute;
    boolean allowed;

    System.out.println("Enter your age: ");
    age = keyboard.nextInt();

    System.out.println("Enter your yearly income: ");
    income = keyboard.nextDouble();

    System.out.println("How cute are you? 1-10");
    cute = keyboard.nextDouble();

    allowed = ( age > 25 && age < 40 && (income >50000 || cute >= 8.5));

    System.out.println("Allowed to date my granddaughter? " + allowed);



  }
}
