package heritagePackage;

public class Car extends Vehicle {

	private int windows;
	private int bhp;
	
	public Car(int newWheels, String newDriver, String newColour, int newSpeed, double newPositionX, int newWindows, int newBhp) {
		super(newWheels, newDriver, newColour, newSpeed, newPositionX);
		this.windows = newWindows;
		this.bhp = newBhp;
		// TODO Auto-generated constructor stub
	}
	
	
	protected int getWindows() {
		return windows;
	}


	public void setWindows(int windows) {
		this.windows = windows;
	}


	protected int getBhp() {
		return bhp;
	}


	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	@Override
	public void move(int time) {
		this.positionX = positionX + (int) (Math.random()*99);
	}

	@Override
	public String toString() {
		return super.toString()+"and it also has "+this.windows+" windows and "+this.bhp+" horse power.";
	}
	
}
