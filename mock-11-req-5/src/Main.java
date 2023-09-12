import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter the number of the colleges:");
		int n=sc.nextInt();
		ArrayList<College> collegeList=new ArrayList<College>();
		for(int i=0;i<n;i++)
		{
			String detail=sc2.nextLine();
			College college=College.createCollege(detail);
			collegeList.add(college);
		}
		
		System.out.println("Enter a type to sort:\r\n" + 
				"1.Sort by name\r\n" + 
				"2.Sort by number of departments\r\n" + 
				"3.Sort by starting date\r\n" + 
				"");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:	//sort by name
			Collections.sort(collegeList);
			break;
		case 2:	//sort by number of departments			
			Collections.sort(collegeList,new DepartmentComparator());
			break;
		case 3:	//sort by starting date
			Collections.sort(collegeList,new StartingDateComparator());
			break;
		}
		
		System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
		
		for(College c: collegeList)
		{
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date")));
		}
	}

}
