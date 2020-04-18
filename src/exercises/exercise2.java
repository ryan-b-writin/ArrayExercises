package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class exercise2 {

	public static void main(String[] args) {
		// exercise 2: implement an algorithm to determine if one string is a permutation of another
		
		testStrings("aabc", "baac");
	
	}
	
	public static boolean isPermutationOf(String s1, String s2) {
		
		if(s1 == "") {
			if( s2 == "") {
				return true;
			}
			return false;
		}
		
		if(s2 == "") {
			return false;
		}
		
		if (s1.length() == s2.length()) {
			char[] cList = s1.toCharArray();
			ArrayList<Character> sList = new ArrayList<>();
			for(char c : s2.toCharArray()) {
				sList.add(c);
			}
			
			for(int i = 0 ; i < cList.length ; i++) {
				for(int j = 0 ; j < sList.size(); j ++) {
					if(cList[i] == sList.get(j)) {
						sList.remove(j);
						break;
					}
				}
				if(sList.size() == 0) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static String getResults(String str, String str2) {
		return "Testing strings: "+ str + "/" + str2 + " | " + isPermutationOf(str, str2);
	}
	
	public static void testStrings(String s1, String s2) {
		print(getResults(s1,s2));
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}
