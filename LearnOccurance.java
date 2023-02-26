package day7;

public class LearnOccurance {
	public static void main(String[] args) {
		//declare a String input
		String input="TestleAF";
		//to get the size  of the String
		int length = input.length();
		//Convert the String into charArray
		char[] charArray=input.toCharArray();
		//Initialize the count variable as 0
		int count=0;
		//Iterate the characters
		for(int i=0;i<charArray.length;i++) {
			//check the condition if it is match , Increase the count variable
			if(charArray[i]=='e')
				count++; 
		}
		//Print the count
		System.out.println("e occurance is "+count);
		
	}
	
	}


