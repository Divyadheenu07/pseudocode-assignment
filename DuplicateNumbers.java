
public class DuplicateNumbers {
	public static void main(String[] args) {
		//declare the input
		int[] num = {11,22,33,44,55,66,22,77,11};
		     // iterate the for loop
		for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					//enter the if condition
					if (num[i]==num[j]) {
						System.out.println(num[j]);
					}
					
				}
		
	}

}
}