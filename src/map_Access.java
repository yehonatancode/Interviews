import java.util.HashMap;

public class map_Access {
	// Create an empty hash map
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		System.out.println(map.putIfAbsent("yoni", 40)); // what would be the output? Null, yoni, 40 or compilation
															// error?

	}
}
