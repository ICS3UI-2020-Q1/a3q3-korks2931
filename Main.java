import java.util.Scanner;
/**
 * this program will tell the user their average by the given letter grade.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    // ask the user for a letter grade 
    System.out.println("Please enter a letter grade");
    
    // use a switch case
    // letter grades
    // declare a variable to store letterGrades
    String letterGrades = input.nextLine();
    switch(letterGrades){
    case "A":
    System.out.println("This is between 80% and 100%");
    break;
    case "B": 
    System.out.println("This is between 70% and 79%");
    break;
    case "C": 
    System.out.println("This is between 60% and 69%");
    break;
    case "D": 
    System.out.println("This is between 50% and 59%");
    break;
    case "F": 
    System.out.println("This is between 0% and 49%");
    break;
    }
  }
}
