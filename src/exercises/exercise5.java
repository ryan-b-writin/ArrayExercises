package exercises;

public class exercise5 {

	public static void main(String[] args) {
		// exercise 5: there are 3 types of edits that can be performed on a String-
			//1) remove a character test -> est
			//2) add a character test -> teest
			//3) replace a character test -> tost
		// implement an algorithm to determine if one string is one or zero edits away from another.
		
		testStrings("aabc", "aabc");
		testStrings("abc", "aabc");
		testStrings("abbc", "aabc");
		testStrings("aabc", "aab");
		testStrings("abbb", "aabc");
		testStrings("aaaabc", "aabc");
	
	}
	
	public static boolean getResults(String s1, String s2) {
		
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		int s1length = s1.length();
		int s2length = s2.length();
		
		//compare string lengths
			
		//same length - may be replaced or not edited
		if(s1length == s2length){
			int numMatches = 0;
			for(int i = 0; i < s1length; i ++){
				if(s1Array[i] == s2Array[i]){
					numMatches++;
				}
				if(numMatches +1 >= s1length){
					return true;
				}
			}
			
		} 
		//s2 is one character shorter - may have character removed
		else if (s1length - 1 == s2length){
			//set to true when missing character is found. 
			boolean oneCharOff = false;
			//iterate through s2 to avoid array index out of bounds, as s2 is shorter
			for(int i = 0; i < s2length; i ++){
				if(!oneCharOff && s1Array[i] != s2Array[i] && s1Array[i+1] == s2Array[i]){
					oneCharOff = true;
				} else if (oneCharOff && s1Array[i+1] != s2Array[i]){
					return false;
				}
			}
			return true;
		} 
		//s2 is one character longer - may have character added
		else if (s1length + 1 == s2length){
			//set to true when added character is found. 
			boolean oneCharOff = false;
			//iterate through s1 to avoid array index out of bounds, as s1 is shorter
			for(int i = 0; i < s1length; i ++){
				if(!oneCharOff && s2Array[i] != s1Array[i] && s2Array[i+1] == s1Array[i]){
					oneCharOff = true;
				} else if (oneCharOff && s2Array[i+1] != s1Array[i]){
					return false;
				}
			}
			return true;
		} 
		//else- return false
		return false;
		
	}
	
	public static void testStrings(String s1, String s2) {
		print("testing: "+ s1 + " " + s2 + " " +  getResults(s1, s2));
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
