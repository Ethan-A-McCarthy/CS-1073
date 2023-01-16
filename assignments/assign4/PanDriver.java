/**
 * @author Ethan McCarthy 3573807
 */
import java.util.Scanner;
import java.text.NumberFormat;

 public class PanDriver{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(3);
        formatter.setMinimumFractionDigits(3);

        double leastArea = 0;
        String type = "N/A";
        double mostVolume = 0;

        System.out.println("Select one of the following options: \n1 - Enter information for a circle pan\n2 - Enter information for a hexagon pan\n3 - Quit");
        System.out.println("Enter your choice: ");
        int userIn = scan.nextInt();

        

        while(userIn != 3){
            if (userIn == 1){
                System.out.println("Input depth of the pan (in cm): ");
                double depthIn = scan.nextDouble();

                while(depthIn <= 0){
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                    depthIn = scan.nextDouble();
                }
                
                System.out.println("Input the radius of the pan (in cm): ");
                double radiusIn = scan.nextDouble();

                while(radiusIn <= 0){
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                    radiusIn = scan.nextDouble();
                }

                CirclePan circlePan = new CirclePan(radiusIn, depthIn);
                System.out.println("Suface area of the pan: " + formatter.format(circlePan.surfaceArea()) + "cm^2");
                System.out.println("Volume of the pan: " + formatter.format(circlePan.calcVolume()) + "cm^3");

                if(leastArea == 0){
                    leastArea = circlePan.surfaceArea();
                    type = "Circle";
                }
                else if(circlePan.surfaceArea() < leastArea){
                    leastArea = circlePan.surfaceArea();
                    type = "Circle";
                }
                
                if(mostVolume == 0){
                    mostVolume = circlePan.calcVolume();
                    type = "Circle";
                }
                else if(circlePan.calcVolume() > mostVolume){
                    mostVolume = circlePan.calcVolume();
                    type = "Circle";
                }

            }

            else if (userIn == 2){
                System.out.println("Input depth the depth of the pan: ");
                double depthIn = scan.nextDouble();

                while(depthIn <= 0){
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                    depthIn = scan.nextDouble();
                }

                System.out.println("Input the length of the base edge of the pan: ");
                double baseEdgeIn = scan.nextDouble();

                while(baseEdgeIn <= 0){
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                    baseEdgeIn = scan.nextDouble();
                }

                HexagonPan hexPan = new HexagonPan(baseEdgeIn, depthIn);
                System.out.println("Surface area of the pan: " + formatter.format(hexPan.surfaceArea()) + "cm^2");
                System.out.println("Volume of the pan: " + formatter.format(hexPan.volume()) + "cm^3");

                if(leastArea == 0){
                    leastArea = hexPan.surfaceArea();
                    type = "Hexagon";
                }
                else if(hexPan.surfaceArea() < leastArea){
                    leastArea = hexPan.surfaceArea();
                    type = "Hexagon";
                }

                if(mostVolume == 0){
                    mostVolume = hexPan.volume();
                    type = "Hexagon";
                }
                else if(hexPan.volume() > mostVolume){
                    mostVolume = hexPan.volume();
                    type = "Hexagon";
                }
            }

            else{
                System.out.println("Invalid input. Please input and accepted number.");
            }

            System.out.println("Select one of the following options: \n1 - Enter information for a circle pan\n2 - Enter information for a hexagon pan\n3 - Quit");
            System.out.println("Enter your choice: ");
            userIn = scan.nextInt();

        }

        System.out.println("\nThe pan with the smallest surface area is a: " + type + "\nSurface Area: " + formatter.format(leastArea) + "cm^2");
        System.out.println("The pan with the largest volume is a: " + type + "\nVolume: " + formatter.format(mostVolume) + "cm^3");

    }
 }