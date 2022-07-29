package lesson7CollectionsandInterfaces;

import java.util.Hashtable;
// Collection interface - java.util.Collection
// Map Interface - java.util.Map
// They are the main root interfaces of Java collection classes
public class Collection {
/* Collection - group of individual objects which are
 * represented as a single unit
 */
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4 };
		Vector<integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(1, "Element 1");
		h.put(2, "Element 2");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}

}
