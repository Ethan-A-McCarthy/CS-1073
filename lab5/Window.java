/**
* @author Ethan McCarthy 3573807
*/

public class Window{
	
	private String address;
	private double height;
	private double size;
	private boolean insulation;

	/**
	 * constructor
	 * @param addressIn address
	 * @param heightIn height
	 * @param sizeIn size
	 * @param insulationIn if the insulation is special or not 
	 */
	public Window(String addressIn, double heightIn, double sizeIn, boolean insulationIn){
		address = addressIn;
		height = heightIn;
		size =  sizeIn;
		insulation = insulationIn;	

	}

	/**
	 * 	getter method to get address
	 * @return the address
	 */
	public String getAddress(){
		return address;	
	}

	/**
	 * returns height 
	 * @return height 
	 */
	public double getHeight(){
		return height;	
	}

	/**
	 * returns area 
	 * @return size
	*/
	public double getSize(){
		return size;
	}

	/**
	 * returns wether or not the window has special insulation
	 * @return insulation
	 */
	public boolean getInsulation(){
		return insulation;
	}

	/**
	 * method to get the total cost 
	 * @param materialRate how much per cm^2 
	 * @return the total cost
	 */
	public double installationCost(double materialRate){
		double cost = 100 + (size * materialRate);
		if(insulation == true){
			cost += 25;
		}	
		return cost;

	}
}
