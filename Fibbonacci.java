package DynamicProgramming;
import java.util.*;

public class Fibbonacci {
	
//	In dynamic programming we use to store the values of the elements that are being repeated continuously 

	
		
//	METHOD 1
//	Using recursion
	public static int fibo1(int n) {
		if(n==0 || n==1)
			return n;
		
		return fibo1(n-1) + fibo1(n-2);
	}
	
	
	
// METHOD 2	
//	Using recursion+memorization
	public static int fibo2(int n) {
		
//		step1 creating and filling the array
		int []dp = new int[n+1];
		Arrays.fill(dp, -1);
		
		if(n<=1)
			return n;
		
//		step3 base case 
		if(dp[n]!=-1)
			return dp[n];
		
//		step2 filling the values in array
		dp[n] = fibo2(n-1)+fibo2(n-2);
		return dp[n];
	}
	
	
//	METHOD 3
//	Tabulation
	
	public static int fibo3(int n) {
//		step 1
		int []dp = new int[n+2]; //doubt
//		step 2
		dp[1]=1;
		dp[0]=0;
		
		if(n==0)
			return 0;
		
//		step3
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		
		int x =fibo3(8);
		System.out.print(x);
	}

}
