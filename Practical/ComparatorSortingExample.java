package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortingExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"pallavi",985425866,101));
		al.add(new Employee(2,"neha",876516626,102));
		al.add(new Employee(3,"shivshkati",76552677,101));
		al.add(new Employee(4,"pooja",98754152,104));
		al.add(new Employee(5,"shivlila",8534565,103));
		al.add(new Employee(6,"madhavi",746434556,105));
		al.add(new Employee(7,"shivani",843155627,104));
		
		
		System.out.println("By Name");
		Collections.sort(al,new EmpNameCompare());
		for(Employee e : al) {
			System.out.println(e.emp_id + " " + e.emp_name + " " + e.emp_ph + " " + e.dept_id);
		}
		
		System.out.println("\nBy DeptId");
		Collections.sort(al,new DeptidCompare());
		for(Employee e : al) {
			System.out.println(e.emp_id + " " + e.emp_name + " " + e.emp_ph + " " + e.dept_id);
		}
	}

}
