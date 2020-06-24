package exercises;

public class exercise6 {

	public static void main(String[] args) {
		// exercise 6: string compression
		//implement an algorithm to perform basic string compression using the counts of repeated characters.
		//for example, aabcccccaaa would become a2b1c5a3. if the compressed string would not become smaller than the original string,
		//return the original string. assume the string only has uppercase and lowercase letters a-z.
		
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