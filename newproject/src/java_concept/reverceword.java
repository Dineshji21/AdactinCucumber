package java_concept;

public class reverceword {
	public static void main(String[] args) {
		
	

	String s="java welcome kjsdhflkjshflksjhf sjfhsljghklsdfhjljkghlskjh ";
	String word[]=s.split("\\s"); //["java","welcome"]
	String reversedString = " " ;


	for(int i=0; i<word.length ;i++) {
		if (i == word.length - 1) 
			reversedString = word[i] + reversedString; 
		else
			reversedString = " "+word[i] + reversedString; // rs= java 
															// rs = welcome +java
	
	}
	System.out.println("before revercing word  ");
	System.out.println("java welcome and");
	System.out.println("after revercing word  ");
	System.out.println("reversedString :" +reversedString);
	System.out.println(reversedString);
	
}
}


