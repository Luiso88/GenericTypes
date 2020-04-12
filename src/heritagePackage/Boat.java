/**
 * 
 */
package heritagePackage;


/**
 * @author Luis Castillo
 *
 */
public class Boat extends Vehicle {


	
	public Boat(int newWheels, String newDriver, String newColour, int newSpeed, double newPositionX) {
		super(newWheels, newDriver, newColour, newSpeed, newPositionX);
		// TODO Auto-generated constructor stub
	}

	private double relativeMovement(int time) {
		return speed*time;
	}
	
	@Override
	protected void move(int time) {
		System.out.println("the time settled is: "+time+"");
		System.out.println("the current position of the boat before this method takes place is: "+positionX+"");
		System.out.println("the current speed before this method takes place is: "+speed+"");
		System.out.println("the relative movement is going to be calculated by multiplying the current speed, "+speed+" by the time, "+time+" \n"
				+ "as a result the relative movement has been settled to "+relativeMovement(time));
		double auxPosition = positionX; 
		positionX = positionX + relativeMovement(time);
		System.out.println("the current position after this method takes place (adding to the previous position, "+auxPosition+" the relative movement "+relativeMovement(time)+") is: "+positionX+"");
	}

	

	@Override
	public String toString() {
		return "The boat's colour is "+getColour()+" it has "+getWheels()+" wheels, it is being drove by, "+getDriver()+" its current speed is "+speed+" km/h, its position is "+getPositionX()+" ";
	}
	
	
	
	
	
	
	
}
