
import java.util.Arrays;

public class DesignRecipe {

	public static void main (String[] args) {
		
		// change string and array here when calling intersperse
		System.out.println(Arrays.toString(intersperse("hello", null)));
	}
	
	public static String[] intersperse(String s, String[] arr) {
		
		if (s == null || arr == null) {
			System.out.println("Given a non-valid input.");	
			return null; 					
		} else if (arr.length < 2) {
			return arr; 
		} else {
			String[] arr2 = new String[arr.length*2 - 1];
			
			for (int i = 0; i < (arr.length-1); i++) {
				arr2[2*i] = arr[i];
				arr2[2*i+1] = s;
			}
			
			arr2[arr2.length-1]=arr[arr.length-1];
			return arr2;
		}
	}
}