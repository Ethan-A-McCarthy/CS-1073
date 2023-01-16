/**
@author Ethan McCarthy 3573807
*/


public class Horse{

	private String name;

	private int age;

	private double costToRent;

	private Saddle saddle;


	public Horse(String nameIn, int ageIn, double costToRentIn, Saddle saddleIn){
		name = nameIn;
		age = ageIn;
		costToRent = costToRentIn;
		saddle = saddleIn;

	}


	public void setName(String nameIn){
		name = nameIn;
	}
	
	public void incrementAge(){
		age += 1; 	
	}
	
	public void setCostToRent(double costToRentIn){
		costToRent = costToRentIn;
	}
		
	public void setSaddle(Saddle saddleIn){
		saddle = saddleIn;
	}

	
	public getInfo(){
		return name + " (age: " + age ")"

	}

	


}

