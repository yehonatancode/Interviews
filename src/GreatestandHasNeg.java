import java.util.HashSet;
import java.util.Set;

public class GreatestandHasNeg {
	
	public static int checkGreatandNeg(int[] arr) {
		
	Set<Integer> set = new HashSet<>();
	int res=0;
	for(int i=0;i<arr.length;i++) {
		set.add(arr[i]);
		if(set.contains(-1*arr[i])) {
			res = Math.max(res,Math.abs(arr[i]));
		}
	}
	return res;
}
	
	public static int minimalChanges(String s) {
		int res=0;
		int size = s.length();
		for(int i=0;i<size;) {
			int next = i+1;
			while((next<size) && s.charAt(i)==s.charAt(next)) {
				next++;
			}
		
			res+=(next-i)/3;
			i=next;
		}
		return res;
	}

	public static void
    main(String[] args)
{

   // int[] arr = { 3, 2, -2, 5, -3 };
    // System.out.println(
    //		checkGreatandNeg(arr));
    System.out.println(minimalChanges("baaabab"));
}
	
	
}
