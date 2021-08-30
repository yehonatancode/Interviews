
public class MinimalLetterChange {
public static int solution(String s) { //BAAABAB
	
	int size=s.length();
	int sum_errors=0;
	int last_a_index = 0;
	
	for(int i=0; i<size; i++) {
		if(s.charAt(i)=='A') {
			last_a_index = i;
		}
	}
	if(size==0) return 0;
	
	for(int i=1;i<size;i++) { //the approach is to check every 3 letters, we would like to change BAB,BAA and ABA
		if(s.charAt(i)=='B' && s.charAt(i-1) == 'A' && s.charAt(i+1)=='A') {//BAA
			if(i>last_a_index) {sum_errors+=2;} 
			else sum_errors++;
		}
		else if(s.charAt(i)=='B' && s.charAt(i-1) == 'A' && s.charAt(i+1)=='B') {//BAB
			if(i>last_a_index) {
				sum_errors++; //we are at the B phase
			}
			else sum_errors+=2; //we are at A's phase, and switch the B's
		}
		else if(s.charAt(i)=='A' && s.charAt(i-1) == 'B' && s.charAt(i+1)=='A') {//BAB
		if(i<last_a_index) { //we are at the A format
			sum_errors++;}
			else sum_errors+=2;
		}
		
	}
	return sum_errors;
}
	
	public static void main(String[] args) {
	    System.out.println(solution("baaabab"));
	}
	

}
