/**
 * @author Ethan McCarthy 3573807
 */

 import java.text.NumberFormat;

 public class WindowInstallationCalculator{
    public static void main(String[] args){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(2);

        Window window1 = new Window("99 Rose Point Rd", 1.5, 3325, true);
        StainedGlassWindow window2 = new StainedGlassWindow("965 Major Mack Dr W", 1.75, 5234, false, 1842);
        HopperWindow window3 = new HopperWindow("180 Hughson St", 4.5, 5054, true, true);
        StainedGlassWindow window4 = new StainedGlassWindow("925 W Georgia St", 2, 4235, true, 3733);
        StainedGlassWindow window5 = new StainedGlassWindow("2550 Rue Beaugrand", 1.78, 2950, false, 1475);
        HopperWindow window6 = new HopperWindow("970 Southdown Rd", 6, 3680, false, false);
        Window window7 = new Window("297 Bernard Ave", 1.8, 5287, false);
        HopperWindow window8 = new HopperWindow("21453 Lake Rd", 9.5, 8400, false, true);

        System.out.println("Address & Window height:\tWindow Size:\tInstallation Cost:");
        System.out.println("========================\t============\t==================");
        System.out.println(window1.getAddress() + "(" + window1.getHeight() + ")\t\t" + window1.getSize() + "cm^2\t" + "$" + formatter.format(window1.installationCost(0.05)));
        System.out.println(window2.getAddress() + "(" + window2.getHeight() + ")\t" + window2.getSize() + "cm^2\t" + "$" + formatter.format(window2.installationCost(0.07)));
        System.out.println(window3.getAddress() + "(" + window3.getHeight() + ")\t\t" + window3.getSize() + "cm^2\t" + "$" + formatter.format(window3.installationCost(0.07)));
        System.out.println(window4.getAddress() + "(" + window4.getHeight() + ")\t\t" + window4.getSize() + "cm^2\t" + "$" + formatter.format(window4.installationCost(0.07)));
        System.out.println(window5.getAddress() + "(" + window5.getHeight() + ")\t" + window5.getSize() + "cm^2\t" + "$" + formatter.format(window5.installationCost(0.14)));
        System.out.println(window6.getAddress() + "(" + window6.getHeight() + ")\t\t" + window6.getSize() + "cm^2\t" + "$" + formatter.format(window6.installationCost(0.12)));
        System.out.println(window7.getAddress() + "(" + window7.getHeight() + ")\t\t" + window7.getSize() + "cm^2\t" + "$" + formatter.format(window7.installationCost(0.04)));
        System.out.println(window8.getAddress() + "(" + window8.getHeight() + ")\t\t" + window8.getSize() + "cm^2\t" + "$" + formatter.format(window8.installationCost(0.04)));
    }
 }