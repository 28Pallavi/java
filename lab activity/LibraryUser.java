package lab;

// Creating an interface 
public interface LibraryUser {
	
	//methods
	void registerAccount();
	void requestBook();

}

//class KidUser implements LibraryUser interface
class KidUser implements LibraryUser {
	//instance variables 
	private int age;
	private String bookType;
	
	//generate setter method for variables
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String book) {
		this.bookType = book;
	}
    //methods
	public void registerAccount() {
		if(age < 12)
			System.out.println("You have successfully registered under a Kids Account");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid");		
	}

	public void requestBook() {
		if(bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}
}
	
//class AdultUser implements LibraryUser interface
class AdultUser implements LibraryUser {
	    //instance variables 
		private int age;
		private String bookType;
		
		//generate setter method for variables
		public void setAge(int age) {
			this.age = age;
		}
		public void setBookType(String book) {
			this.bookType = book;
		}
		
		//methods
		public void registerAccount() {
			if(age > 12)
				System.out.println("You have successfully registered under a Adult Account");
			else
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
		public void requestBook() {
			if(bookType.equals("Fiction"))
				System.out.println("Book Issued successfully, please return the book within 7 days");
			else
				System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}