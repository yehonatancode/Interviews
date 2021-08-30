import java.io.*;
import java.util.*;

public class PasswordStrength {
	
	public boolean solution(String s) {
		
		// Checking lowercase, uppercase,special chars, digits and no spaces.
        int n = s.length();
        boolean hasLower = false, hasUpper = false, 
                hasDigit = false, specialChar = false, noSpaces=true;

         char space = ' ';
        //Our special characters list.
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                              '*', '(', ')', '_'));
		
  
        
        for (char i : s.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
            if(i == space)
            	noSpaces=false;
        }
        
        if (hasDigit && noSpaces && hasLower && hasUpper && specialChar
                && (n >= 6)) {
        	return true;
        }
        return false;
        
	}

}
