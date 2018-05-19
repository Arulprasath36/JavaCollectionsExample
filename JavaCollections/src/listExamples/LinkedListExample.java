package listExamples;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {
	/**
	 * LinkedList is implemented using Doubly linked list. This is best suited for insertion and deletion operations.
	 * Unlike ArrayList, this is not the best for retrieving the data.
	 * All the collections implements Serializable and cloneable Interfaces.
	 *  LinkedList also implements those Interfaces but not RandomAccess Interface.
	 */
	public void linkedListOperationsExample(){

		//Create a simple Linked list
		LinkedList< Integer> linkedList= new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		System.out.println("Linked List :"+ linkedList);

		//Add an element to the first position
		linkedList.addFirst(1);
		System.out.println("Linked List after adding first:"+ linkedList);

		//Add an element at last
		linkedList.addLast(5);
		System.out.println("Linked List after adding last:"+ linkedList);

		/*
		 * LinkedList performs the worst if the operation is retrieval of data.
		 * Hence if our requirement is to fetch data, we should use ArrayList.
		 * But LinkedList is the best choice if we have requirements of adding and 
		 * removing data very often. In this case we should avoid ArrayList
		 */

		//Get the first value
		System.out.println("First Value :" +linkedList.getFirst());

		//Get the first value using index position
		System.out.println("First Value using index :"+linkedList.get(0));

		/*
		 * Now get the third value of the list.
		 * Since LinkedList has the data structure of doubly linked list,
		 * the value of the third index is known only to the link present in
		 * the Second index. Internally, the program will traverse to index number 2 and then only
		 * it can get the value of 3. So Linked list is not suited for search operations.
		 */
		System.out.println("Third value of the list : "+ linkedList.get(3));

		//update the values using set().
		//Integer newFirst=linkedList.get(0);
		//linkedList.set(0, newFirst);
		//System.err.println("After 0th position updated :"+linkedList);

		//removeFirst and removeLast
		System.out.println("Remove first :"+linkedList.removeFirst());
		System.out.println("Remove last :"+linkedList.removeLast());

		//poll method  and pollfirst() deletes the first element in the list
		System.out.println(linkedList.poll());
		System.out.println(linkedList);

		//pollLast deletes the last
		linkedList.pollLast();
		System.out.println(linkedList);

		//remove deletes the first element
		linkedList.remove();
		System.out.println(linkedList);

		//Adding
		linkedList.addFirst(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);

		//removeFirstOccurence
		linkedList.removeFirstOccurrence(2);
		System.out.println("After removing the first occurence of 2 "+ linkedList );

		//removeLastOccurrence
		linkedList.removeLastOccurrence(6);
		System.out.println("After removing the last occurence of 6 "+ linkedList );
		
		System.out.println("-----------------------------------------------------");
	}

	/*
	 * Iteration of Linked List with simple for loop
	 */
	public void iterateLinkedListWithSimpleFor(){
		
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("Simple For loop");
		for (int index=0;index<linkedList.size();index++){
			System.out.println("Elements in the LL are "+ linkedList.get(index));
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
	/*
	 * Iteration of Linked List with Advanced For loop (For each)
	 */
	
	public void iterationWithAdvancedFor(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("For Each");
		for (String string : linkedList) {
			System.out.println("Elements in the LL are "+ string);
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
	/*
	 * Iterate using While
	 */
	public void iterateUsingWhile(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number=0;
		System.out.println("While");
		while(linkedList.size()>number){
			System.out.println("Elements in the LL are "+ linkedList.get(number));
			number++;
		}
		System.out.println("-----------------------------------------------------");
	}
	
	/*
	 * Iterate using Iterator
	 */
	public void iterateUsingIterator(){
		LinkedList< String> linkedList= new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator=linkedList.iterator();
		System.out.println("Iterator");
		while(iterator.hasNext()){
			System.out.println("Elements in the LL are "+ iterator.next());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample linkedListExample = new LinkedListExample();
		linkedListExample.linkedListOperationsExample();
		linkedListExample.iterateLinkedListWithSimpleFor();
		linkedListExample.iterationWithAdvancedFor();
		linkedListExample.iterateUsingWhile();
		linkedListExample.iterateUsingIterator();
	}

}
