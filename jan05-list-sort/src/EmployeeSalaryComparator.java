import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		return (int) (x.salary-y.salary);
	}
	
}
