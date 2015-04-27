
public class Main {

	public static void main(String[] args) {
//		LinkedList link = new LinkedList();
//		link.add(1);
//		link.add(2);
//		link.Display();
		
		UniversalHashing uh = new UniversalHashing(4);
//		System.out.println(uh.hashFunction("123456"));
		uh.insert(1);
		uh.insert(2);
		uh.insert(3);
		uh.insert(4);
		uh.display();
		System.out.println();
		uh.insert(4);
		uh.display();
		uh.delete(4);
		uh.display();
		System.out.println();
		uh.search(4);
		
//		Bucket b = new Bucket();
//		b.link.add(1);
//		b.link.add(2);
//		b.link.add(3);
//		b.link.Display();
		
	}

}
