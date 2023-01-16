/**
@author Ethan McCarthy 3573807
*/

import java.util.Scanner;
public class TempApp{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);//initialize scanner
		System.out.println("Input your preferred temperature value. (Integers Only)");
		int prefTemp = scan.nextInt();
		//ask user for preferred temp and record and store it 

		System.out.println("Now start putting in the outside temperature values.");
		int tempIn = scan.nextInt();
		//starts the input cycle 
		
		//initialize all of the variables that will be used
		int highTemp = tempIn;
		int lowTemp = tempIn;
		int range = 0;		
		int count = 0; 
		int ave = 0;

		//if an input is higher than 100 the program stops taking inputs 
		while (tempIn <= 100){	
			ave += tempIn;
			if((tempIn - prefTemp) <= 2 && (tempIn - prefTemp) >= -2){
				//math to see if the input is within 2 degrees of the preferred 
				range++; 
			}

			if (tempIn > highTemp){
				//takes the highest temp
				highTemp = tempIn;		
			}			
			
			if (tempIn < lowTemp){
				//takes the lowest temp
				lowTemp = tempIn;
			}
			
			count++;//count up
			tempIn = scan.nextInt();//take next input 
		}


		System.out.println("Your Temperature report:\n" + count + " temperatures total\n" + range + " temperatures within the preferred range");
		//temp report
		
		//shows the conservative average if there is 3 or more temps 
		if (count >= 3){
			float consAve = (ave - highTemp - lowTemp)/ (count - 2);
			System.out.println("Conservative average temperature: " + consAve);
		}
		else {
			System.out.println("Not enough data to calculate the conservative average.");
		}

	}

}
