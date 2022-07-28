package lab;

public class ArrayContains {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5}; //creation of array
		int key=3; //specific value
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])  //condition for checking specific value
				System.out.println("Array contains value");				
		}
	}

}
