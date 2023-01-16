import java.util.Scanner;
/**
 * @author Ethan McCarthy 3573807
 */

public class TabletPicker{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        boolean answer;
        //initialize the scanner and the answer variable
        
        //asks the user to input yes or no and start asking the questions
        System.out.println("(Answer \"yes\" or \"no\" to the following questions.)");
        System.out.println("Is the larger screen necessary for your job?");
        String input = read.nextLine();

        //answer variable is true if the input is yes 
        answer = input.equals("yes");

        //if answer is true tell the user to buy the tablet if not keep asking questions
        if(answer == true){
            System.out.println("Buy the 13 inch tablet.");
        }
        else{
            //keep asking questions 
            System.out.println("Will you watch a lot of content on your tablet?");
            input = read.nextLine();
            answer = input.equals("yes");

            if (answer == true){
                System.out.println("Buy the 13 inch tablet.");
            }
            else{
                System.out.println("Will you draw on your tablet frequently?");
                input = read.nextLine();
                answer = input.equals("yes");

                if(answer == false){
                    System.out.println("You should buy the 11 inch tablet.");
                }
                else{
                    //last question 
                    System.out.println("Does the extra screen space matter to you when drawing?");
                    input = read.nextLine();
                    answer = input.equals("yes");

                    if (answer == true){
                        System.out.println("You should buy the 13 inch tablet.");
                    }
                    else{
                        System.out.println("You should buy the 11 inch tablet.");
                    }
                }
            }
        }


        

        

    }
}