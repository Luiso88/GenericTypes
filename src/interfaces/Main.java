 package interfaces;

public class Main {

	public static void main(String[] args) {
		List <String> list = new List();
		list.add("Matt");
		list.add("Luis");
		list.add("Sarah");
		list.print();
		List <Integer> list2 = new List();
		list2.add(22);
		list2.add(44);
		list2.print();
		List <Person> list3 = new List();
		list3.add(new Person(23, "Sarah"));
		list3.add(new Person(34, "Luis"));
		list3.print();

	}

}
