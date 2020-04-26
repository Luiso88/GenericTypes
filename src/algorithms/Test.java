package algorithms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchClass bs = new BinarySearchClass();
		int m[] = {34,65,23,100,24,54,13,58,25,17};//{sorted: 13,17,23,24,25,34,54,58,65,100}
		if(bs.binarySearch(m, 24)) {
			System.out.println("The number has been found");
		}
		else
			System.out.println("There was an error trying to found the number");
		
	}

}
