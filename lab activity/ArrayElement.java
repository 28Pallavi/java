package lab;

public class ArrayElement {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5}; //creating array
		
		System.out.println("Array elements in odd position: ");
		
		for(int i=0;i<arr.length;i+=2) { //for loop for printing odd position array element
			System.out.println(arr[i]);
		}

	}

}
