/**
* @author Ethan McCarthy 3573807
*/

public class StainedGlassWindow extends Window{

	private double stainedSize;

	/**
	 * constructor 
	 * @param addressIn address from superclass
	 * @param heightIn height from superclass
	 * @param sizeIn size from superclass
	 * @param insulationIn insulation from superclass
	 * @param stainedSizeIn stained glass area
	 */
	public StainedGlassWindow(String addressIn, double heightIn, double sizeIn, boolean insulationIn, double stainedSizeIn){
		super (addressIn, heightIn, sizeIn, insulationIn);
		stainedSize = stainedSizeIn;
	
	}

	/**
	 * method to retreive the area of the stained part
	 * @return stained area
	 */
	public double getStainedSize(){
		return stainedSize;
	}

	/**
	 * method to get the total cost 
	 * @param materialRate how much per cm^2 
	 * @return the total cost
	 */
	public double installationCost(double materialRate){
		double cost = super.installationCost(materialRate);
		if(stainedSize > (super.getSize()/2)){
			cost += super.getSize() * 0.11;
		}

		else{
			cost += super.getSize()*0.14;
		}

		return cost;

	}



}
