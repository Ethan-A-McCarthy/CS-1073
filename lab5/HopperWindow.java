/**
* @author Ethan McCarthy 3573807
*/

public class HopperWindow extends Window{
		private boolean inwards;
		
		/**
		 * constructor 
		 * @param addressIn address from superclass
		 * @param heightIn height from superclass
		 * @param sizeIn size from superclass
		 * @param insulationIn insulation from superclass
		 * @param stainedSizeIn stained glass area
		 */
		public HopperWindow(String addressIn, double heightIn, double sizeIn, boolean insulationIn, boolean inwardsIn){
			super (addressIn, heightIn, sizeIn, insulationIn);
			inwards = inwardsIn;	

		}
		
		/**
		 * returns if the hopper window open out or in 
		 * @return if its inward or not
		 */
		public boolean inwardsStatus(){
			return inwards;
		}

		/**
		 * method to get the total cost 
		 * @param materialRate how much per cm^2 
	 	 * @return the total cost
		 */
		public double installationCost(double materialRate){
			double cost = super.installationCost(materialRate);
			if(inwards == true){
				cost += 125;
			}
			else{
				cost += 75;
			}

			return cost;

		}
	}
