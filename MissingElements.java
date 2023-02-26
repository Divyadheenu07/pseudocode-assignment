import java.util.Arrays;

public class MissingElements {
public static void main(String[] args) {
	//declare array
	int[] arr = {2,5,6,8,9,1,3,4};
	//sort the array
	Arrays.sort(arr);
	// initialize a random variable
	int j=0;
	// iterate for loop
	for(int i=0;i<arr.length;i++) {
		//increment the j value
		j=i+1;
		//i not equal to print the the j and break
		if(arr[i]!=j) {
			System.out.println(j);
			break;
		}
		
				
	}
	
	
	
}
}
