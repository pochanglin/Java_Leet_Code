package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. Implement Stack using Queues
 * 
 * Implement the following operations of a stack using queues.
 * 
 * 	push(x) -- Push element x onto stack.
 * 	pop() -- Removes the element on top of the stack.
 * 	top() -- Get the top element.
 * 	empty() -- Return whether the stack is empty.
 * 
 * Notes:
 * 	You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * 	
 * 	Depending on your language, queue may not be supported natively. 
 * 	You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * 
 * 	You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 * */
public class Problem0225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem0225 p = new Problem0225();
		MyStack s = p.new MyStack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());

	}
	
	class MyStack{
		private Queue<Integer> q1 = new LinkedList<>();
		private Queue<Integer> q2 = new LinkedList<>();
		private int top;
		
		public void push(int x){
			q1.add(x);
			top = x;
		}
		
		public int pop(){
			while(q1.size() > 1){
				top = q1.remove();
				q2.add(top);
			}
			int x = q1.remove();
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
			return x;
		}
		
		public int top(){
			return top;
		}
		
		public boolean empty(){
			return q1.isEmpty();
		}
		
	}

}
