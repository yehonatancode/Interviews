import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class IdenticalFileContent {

	public boolean sameContent(Path file1,Path file2) throws IOException {
		
	
		/*
		File f1 = new File(file1.toUri().toString());
		File f2 = new File(file2.toUri().toString());
		boolean areFileEqual = FileUtils.contentEquals(f1,f2); //certain api
		/*
		 * 
		 */
		 
		//Method 2: Byte Arrays.
		byte[] f1 = Files.readAllBytes(file1);
		byte[] f2 = Files.readAllBytes(file2);
		boolean ans = Arrays.equals(f1,f2);
		return ans;
		
		 
		
		
	}
}
