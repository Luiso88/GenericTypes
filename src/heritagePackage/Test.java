package heritagePackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v[] = new Vehicle[3];
		v[0] = new Car(4, "Luis", "Green", 300, 23, 4, 300);
		v[1] = new Boat(1, "Robert", "Black", 35, 20);
		v[2] = new Motorbike(2, "Fede", "Red", 300, 5.5, 0, 100);
		((Car) v[0]).getWindows();
		((Boat) v[1]).move(10);
		((Motorbike) v[2]).move(10);
		System.out.println();
		for (int i = 0; i < v.length; i++){
			v[i].move(40);
		}
		
		for (int i = 0; i < v.length; i++){
			System.out.println(v[i].getPositionX());
		}
		// System.out.println(3.1+1.1);

		// System.out.println(v.toString());
		// System.out.println(c.toString());
	}
}
