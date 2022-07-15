package lab;

public class LibraryUserDemo {

	public static void main(String[] args) {
		
		KidUser kidUsers = new KidUser(); //creating object for KidUser 
		kidUsers.setAge(10);
		kidUsers.setBookType("Kids");
		kidUsers.registerAccount(); //invoke method
		kidUsers.requestBook();
		kidUsers.setAge(18);	
		kidUsers.setBookType("Fiction");		
		kidUsers.registerAccount();
		kidUsers.requestBook();
		System.out.println();
		
		AdultUser adultUser = new AdultUser(); //creating object for AdultUser
		adultUser.setAge(5);
		adultUser.setBookType("Kids");
		adultUser.registerAccount();  //invoke method
		adultUser.requestBook();
		adultUser.setAge(23);	
		adultUser.setBookType("Fiction");		
		adultUser.registerAccount();
		adultUser.requestBook();

	}

}
