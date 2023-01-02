package DynamicProgramming;
import java.util.*;

public class MinimumCoisToMakeAValue {
	
	public static void main(String[] args) {

		int n = 23;
		int a[] = {1, 5, 3};
		
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int ans = minCoins(n, a, dp);
		System.out.println(ans);
		
		for(int x: dp) {
			System.out.print(x+" ");
		}
	}
	
	static int minCoins(int n, int a[], int dp[]) {
		
		if(n == 0) return 0;
		
		int ans = Integer.MAX_VALUE;
		
		for(int i = 0; i<a.length; i++) {
			if(n-a[i] >= 0) {
				int subAns = 0;
				if(dp[n-a[i]] != -1) {
					subAns = dp[n-a[i]];
				} else {
					subAns = minCoins(n-a[i], a, dp);
				}
				if(	subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return dp[n] = ans;
	}

// The number of states that are changing in Dynamic programming that number of dimensional array will be used
//	check it's normal recursion solution also
	
}
