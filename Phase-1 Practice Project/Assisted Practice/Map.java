import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		// TreeMap

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "AAA");
		map.put(101, "BBB");
		map.put(103, "CCC");

		System.out.println("Elements of TreeMap are ");
		for (Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}
		
		// Hashmap
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(104, "DDD");
		hm.put(105, "EEE");
		hm.put(106, "FFF");

		System.out.println("\nElements of Hashmap are ");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// HashTable

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(108, "XXX");
		ht.put(109, "YYY");
		ht.put(110, "ZZZ");

		System.out.println("\nElements of HashTable are ");
		for (Entry<Integer, String> n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

	

	}

}