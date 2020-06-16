package exercises;

public class exercise3 {
	
	public static void main(String[] args) {
		// exercise 3: write a method to replace all spaces in a string with '%20.' you may assume that 
		// the string has sufficient space at the end to hold the additional characters and that you are
		//given the 'true' length of the string. 
		//example: "Mr John Smith    ",13
		//example output: "Mr%20John%20Smith"
		
		testStrings("Mr John Smith    ",13);
	
	}
	
	public static void testStrings(String str, int trueLength) {
		//create string array
		char[] originalArray = str.toCharArray();
		char[] newArray = new char[originalArray.length];
		int currentIndex = originalArray.length -1;
		
		
		//loop backwards through array starting at "trueLength" index
		for(int i = trueLength -1; i > -1 ; i--){
			
			if(" ".equals(originalArray[i]) || originalArray[i] == ' '){
				newArray[currentIndex] = '0';
				newArray[currentIndex -1] = '2';
				newArray[currentIndex -2] = '%';
				currentIndex -= 3;
			} else {
				newArray[currentIndex] = originalArray[i];
				currentIndex--;
			}
		}
		
		String result = new String(newArray);
		print(result);
		
			//if not a space, add to the end of the new array
		
			//if it is a space, add three characters 0, 2, %
		
		//return array
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}
