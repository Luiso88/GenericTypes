package heritagePackage;

public abstract class Vehicle {
	private int wheels;

	public Vehicle(int newWheels, String newDriver, String newColour, int newSpeed, double newPositionX) {
		this.wheels = newWheels;
		this.driver = newDriver;
		this.colour = newColour;
		this.speed = newSpeed;
		this.positionX = newPositionX;

	}

	private double relativeMovement(int time) {
		return speed * time;
	}

	protected int getWheels() {
		return wheels;
	}

	protected double getRelativeMovement(int time) {
		return relativeMovement(time);
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getPositionX() {
		return positionX;
	}

	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	private String driver;
	private String colour;
	protected int speed;
	protected double positionX;

	protected abstract void move(int time);
}
