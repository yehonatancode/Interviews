import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchIndices {
	public static int[] linearSearch(int[] array, int num) {
		List<Integer> listIndice = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			
			if(array[i] == num) {
				listIndice.add(i);
			}	
		}
		int[] indices = new int [listIndice.size()];
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
