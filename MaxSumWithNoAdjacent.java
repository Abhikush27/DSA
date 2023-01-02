package DynamicProgramming;
import java.util.*;

public class MaxSumWithNoAdjacent {
	
	public static int solve(int [] dp,int n,int[] nums) {
		

		if(n<0)
			return 0;
		
		if(dp[n]!=-1)
			return dp[n];
	
		int include = solve(dp,n-2,nums) + nums[n];
		int exclude = solve(dp,n-1,nums);
		
		 dp[n]= Math.max(include, exclude);
		 return dp[n]; 
		
	}

	public static void main(String[] args) {
		
				int arr[] = {2,6,3, 7, 10};
		int n = arr.length;
		int dp[] = new int[n];
		Arrays.fill(dp,-1);

		
		int x = solve(dp,n-1,arr);
		System.out.print(x);
		// TODO Auto-generated method stub

	}
	
	
// see other solutions also with lesser space complexity
//	Also see house robbery problem (it has once exception)

}
