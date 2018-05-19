package listExamples;

import java.util.Stack;

public class StackExample {
/**
 * Stack -> child class of Vector
 * Follows LIFO (Last In First Out)
 */
	
	public void stackExamples(){
		//Create object
		Stack<String> stack= new Stack<String>();
		
		//To insert an element -> push()
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		//print and see the stack
		System.out.println("Stack elements :"+ stack);
		
		//delete an element-> pop()
		stack.pop();// LIFO, so the last inserted element will be deleted
		System.out.println("After popping an element : "+ stack);
		
		//to get the top element -> peek()
		System.out.println("Top Element :" +stack.peek());
		
		//search returns the offset value. Offset is the position counted from top
		System.out.println("Searching the element A :"+stack.search("A"));
		
		//if the element is not present then the value is -1
		System.out.println("Searching an element which is not present :"+ stack.search("x"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackExample example= new StackExample();
		example.stackExamples();
		
	}

}
