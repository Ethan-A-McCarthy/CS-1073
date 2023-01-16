/**
@author Ethan McCarthy 3573807
*/
public class Saddle{
	
	//the material of the saddle 
	private String material;
	
	//the width of the saddle 
	private double width;
	
	//the cost of the saddle 
	private double cost;

	
	/**
	The constructor method to constuct a saddle with the material,
	width, and cost of the saddle.
	@param materialIn the material
	@param widthIn the width
	@param costIn the cost	
	*/
	public Saddle(String materialIn, double  widthIn, double costIn){
		material = materialIn;
		width = widthIn;
		cost = costIn;
	}


	/**
	method to retrieve the material of the saddle
	@return the material of the saddle
	*/
	public String getMaterial(){
		return material;
	}
	
	/**
	method to retrieve the width of the saddle
	@return the width of the saddle
	*/
	public double getWidth(){
		return width;
	}
	
	/**
	method to retrieve the cost of the saddle
	@return the cost of the saddle
	*/
	public double getCost(){
		return cost;
	}






}
