import java.util.ArrayList;
import java.util.Random;


public class UniversalHashing {

	private int n;
	private int a;
	//private ArrayList<Bucket> table;
	private Bucket table[];
	public UniversalHashing(int n) {
		this.n = n;
		Random rand = new Random();
		a = rand.nextInt(n)+1;
		System.out.println("a = " + a);
		table = new Bucket[n];
		for (int i = 0; i < table.length; i++) {
			table[i] = new Bucket();
		}
	}
	
	public int hashFunction(int X){
		int index = -1;
		index = X*a%n;
		return index;
	}
	public void insert(int ele){
		int i = hashFunction(ele);
		table[i].link.add(ele); 
	}
	public void search(int ele){
		int i = hashFunction(ele);
		if(table[i].link.find(ele) == true)
			System.out.println("element exist");
		else
			System.out.println("element exist");
	}
	public void delete(int ele){
		int i = hashFunction(ele);
		if(table[i].link.find(ele) == true){
			table[i].link.remove(ele);
			System.out.println("element deleted");
			return;
		}
		System.out.println("Not deleted");
	}
	public void display(){
		for (int i = 0; i < table.length; i++) {
			System.out.print( i + " : " );
			table[i].link.Display();
		}
	}

}
