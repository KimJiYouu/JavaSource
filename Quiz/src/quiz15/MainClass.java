package quiz15;

public class MainClass {
	public static void main(String[] args) {

		IBag bag = new IBagClass();

		bag.insert("a");
		bag.insert("b");
		bag.insert("c");
		bag.insert("d");

		bag.print();
		
		System.out.println(bag.search("c"));
		System.out.println(bag.search("e"));
		
		System.out.println(bag.delete("a"));
		System.out.println(bag.delete("a"));

		bag.print();

		bag.insert("a");
		bag.insert("b");
		
		bag.print();
		
		bag.delete("c");
		
		bag.print();
	}
}
