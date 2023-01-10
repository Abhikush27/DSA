package DynamicProgramming;
import java.util.*;

public class MinimumCoisToMakeAValue {
	
		 public static int minCoins(int coins[], int M, int V) 
	    { 
	       
	       if(V==0)
	       return 0;
	       if(V<0)
	       return Integer.MAX_VALUE;
	       
	       int mini = Integer.MAX_VALUE;
	       
	       for(int i=0;i<M;i++){
	           if(V>=coins[i]){
	           int ans = minCoins(coins,M,V-coins[i]);
	           
	           if(ans+1<mini && ans!=Integer.MAX_VALUE)
	           mini =ans+1;
	       }
	       }
	        return mini;
	    } 
	
	
//	recursion+memorization
	 public static int minCoins2(int coins[], int M, int V) 
	    { 
	       int dp[] = new int[V+1];
	           Arrays.fill(dp,-1);
	       if(V==0)
	       return 0;
	       if(V<0)
	       return Integer.MAX_VALUE;
	       
	       if(dp[V]!=-1)
	       return dp[V];
	       
	       int mini = Integer.MAX_VALUE;
	       
	       for(int i=0;i<M;i++){
	           if(V>=coins[i]){
	           int ans = minCoins(coins,M,V-coins[i]);
	           
	           if(ans+1<mini && ans!=Integer.MAX_VALUE)
	           mini =ans+1;
	               
	       }
	       }
	           dp[V] = mini;
	        return dp[V];
	    } 
	 
	 
//	 tabulation
	 public static int minCoins3(int coins[], int M, int V) 
	    { 
	       int dp[] = new int[V+1];
	Arrays.fill(dp,Integer.MAX_VALUE);
	       dp[0]= 0;
	       if(V<0)
	       return Integer.MAX_VALUE;
	       

	       for(int j=1;j<=V;j++){
	       for(int i=0;i<M;i++){
	           if(j>=coins[i] && dp[j-coins[i]]!=Integer.MAX_VALUE)
	           dp[j] = Math.min(dp[j], 1+dp[j-coins[i]]);
	       }
	       }
	          
	        return dp[V];
	    } 

	
}
