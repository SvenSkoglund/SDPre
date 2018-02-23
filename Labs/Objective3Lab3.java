import java.util.Scanner ;
public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    boolean yesNo = true;
    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("What year is it?");
    currentYear = input.nextInt();

    System.out.println("Have you had a birthday yet this year? (true or false)");
    yesNo = input.nextBoolean();

    if (yesNo == false){
      currentYear = currentYear - 1;
    }

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
