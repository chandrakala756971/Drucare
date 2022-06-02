package Collections;
import java.util.TreeSet;
public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet nameSet = new TreeSet();
		nameSet.add("buddi");
		nameSet.add("laddu");

		nameSet.add("kala");
		nameSet.add("Srikanth");
		nameSet.add("chandra");
		nameSet.add("sekhar");
		nameSet.add("Raja");
		System.out.println(nameSet);
		System.out.println(nameSet.first());
		System.out.println(nameSet.last());
		System.out.println(nameSet.headSet("Sai"));
		System.out.println(nameSet.tailSet("Raju"));
		System.out.println(nameSet.subSet("Prashanth", "Shiva"));
		System.out.println(nameSet.size());
		System.out.println(nameSet.contains("Srikanth"));
		System.out.println(nameSet.containsAll(nameSet));


	}

}
