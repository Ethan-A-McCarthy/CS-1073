import java.util.Scanner;
/**
   @author Ethan McCarthy 3573807
**/
public class InputAndOutput {

   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("My name is TOM. What is your name?");
	String userInput = sc.nextLine();
	System.out.println("Pleased to meet you, " + userInput);
	System.out.println("In which program are you enrolled?");
	String userProgram = sc.nextLine();
	System.out.println("You, " + userInput + " are in the " + userProgram  + " Program. Congrats!");
	}	
}
