/**
 * @author Ethan McCarthy 3573807
 */

 public class LineSegmentTest{

    public static void main(String[] args){

        CartesianPoint point1 = new CartesianPoint(1, 4);
        CartesianPoint point2 = new CartesianPoint(-5, -10);

        LineSegment line1 = new LineSegment(point1, point2);
        LineSegment line2 = new LineSegment(1, 30, 2, -37);

        CartesianPoint p1 = new CartesianPoint(1, 4);
        CartesianPoint p2 = new CartesianPoint(-100, 100);

        System.out.println("The slope of line segment 1 is: " + line1.slope());
        System.out.println("The legnth of line segment 1 is: " + line1.length() + "\n");

        System.out.println("The slope of line segment 2 is: " + line2.slope());
        System.out.println("The length of line segment 2 is: " + line2.slope() + "\n");

        if(line1.crossesAxis() == true){
            System.out.println("The first line segment crosses at least one axis.");
        }
        else{
            System.out.println("The first line does not cross an axis");
        }

        if(line2.crossesAxis() == true){
            System.out.println("The second line crosses at least one axis.");
        }
        else{
            System.out.println("The second line does not cross an axis.");
        }

        if(line1.containsPoint(p1) == true){
            System.out.println("The point p1 is on the first line.");
        }
        else{
            System.out.println("The point p1 is not on the line.");
        }

        if(line1.containsPoint(p2) == true){
            System.out.println("The point p2 is on the line.");
        }
        else{
            System.out.println("The point p2 is not on the line.");
        }



    }
 }