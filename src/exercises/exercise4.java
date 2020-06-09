package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class exercise4 {

	public static void main(String[] args) {
		// exercise 2: implement an algorithm to determine if a string is a permuation of a palindrome. 
		//the palindrome does not need to be composed of real words. ignore spacing and capitalization.
		// example- "Tact Coa" could be permutated into "taco cat" or "atco cta"
		
		print(findPalindromes("Tact Coa"));
		print(findPalindromes("ra ce ca r race c a r rr cc a au"));
		print(findPalindromes("testing"));
		
	
	}
	
	public static String findPalindromes(String str) {
		
		
		
		//convert to char arraylist- lower case
		String[] strAsChars = str.split("");
		for(int i = 0; i < strAsChars.length ; i ++) {
			strAsChars[i] = strAsChars[i].toLowerCase();
		}
		ArrayList<String> originalString = new ArrayList<>();
		ArrayList<String> pairedLetters = new ArrayList<>();
		ArrayList<Integer> indexOfSpaces = new ArrayList();
		String middle = null;
		boolean middleCharacterFound = false;
		StringBuilder p1 = new StringBuilder();
		
		for(String c: strAsChars) {
			originalString.add(c.toLowerCase());
		}
		
		for(int i = 0; i < strAsChars.length ; i ++) {
			
			boolean duplicateFound = false;
			boolean charIsSpace = false;
			
			//note down locations of spaces for reassembling palindrome, remove from array
			if(" ".equals(strAsChars[i])){
				indexOfSpaces.add(i);
				for(String c : originalString) {
					if(c == strAsChars[i]) {
						originalString.remove(c);
						charIsSpace = true;
						break;
					}
				}
			}
			
			if(!charIsSpace) {
				boolean alreadyPairedOff = true;
				//remove original char
				for(String c: originalString) {
					if(c.equals(strAsChars[i])) {
						originalString.remove(c);
						alreadyPairedOff = false;
						break;
					}
				}
				
				//search for duplicate to go on other end of palindrome.
				for(String c: originalString) {
					if(c.equals(strAsChars[i])) {
						originalString.remove(c);
						pairedLetters.add(c);
						duplicateFound = true;
						break;
					}
				}
				
				//there is room in a palindrome for one singleton
				if(!duplicateFound && !alreadyPairedOff) {
					
					if(!middleCharacterFound) {
						middle = strAsChars[i];
						middleCharacterFound = true;
					} else if (middleCharacterFound) {
						return "false";
					}
				}
			}
		}
			
			ArrayList<String> results = new ArrayList<>();
			int currentIndex = 0;
			
			//add first half of palindrome
			for(int j = 0; j < pairedLetters.size() ; j++) {
				for(int k = 0; k < indexOfSpaces.size() ; k ++) {
					if(indexOfSpaces.get(k) == currentIndex) {
						p1.append(" ");
						currentIndex += 1;
					}
				}
				p1.append(pairedLetters.get(j));
				currentIndex += 1;
			}
			
			//check if space to be added before adding middle
			for(int j = 0; j < indexOfSpaces.size() ; j ++) {
				if(indexOfSpaces.get(j) == currentIndex) {
					p1.append(" ");
					currentIndex += 1;
				}
			}
			
			if(middleCharacterFound) {
				p1.append(middle);
				currentIndex +=1;
			}
			
			//add same letters in backwards order
			for(int k = pairedLetters.size()-1; k > -1 ; k--) {
				for(int l = 0; l < indexOfSpaces.size() ; l++) {
					if(indexOfSpaces.get(l) == currentIndex) {
						p1.append(" ");
						currentIndex += 1;
					}
				}
				p1.append(pairedLetters.get(k));
				currentIndex += 1;
			}
		
			//check for spaces at the end
			for(int j = 0; j < indexOfSpaces.size() ; j ++) {
				if(indexOfSpaces.get(j) == currentIndex) {
					p1.append(" ");
					currentIndex += 1;
				}
			}
		
		return "True, generated example: " + p1.toString();
		
		
	}

	
	public static void print(String str) {
		System.out.println(str);
	}

}
