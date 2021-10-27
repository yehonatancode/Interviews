import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchIndices {
	//My approach in this question was, an array length is fixed once created,
	//therefore I needed a dynamic Data Structure to know exactly the 
	//amount of indices we're having, once we know, convert it into an array,
	//since the question given function expects an array as output. 
	public int[] linearSearch(int[] array, int num) {
		
		List<Integer> listIndice = new ArrayList<Integer>();//To store relevant indices.
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i] == num) {
				listIndice.add(i);
			}	
		}
		int[] indices = new int [listIndice.size()]; //fixed size for array
		for(int i=0;i<indices.length;i++) {
			indices[i] = listIndice.get(i);
		}
		return indices;
	}
	
	
	public static void main(String []args) {
		
		int[] test = {10,20,20,20,40,20,20};
		System.out.println(Arrays.toString(linearSearch(test,20)));
		
	}
}
