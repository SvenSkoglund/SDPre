import java.util.Scanner;

public class Objective3Lab5 {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    double num1, num2, sum;

    System.out.print("Enter the first number: ");
    num1 = input.nextDouble();

    System.out.print("Enter the second number: ");
    num2 = input.nextDouble();

    sum = num1 + num2;

    System.out.println(num1 + " + " + num2 + " = " + sum);


  }
}
