
public class LinkedList {
	
	private Node Head = new Node();
	public LinkedList() {
		Head = null;
	}
	public LinkedList(int ele){
		Head.value = ele;
		Head.next=null;
	}
	public boolean add(int ele){
		Node temp = new Node();
		if(Head == null){
			temp.value=ele;
			temp.next=null;
			Head = temp;
			return true;
		}
		for(temp = Head; temp.next != null ; temp=temp.next);
		Node tail = new Node();
		tail.value = ele;
		tail.next = null;
		temp.next = tail;
		return true;
	}
	
	public void Display(){
		Node temp = new Node();
		temp = Head;
		if(Head == null){
			System.out.println();
			return;
		}
		while (temp.next != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.print(temp.value + " ");
		System.out.println();
	}
	public boolean remove(int ele){
		Node curr = Head;
		Node prev = null;
		if( Head.next == null){
			Head = null;
			return true;
		}
		if (Head.value == ele) {
			Head = curr.next;
			return true;
		}
		while (curr != null) {
			if(curr.value == ele){
				prev.next = curr.next;
				curr = null;
				return true;
			}
			prev = curr;
			curr = curr.next;
		}
		return false;
	}
	public boolean find(int ele){
		Node temp = new Node();
		temp = Head;
		while (temp.next != null) {
			if (temp.value == ele) {
				return true;
			}
			temp = temp.next;
		}
		if(temp.value == ele)
			return true;
		return false;
	}
	
}



