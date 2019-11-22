package problem;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * 
 * Implement the following operations of a queue using stacks.
 * 
 * 	push(x) -- Push element x to the back of queue.
 * 	pop() -- Removes the element from in front of queue.
 * 	peek() -- Get the front element.
 * 	empty() -- Return whether the queue is empty.
 * 
 * Notes:
 * 	You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * 	
 * 	Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), 
 * 	as long as you use only standard operations of a stack.
 * 
 * 	You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 * */
public class Problem0232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	class MyQueue {
		private Stack<Integer> s1 = new Stack<>();
		private Stack<Integer> s2 = new Stack<>();
		
		private int front;
		
		/**
		 * Time complexity : O(n)
		 * Space complexity : O(n)
		 * */
		public void push(int x){
			if(s1.isEmpty()) front = x;
			while(!s1.isEmpty()) s2.push(s1.pop());
			s2.push(x);
			while(!s2.isEmpty()) s1.push(s2.pop());
		}
		
		public int pop(){
			int x = s1.pop();
			if(!s1.isEmpty()) front = s1.peek();
			return x;
		}
		
		
		public int peek(){
			return front;
		}
		
		public boolean empty(){
			return s1.isEmpty();
		}
	}

}
