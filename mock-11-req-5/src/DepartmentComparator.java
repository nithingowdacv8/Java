import java.util.Comparator;

public class DepartmentComparator implements Comparator<College>
{

	@Override
	public int compare(College o1, College o2) {
//		return o1.getNumberOfDept().compareTo(o2.getNumberOfDept());
		return o1.getNumberOfDept()-o2.getNumberOfDept();
//		return 0;
	}

}
