package problem;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 
 * 1.Open brackets must be closed by the same type of brackets.
 * 2.Open brackets must be closed in the correct order.
 * 
 * Note that an empty string is also considered valid.
 * */
public class Problem0020 {
	private static HashMap<String,String> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		map = new HashMap<>();
		map.put("(",")");
		map.put("{","}");
		map.put("[","]");
		
		System.out.println(isValid(input));
		
		Problem0020 p = new Problem0020();
		
		System.out.println(p.new Problem0020Best().isValid(input));

	}

	public static boolean isValid(String s) {
		if("".equals(s)) return true;
		
		String[] arr = s.split("");
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i++){
			String str = arr[i];
			if(isLeftB(str)){
				stack.push(str);
			}else{
				if(stack.isEmpty()) return false;
				String left = stack.pop();
				if(isMatchB(left,str)){
					if(stack.isEmpty() && i == arr.length -1) return true;
					else continue;
				}else return false;
			}
		}
		
        return false;
    }
	
	public static boolean isLeftB(String s){
		return map.containsKey(s);
	}
	
	public static boolean isMatchB(String left,String right){
		if(map.containsKey(left)) return map.get(left).equals(right);
		return false;
	}
	
	class Problem0020Best {
		private HashMap<Character,Character> map;

		public Problem0020Best() {
			map = new HashMap<>();
			map.put(')', '(');
			map.put('}', '{');
			map.put(']', '[');
		}
		
		public boolean isValid(String s){
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				if(map.containsKey(c)){
					char top = stack.isEmpty() ? '#' : stack.pop();
					if(top != map.get(c)){
						return false;
					}
				}else{
					stack.push(c);
				}
			}
			return stack.isEmpty();
		}
	}
	
}
