/**
 * @author Ethan McCarthy 3573807
 */

 public class LineSegment{
    
    //endpoint 1
    private CartesianPoint endpoint1;

    //endpoint 2 
    private CartesianPoint endpoint2;

    /**
     * constructor for the line segment
     * @param point1 first point 
     * @param point2 second point
     */
    public LineSegment(CartesianPoint point1, CartesianPoint point2){
        endpoint1 = point1;
        endpoint2 = point2;
    }

    /**
     * another line constructor using x and y values instead of a cartesian point
     * @param xVal1
     * @param yVal1
     * @param xVal2
     * @param yVal2
     */
    public LineSegment(double xVal1, double yVal1, double xVal2, double yVal2){
        endpoint1 = new CartesianPoint(xVal1, yVal1);
        endpoint2 = new CartesianPoint(xVal2, yVal2);
    }

    /**
     * method to get endpoint 1
     * @return first endpoint 
     */
    public CartesianPoint getEndpoint1() {
        return endpoint1;
    }

    /**
     * method to get endpoint 2
     * @return second endpoint 
     */
    public CartesianPoint getEndpoint2() {
        return endpoint2;
    }

    /**
     * retrieve info about the line segment 
     * @return information in a string 
     */
    public String toString(){
        return "Line Segment:\n\tStarting Point: " + endpoint1 + "\n\tEndpoint: " + endpoint2;
    }

    /**
     * method to calculate the length
     * @return the length 
     */
    public double length(){
        return endpoint1.distance(endpoint2);
    }

    /**
     * method to check if the line crosses an axis
     * @return true or false
     */
    public boolean crossesAxis(){
        if ((endpoint1.getX() < 0 && endpoint2.getX() > 0) || (endpoint1.getX() > 0 && endpoint2.getX() < 0)){
            return true;
        }
        else if((endpoint1.getY() < 0 && endpoint2.getY() > 0) || (endpoint1.getY() > 0 && endpoint2.getY() < 0)){
            return true;
        }
        else{
            return false;
        }
        
    }

    /**
     * method to calculate the slope of the line 
     * @return the slope 
     */
    public double slope(){
        if((endpoint2.getX() - endpoint1.getX()) == 0){
            return Double.POSITIVE_INFINITY;
        }
        else{
        double slope = (endpoint2.getY() - endpoint1.getY()) / (endpoint2.getX() - endpoint1.getX());
        return slope;
        }
    }

    /**
     * method to see if the given point is on the line or not 
     * @param pointIn given point 
     * @return true or false
     */
    public boolean containsPoint(CartesianPoint pointIn){
        //y=mx+b
        double x = pointIn.getX();
        double y = pointIn.getY();
        double TOLERANCE = 1e-14;

        //getting b
        double yInt = y - (slope() * x);

        //checks to see if its on the line segment 
        if (Math.abs((slope()*x + yInt) - y) < TOLERANCE){
            return true;
        }
        else{
            return false;
        }

    }

 }