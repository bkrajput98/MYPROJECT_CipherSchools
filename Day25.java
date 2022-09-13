// HashMap & HashSet are used for hashing.

//Benefit of hashing: better search time.

// HashMap: (key, value) pairs are stored. No duplicate keys but duplicate values are allowed.
/*
HashMap
(1, "Hi"), (2, "Hello"), (3, "Hi").

{1, 2, 3} are keys. We can treat hashcode as key.

For a value, its hashcode is determined and stored in the respective bucket. Hashcode can act as a key.

HashSet- (1, 5, 7, 12, 9)
*/

// HashSet: Values are stored. Duplicate values are not allowed.

/*
// HashMap
import java.util.*;
class Test {
	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap <Integer, String>();

		hm.put(12, "Hi");
		hm.put(14, "Hello");
		hm.put(12, "Hye");
		hm.put(15, "Bye");

		System.out.println(hm);
	}
}
*/

// HashSet
import java.util.*;
class Test {
	public static void main(String[] args) {
		HashSet <Integer> hs = new HashSet <Integer>();

		hs.add(12);
		hs.add(14);
		hs.add(12);
		hs.add(15);

		System.out.println(hs);
	}
}

// Count the frequency of each character in a string using HashMap.
