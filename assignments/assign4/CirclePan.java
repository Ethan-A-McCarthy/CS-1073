/**
 * @author Ethan McCarthy 3573807
 */

public class CirclePan{
    private double radius;

    private double depth;

    /**
     * constructor to make the circle pan 
     * @param radiusIn radius input
     * @param depthIn depth input
     */
    public CirclePan (double radiusIn, double depthIn){
        radius = radiusIn;
        depth = depthIn;
    }

    /**
     * get the radius of the pan 
     * @return the radius of the pan
     */
    public double getRadius(){
        return radius;
    }

    /**
     * get the depth of the pan 
     * @return the depth of the pan
     */
    public double getDepth(){
        return depth;
    }

    /**
     * method to calculate the suface area of the pan and return it 
     * @return the total surface area 
     */
    public double surfaceArea(){
        double area = (Math.PI * radius * radius) + (Math.PI * 2 * radius * depth);
        return area; 
    }

    /**
     * method to calulate the total volume of the pan
     * @return the total volume of the pan 
     */
    public double calcVolume(){
        double volume = (Math.PI * radius * radius * depth);
        return volume;
    }

}