import java.util.Arrays;
import java.util.Collections;

public class MaximumEven {


	public static int maxEvenSum(int[] arr, int k) {
		int[] even_arr = new int[arr.length], odd_arr = new int[arr.length];
		int even_arr_index=0, odd_arr_index=0;
		int even_index=0,odd_index=0,maxsum=0;
		if(k>arr.length || arr.length==0) return -1;

		//sorting the array in descending order and splitting into two arrays
		for(int i=0; i<arr.length;i++) {
			arr[i]=arr[i]*-1;
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			arr[i]=arr[i]*-1;
		}
		//splitting into two arrays, odd and even.

		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_arr[even_arr_index++]=arr[i];
			}
			else odd_arr[odd_arr_index++]=arr[i];

		}
		//pattern - if k=1 -> first element in even array
		//if k=2 -> two even or two odds.
		//for k>=3, and odd, we will always have to pick the third element to be even.
		while(k>0) {
			if(k%2 ==1) { //k is odd
				if(even_arr.length>0) {
					maxsum+=even_arr[even_index++];
					k--;
				}
				else return -1;
			}
			else 
				if((even_index < even_arr.length-1) && (odd_index < odd_arr.length-1)) {
					maxsum+=Math.max((even_arr[even_index]+(even_arr[even_index+1])),(odd_arr[odd_index]+(odd_arr[odd_index+1])));
					even_index+=2;
					odd_index+=2;
				}
				else if(even_index < even_arr.length-1) {
					maxsum+=(even_arr[even_index]+(even_arr[even_index+1]));
					even_index+=2;
				}
				else if(odd_index < odd_arr.length-1) {
					maxsum+=(odd_arr[odd_index]+(odd_arr[odd_index+1]));
					odd_index+=2;
				}
		}
		k-=2;

		return maxsum;
	}













	public static void main(String[] args) {
		int[] arr = {4,2,6,7,8};
		System.out.println(maxEvenSum(arr,3));


	}
}
