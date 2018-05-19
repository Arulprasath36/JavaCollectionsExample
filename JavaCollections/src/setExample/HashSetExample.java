package setExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	/**
	 * 	Set(I)-> HashSet (C) and LinkedHashSet(C) are implementations
	 *  Set(I) -> SortedSet(Child Interface)->NavigableSet(I)=> TreeSet(C) is the implementation 
	 *Important points to remember:
	 *1. To store group of individual objects.
	 *2. Duplicates not allowed
	 *3.Insertion order will not be maintained
	 *4.Set(I) doesn't have any new methods other than given in Collection(I).
	 *5. DS for HashSet is Hash table
	 *6. If we add duplicate value to HashSet, simply it will return false to the
	 *add() and it won't throw any error or exception.
	 *7. We can insert null values
	 *8. Heterogeneous values can be added.
	 *9. Implements Serializable and Cloneable?-> Yes
	 *10. Data are stored based on hashcode, so search is very effective.
	 *11. Fill Ratio or Load factor:0.75 or 75%
	 *12.Default capacity-16
	 */

	/*
	 * Number Constructors available in HashSet=4
	 * 1. HashSet hs= new HashSet();// size-16 and fill ratio is 0.75
	 * 2. HashSet hs= new HashSet(int initialSize);size as declared and fill ratio is 0.75(default)
	 * 3. HashSet hs= new HashSet(int initialSize, float fillRatio);//size and fill ratio can be declared
	 * 4. HashSet hs= new HashSet(Collection c);// creates a HashSet for any given Collection (Acts as interconversion)
	 */

	public void basicExamplesHashSet(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A"); // the return type of add() is boolean. Since A is already there it will return false and wont add
		hashSet.add(null);
		//We have no control on insertion order
		System.out.println("Contents of the HashSet :"+ hashSet);
	}

	/*
	 * Iterate using Iterator 
	 */
	
	public void iterateUsingIterator(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A");
		
		Iterator< String> iterator= hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println("Elements of HashSet :"+ iterator.next());
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample hashSetExample= new HashSetExample();
		hashSetExample.basicExamplesHashSet();
		hashSetExample.iterateUsingIterator();
	}

}
