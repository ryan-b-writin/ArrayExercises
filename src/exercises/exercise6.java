package exercises;

public class exercise6 {

	public static void main(String[] args) {
		// exercise 6: string compression
		//implement an algorithm to perform basic string compression using the counts of repeated characters.
		//for example, aabcccccaaa would become a2b1c5a3. if the compressed string would not become smaller than the original string,
		//return the original string. assume the string only has uppercase and lowercase letters a-z.
		
		testStrings("aabcccccaaa");
	
	}
	
	public static String compress(String str) {
		
		char[] array = str.toCharArray();
		String results = "";
		int index = 1;
		
		for(int i=0; i < array.length; i++){
			int compressionIndex = 1;
			if (i < index){
				for(int j = i+1; j < array.length; j++){
					if(array[i] == array[j]){
						compressionIndex += 1;
						index += 1;
					}
					
				}
			}	
		}
			
		
		return results;
	}
	
	public static String getResults(String str) {
		return "Testing string: "+ str + " | " + compress(str);
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