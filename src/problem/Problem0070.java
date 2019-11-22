package problem;


/**
 * 70. Climbing Stairs
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Note: Given n will be a positive integer.
 * */
public class Problem0070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem0070 p = new Problem0070();
		System.out.println(p.climbStairs(5));
		System.out.println(p.climbStairsR(5));
	}
	
	public int climbStairs(int n) {
		int a = 0, b = 1, temp = 0;
		for(int i = 0; i < n; i++){
			temp = b;
			b = b + a;
			a = temp;
		}
        return n > 0 ? b : 0;
    }
	
	//Time Limit Exceeded
	public int climbStairsR(int n) {
		if(n < 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 2;
		return climbStairsR(n-1) + climbStairsR(n-2);
	}

}
