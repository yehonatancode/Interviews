
public class MaxValObtainedByInsert {

	public int solution(int N) {
		final int digit = 5;
		if(N==0) {
			return digit*10;
		}
		
		//check if integer is neg or pos. 
		int negative = N/Math.abs(N);
		N = Math.abs(N);
		int n = N;
		int maxVal = Integer.MIN_VALUE;
		int counter = 0, position = 1;
		
		//count the number of digits in the number.
		while(n>0) {
			counter++;
			n=n/10;
		}
		
		//loop through all possible position for our digit, and check
		//obtained value
		
		for(int i=0; i<=counter; i++) {
			int newVal = ((N / position) * (position * 10)) + (digit * position) + (N % position);
			//Max Value comparison
			if(newVal * negative > maxVal) {
				maxVal = newVal * negative;
			}
			
			position = position * 10;
			
		}
		
		return maxVal;
		
		
		
	}


}