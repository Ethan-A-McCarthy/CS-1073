/**
 * @author Ethan McCarthy 3573807
 */
import java.util.Scanner;

 public class NumberSystem{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number between 1 and 99999:");
        int input = scan.nextInt();

        while(input < 1 || input > 99999){
            System.out.println("Invalid input. Please input a number within the range.");
            input = scan.nextInt();
        }

        int x, mLowercase, mUppercase, hLowercase, hUppercase, fLowercase, fUppercase, eLowercase, eUppercase, rLowercase, rUppercase;
        x = mLowercase = mUppercase = hLowercase = hUppercase = fLowercase = fUppercase = eLowercase = eUppercase = rLowercase = rUppercase = 0;

        while (input > 0){
            if((input/59049) != 0){
                x = input/59049;
                input = input % 59049;
            }

            if((input/19683) != 0){
                mUppercase = input/19683;
                input = input % 19683;
            }

            if((input/6561) != 0 ){
                mLowercase = input/6561;
                input = input % 6561;
            }

            if((input/2187) != 0){
                hUppercase = input/2187;
                input = input % 2187;
            }

            if((input/729) != 0){
                hLowercase = input/729;
                input = input % 729;
            }

            if((input/243) != 0){
                fUppercase = input/243;
                input = input % 243;
            }

            if((input/81) != 0){
                fLowercase = input/81;
                input = input % 81;
            }

            if((input/27) != 0){
                eUppercase = input/27;
                input = input % 27;
            }

            if((input/9) != 0){
                eLowercase = input/9;
                input = input % 9;
            }

            if((input/3) != 0){
                rUppercase = input/3;
                input = input % 3;
            }

            if((input/1) != 0){
                rLowercase = input/1;
                input = input % 1;
            }

        }

        for (int i = 0; i < rLowercase; i++){
            System.out.print("r");
        }

        for (int i = 0; i < rUppercase; i++){
            System.out.print("R");
        }

        for (int i = 0; i < eLowercase; i++){
            System.out.print("e");
        }

        for (int i = 0; i < eUppercase; i++){
            System.out.print("E");
        }

        for (int i = 0; i < fLowercase; i++){
            System.out.print("f");
        }

        for (int i = 0; i < fUppercase; i++){
            System.out.print("F");
        }

        for (int i = 0; i < hLowercase; i++){
            System.out.print("h");
        }

        for (int i = 0; i < hUppercase; i++){
            System.out.print("H");
        }

        for (int i = 0; i < mLowercase; i++){
            System.out.print("m");
        }

        for (int i = 0; i < mUppercase; i++){
            System.out.print("M");
        }

        for (int i = 0; i < x; i++){
            System.out.print("X");
        }

    }
 }