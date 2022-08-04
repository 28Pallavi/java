package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSortingExample {

	public static void main(String[] args) {
		
		//creating object of Student
				Student s= new Student(1,"pallavi",98765432,12);
				Student s1= new Student(2,"shivshakti",91765432,23);
				Student s2= new Student(3,"pooja",8765432,18);
				Student s3= new Student(4,"neha",8965432,15);
				Student s4= new Student(5,"shivani",88765432,43);
				Student s5= new Student(5,"mamta",88765432,13);
				Student s6= new Student(5,"kubra",88765432,27);
				Student s7= new Student(5,"purva",88765432,19);
				Student s8= new Student(5,"vaishnavi",88765432,30);
				Student s9= new Student(5,"mayuri",88765432,40);
				
				//creating ArrayList of Student datatype
				ArrayList<Student> a = new ArrayList<Student>();
				
				//adding Student object
				a.add(s);
				a.add(s1);
				a.add(s2);
				a.add(s3);
				a.add(s4);
				a.add(s5);
				a.add(s6);
				a.add(s7);
				a.add(s8);
				a.add(s9);
				
				Collections.sort(a); //sort student a.age
				
				for(Student st : a) {
					System.out.println(st.sid + " " + st.sname + " " + st.sphone + " " + st.age);
				}

	}

}
