/**
 @author Ethan McCarthy 3573807
 */

 public class Tab{

    //member running the tab
    private String member;

    //seat number of the tab
    private int seatNumber;

    //amount owed on the tab
    private double amountOwed;

    /**
     * constuctor method to initialize the variables
     * @param memberIn
     * @param seatNumberIn
     */
    public Tab(String memberIn, int seatNumberIn){
        member = memberIn;
        seatNumber = seatNumberIn;
        amountOwed = 0.00;
    }


    //methods to recieve the information in the constructed variable 
    public String getMemberName(){
        return member;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public double getAmountOwed(){
        return amountOwed; 
    }


    /**
     *method that adds the price of an item to the tab
     @param itemPrice
    */
    public void buyItem(double itemPrice){
        amountOwed += itemPrice;
    }

    /**
     * method to calculate the tip and output it 
     * @param tipPercent
     * @param tip
     */
    public double addTip(double tipPercent){
        double tip;
        tip = (tipPercent/100) * amountOwed;
        return tip;
    }



 }