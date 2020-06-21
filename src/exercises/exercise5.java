package exercises;

public class exercise5 {

	public static void main(String[] args) {
		// exercise 5: there are 3 types of edits that can be performed on a String-
			//1) remove a character test -> est
			//2) add a character test -> teest
			//3) replace a character test -> tost
		// implement an algorithm to determine if one string is one or zero edits away from another.
		
		testStrings("aabc", "abcdefghijklmnopqrstuvwxyz1234567890", "abcabc");
	
	}
	
	public static boolean isUnique(String str) {
		
		for(int i = 0; i<str.length() ; i++) {
			for(int j = i + 1; j <str.length() ; j++) {
				if(str.charAt(i) == str.charAt(j))
						return false;
			}
		}
		return true;
	}
	
	public static boolean getResults(String s1, String s2) {
		
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		int s1length = s1.length();
		int s2length = s2.length();
		
		//compare string lengths
			
		//same length - may be replaced or not edited
		if(s1length == s2length){
			
			
		} 
		//s2 is one character shorter - may have character removed
		else if (s1length - 1 == s2length){
			
		} 
		//s2 is one character longer - may have character added
		else if (s1length + 1 == s2length){
			
		} 
		//else- return false
		return false;
		
	}
	
	public static void testStrings(String s1, String s2) {
		print(getResults(s1, s2));
	}
	
	public static void print(Boolean str) {
		System.out.println(str);
	}

}
