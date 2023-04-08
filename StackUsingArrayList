package StackAndQueue;
//import java.util.*;
import java.util.ArrayList;

public class StackUsingArraylist {
	public static class Stack{
		static ArrayList<Integer> ar = new ArrayList<>();
		
		public static boolean isEmpty() {
			return ar.size()==0;
		}
		
		public static void push(int data) {
			ar.add(data);
		}
		
		public static int pop() {
			if(ar.isEmpty())
				return -1;
			int top = ar.get(ar.size()-1);
			ar.remove(ar.size()-1);
			return top;
		}

		public static int peek() {
			if(isEmpty())
				return -1;
			return ar.get(ar.size()-1);
		}
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		// TODO Auto-generated method stub
while(!st.isEmpty()) {
	System.out.println(st.peek());
	st.pop();
}
	}

}
