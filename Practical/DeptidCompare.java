package CollectionEg;

import java.util.Comparator;

public class DeptidCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.dept_id == o2.dept_id) 
		return 0;
		else if (o1.dept_id > o2.dept_id)
			return 1;
		else
			return -1;
		
	}

}
