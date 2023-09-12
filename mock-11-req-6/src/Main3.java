import java.util.ArrayList;
import java.util.Collections;


public class Main3 {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(112, "Raja", "ECE", 121212.0));
		empList.add(new Employee(5, "Abdul", "EEE", 521212.0));
		empList.add(new Employee(11, "Zaheer", "ECE", 421212.0));
		empList.add(new Employee(8, "Babu", "EEE", 721212.0));
		empList.add(new Employee(18, "Ganesh", "EEE", 621212.0));
		empList.add(new Employee(10, "Kumar", "ECE", 321212.0));
		
		//lambda to sort by name desc
		Collections.sort(empList,(a,b)->b.getName().compareTo(a.getName()));
		
		for(Employee e:empList)
			System.out.println(e);
	}

}
