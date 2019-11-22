package problem;

import java.util.Stack;

/**
 * 155. Min Stack
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * */
public class Problem0155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem0155 p = new Problem0155();
		MinStack s = p.new MinStack();		
		s.push(-2);
		s.push(0);
		s.push(-3);
		System.out.println(s);
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s);
		System.out.println(s.getMin());
	}
	
	class MinStack{
		int min = Integer.MAX_VALUE;
	    Stack<Integer> stack = new Stack<Integer>();
		
		public void push(int x) {
			// only push the old minimum value when the current 
	        // minimum value changes after pushing the new value x
			if(x <= min){
				stack.push(min);
				min = x;
			}
			stack.push(x);
	    }
	    
	    public void pop() {
	    	// if pop operation could result in the changing of the current minimum value, 
	        // pop twice and change the current minimum value to the last minimum value.
	    	if(stack.pop() == min) min = stack.pop();
	    }
	    
	    public int top() {
	    	return stack.peek();
	    }
	    
	    public int getMin() {
	    	return min;
	    }

		@Override
		public String toString() {
			return stack.toString();
		}
	    
	}
}


