package Collections;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList addressList = new LinkedList();
		addressList.add("Bangalore");
		addressList.add("Hyderabad");
		addressList.add("Ananthapur");
		addressList.add("Chittor");
		addressList.add("Tirupati");
		addressList.set(0, "kadapa");
		addressList.add(0, "kurnool");

		System.out.println(addressList);
		System.out.println(addressList.getFirst());
		System.out.println(addressList.getLast());
		System.out.println(addressList.removeFirst());
		System.out.println(addressList.isEmpty());
		System.out.println(addressList.containsAll(addressList));
		System.out.println(addressList.equals(addressList));
		System.out.println(addressList);

	}

}
