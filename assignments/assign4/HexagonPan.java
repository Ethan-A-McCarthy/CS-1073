/**
 * @author Ethan McCarthy 3573807
 */

 public class HexagonPan{
    private double baseEdge;
    private double depth;
    private double baseArea;

    /**
     * hexagon pan constructor 
     * @param baseEdgeIn edge of base 
     * @param depthIn depth
     */
    public HexagonPan (double baseEdgeIn, double depthIn){
        baseEdge = baseEdgeIn;
        depth = depthIn;
        baseArea = (((3*Math.sqrt(3))/2) * (baseEdgeIn * baseEdgeIn));
    }

    /**
     * get edge of base
     * @return base edge 
     */
    public double getBaseEdge(){
        return baseEdge;
    }

    /**
     * get the depth of the pan 
     * @return depth 
     */
    public double getDepth(){
        return depth;
    }

    /**
     * get the area of the base of the pan 
     * @return area of the base 
     */
    public double getBaseArea(){
        return baseArea;
    }

    /**
     * method to calculate the total surface area of the pan
     * @return the total surface area
     */
    public double surfaceArea(){
        double surfaceArea;
        surfaceArea = baseArea + (baseEdge * 6 * depth);
        return surfaceArea;
    }

    /**
     * method to calculate the volume of the cake pan 
     * @return the total volume that the pan can hold 
     */
    public double volume(){
        double volume;
        volume = baseArea * depth;
        return volume;
    }


 }