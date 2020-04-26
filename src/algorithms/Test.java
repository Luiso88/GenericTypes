package algorithms;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BinarySearch Algorithm");
		BinarySearchClass bs = new BinarySearchClass();
		int m[] = { 34, 65, 23, 100, 24, 54, 13, 58, 25, 17 };// {sorted: 13,17,23,24,25,34,54,58,65,100}
		if (bs.binarySearch(m, 24)) {
			System.out.println("The number has been found");
		} else
			System.out.println("There was an error trying to find the number");

		// here i m writing the same test in a more compact way
		BinarySearchClass bs2 = new BinarySearchClass();
		if (bs2.binarySearch(new int[] { 34, 65, 23, 100, 24, 54, 13, 58, 25, 17 }, 24)) {
			System.out.println("The number was found -- ok");
		} else {
			System.out.println("The number was not found -- KO");
		}

		// search an empty array
		BinarySearchClass bs3 = new BinarySearchClass();
		if (bs3.binarySearch(new int[] {}, 24)) {
			System.out.println("The number was found -- KO");
		} else {
			System.out.println("The number was not found -- ok");
		}

		// search an array not containing the value we are looking for
		BinarySearchClass bs4 = new BinarySearchClass();
		if (bs4.binarySearch(new int[] { 1, 2, 3 }, 24)) {
			System.out.println("The number was found -- KO");
		} else {
			System.out.println("The number was not found -- ok");
		}

		// search a negative value
		BinarySearchClass bs5 = new BinarySearchClass();
		if (bs5.binarySearch(new int[] { 1, 2, -7, 3 }, -7)) {
			System.out.println("The number was found -- ok");
		} else {
			System.out.println("The number was not found -- KO");
		}

		// search an array containing multiple times the value we are looking for
		BinarySearchClass bs6 = new BinarySearchClass();
		if (bs6.binarySearch(new int[] { 1, 24, 2, 24, 3, 24, 24, 24 }, 24)) {
			System.out.println("The number was found -- ok");
		} else {
			System.out.println("The number was not found -- KO");
		}



	}

}
