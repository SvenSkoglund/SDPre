import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      System.out.print("Please make a selection: ");
      selection = scanner.nextInt();

      if (selection == 1 ){
        System.out.println("Hello Human");
      }
      if (selection == 2 ){
        System.out.println("Eggs, Cheese, Bacon");
      }
      if (selection == 3 ){
        break;
      }
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
