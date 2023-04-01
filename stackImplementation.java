package StackAndQueue;
import java.util.*;



public class stackImplementation {

	public void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
       s.push(10);
       s.push(20);
       s.push(30);
       System.out.println(s.pop() + " Popped from stack");
       System.out.println("Top element is :" + s.peek());
       System.out.print("Elements present in stack :");
		// System.out.println("x");
	}

}
