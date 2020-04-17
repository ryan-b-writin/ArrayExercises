package exercises;

public class exercise1 {

	public static void main(String[] args) {
		// exercise 1: implement an algorithm to determine if a string has all unique characters
		
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
	
	public static String getResults(String str) {
		return "Testing string: "+ str + " | " + isUnique(str);
	}
	
	public static void testStrings(String ... strings) {
		for( String s : strings ) {
			print(getResults(s));
		}
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}
