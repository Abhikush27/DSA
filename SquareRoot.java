package BinarySearch;

public class SquareRoot {

	public long search(int x){
	    long low =0;
	     long high = x;
	     long  mid = low+(high-low)/2;
	long ans=-1;
	     while(low<=high){
	         long sqr = mid*mid;
	         if(sqr==x)
	         return mid;
	         else if(sqr<x){
	         ans=mid;
	         low = mid+1;}
	         else
	         high=mid-1;

	         mid = low+(high-low)/2;
	     }
	     return ans;
	}
	
//	important
	
	public double afterDecimal(int x, int precision, int searchval) {
		double factor =1;
		double result = searchval;
		for(int i=0;i<precision;i++) {
			factor=factor/10;
			
			for(double j = searchval;j*j<x;j+=factor) {
				result = j;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
