package listExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	/**
	 * Underlying DS= Resizable Array or Growable Array
	 * Duplicates Allowed
	 * Insertion order is preserved
	 * NULL insertion is possible
	 * Heterogeneous objects are allowed
	 * Implements- Serializable, Cloneable and Random Access Interfaces
	 * Most of the methods present in Vector is Synchronized and it is Thread safe.
	 * 
	 */
	/**
	 * Vector is present since Java 1.0 and is known as Legacy Class.
	 * The operations are much like ArrayList (introduced in 1.2) but the method names are bit lengthy.
	 * Vector is threadsafe and synchronized and gives poor perfromance.
	 */


	public void vectorExample(){
		//Ways to create a Vectr Object
		Vector<String> vector= new Vector<String>();
		//Vector vector = new Vector(3);Vector object= new Vector(int initialCapacity)
		//Vector vector= new Vector(4, 6); Vector object= new vector(int initialcapacity, capacityIncrement)

		//Adding elements -> addElement()
		vector.addElement("Steve");
		vector.addElement("Bill");
		vector.addElement(null);
		vector.addElement("Sundar");
		vector.addElement("Satya");
		vector.addElement("Sergey");
		System.out.println("Vector "+ vector);

		//Retrieve element -> elementAt()
		System.out.println("Element At 0th pos is "+ vector.elementAt(0));

		// remove element ->removeElement()
		vector.removeElement(null);
		System.out.println(vector);

		//sublist
		System.out.println(vector.subList(1, 3));

		//sorting the elements
		Collections.sort(vector);
		System.out.println("After sorting :"+ vector);

		//copy elements from Vector to vector
		Vector<String> vector2= new Vector<String>();
		vector2.addElement("A");
		vector2.addElement("B");
		vector2.addElement("C");
		System.out.println("Vector1 before copying:" + vector);
		System.out.println("Vector2 before copying:" + vector2);
		//Copying all the vector to vector2
		Collections.copy(vector, vector2);
		System.out.println("Vector1 after copying:" + vector);
		System.out.println("Vector2 after copying:" + vector2);
		
		//Size and capacity
		Vector<String> vector3= new Vector<String>(5);
		vector3.addElement("A");
		vector3.addElement("B");
		System.out.println("Vector size is :"+ vector3.size());
		System.out.println("Vector capacity is :"+ vector3.capacity());
		
	}

	/*
	 * Iterate using Enumeration
	 */
	public void usingEnumeration(){
		System.out.println("Using Enumeration");
		System.out.println("=================");
		Vector<String> vector= new Vector<String>();
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("C");

		Enumeration<String> enumerator= vector.elements();

		while(enumerator.hasMoreElements()){
			System.out.println(enumerator.nextElement());
		}
		System.out.println("=================");
	}

	/*
	 * Using Iterator
	 */
	public void usingIterator(){
		System.out.println("Using Iterator");
		System.out.println("=================");
		Vector<String> vector= new Vector<String>();
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("C");


		Iterator< String> iterator= vector.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("=================");
	}

	/*
	 * Using ListIterator (We can traverse in forward and reverse direction)
	 */

	public void usingListIterator(){
		System.out.println("Using ListIterator");
		System.out.println("=================");
		Vector<String> vector= new Vector<String>();
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("C");

		ListIterator< String> iterator= vector.listIterator();
		System.out.println("Forward Traversing");
		while(iterator.hasNext()){

			System.out.println(iterator.next());
		}
		System.out.println("=================");
		System.out.println("Reverse Traversing");
		while(iterator.hasPrevious()){

			System.out.println(iterator.previous());
		}
		System.out.println("=================");
	}

	//Convert Vector to List
	public void vectorToList(){
		Vector<String> vector= new Vector<String>();
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("C");
		System.out.println("Vector Elements :"+vector);
		List<String> list=Collections.list(vector.elements());
		System.out.println("List elements copied from Vector "+ list);

	}
	
	
	//Convert Vector to ArrayList
	public void vectorToArrayList(){
		Vector<String> vector= new Vector<String>();
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("C");
		System.out.println("Vector Elements :"+vector);
		ArrayList<String> arrayList= new ArrayList<String>(vector);	//conversion is happening here
		System.out.println("ArrayList elements "+ arrayList);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorExample example = new VectorExample();
		example.vectorExample();
		//example.usingEnumeration();
		//example.usingIterator();
		//example.usingListIterator();
		//example.vectorToList();
		//example.vectorToArrayList();
	}

}
