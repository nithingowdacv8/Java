import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main4 {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(112, "Raja", "ECE", 120.0));
		empList.add(new Employee(5, "Abdul", "EEE", 100.0));
		empList.add(new Employee(11, "Zaheer", "ECE", 120.0));
		empList.add(new Employee(8, "Babu", "EEE", 100.0));
		empList.add(new Employee(18, "Ganesh", "EEE", 120.0));
		empList.add(new Employee(10, "Kumar", "ECE", 100.0));
		
//		Map<String, Double> result = empList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

		Map<String, Double> result = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		for(Entry<String, Double> e:result.entrySet())
			System.out.println(e);
		


	}

}
