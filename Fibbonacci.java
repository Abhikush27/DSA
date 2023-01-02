package DynamicProgramming;
import java.util.*;

public class Fibbonacci {
	
//	In dynamic programming we use to store the values of the elements that are being repeated continuously 

	
	public static int fibo(int n ) {
		int []dp = new int[n+1];
		Arrays.fill(dp, -1);
		
//		base case
		if(n<=1)
			return n;
		
		if(dp[n]!=-1)
			return dp[n];
		
		dp[n] = fibo(n-1)+fibo(n-2);
		return dp[n];
	}
	public static void main(String[] args) {
		
		int x =fibo(8);
		System.out.print(x);
	}
//using the simple recursion it will take the time complexity of 2^n
//	using dp it will take (n)
//	space complexity of the above solution will be [O(n)+O(n)]
	
}
