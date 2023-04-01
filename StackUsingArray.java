package StackAndQueue;

//import StackAndQueue.stackUsingarray.allMethods;

public class StackUsingArray {

	public static class Stack{
	int max=3;
int top = -1;
		int [] arr = new int[max];

		public void push(int data) {
			if(top>=max-1)
				System.out.println("Stack overflow");
			else {
				arr[++top] = data;
				System.out.println(data + "pushed");
			}
//				top will be initially -1 which is behind array[0];
		}

		public int pop() {
			
			if(top<0) {
				System.out.println("Stack underflow");
				return 0;
			}
				
			else {
				  int x = arr[--top];
				 return x;
			}
		}

		public int peek() {
			int data;
			if(top<0) {
				System.out.println("Stack underflow");
				return 0;
			}
			else {
				data = arr[top];
				return data;
			}
		}

		public void print(){
			int i;
		    for(i = top;i>-1;i--){
		      System.out.print(" "+ arr[i]);
		    }
		  }
	}

	
	public static void main(String[] args) {
		
//		 Stack<Integer> s = new Stack<Integer>();
		Stack s = new Stack();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println("Top element is :" + s.peek());
	        System.out.print("Elements present in stack :");
	        
	}

}
