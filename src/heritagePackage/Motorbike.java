package heritagePackage;

public class Motorbike extends Vehicle {

	protected int bhp;
	
		public Motorbike(int newWheels, String newDriver, String newColour, int newSpeed, double newPositionX, int newWindows, int newBhp) {
			super(newWheels, newDriver, newColour, newSpeed, newPositionX);
			this.bhp = newBhp;
			// TODO Auto-generated constructor stub
		}

		@Override
		protected void move(int time) {
			// TODO Auto-generated method stub
			
		}

}
