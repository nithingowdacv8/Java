import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int n=sc.nextInt();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		List<College> list=new ArrayList<College>();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			//parse this detail into a College object
			String[] arr = detail.split(",");
			College college=new College();
//			IIT Madras,www.iitm.ac.in/,9876543210,Govt of India,15,Chennai,30-05-1959
			college.setName(arr[0]);
			college.setWebsite(arr[1]);
			college.setMobile(arr[2]);
			college.setFounder(arr[3]);
			college.setNumberOfDept(Integer.valueOf(arr[4]));
			college.setLocation(arr[5]);
			college.setStartingDate(sdf.parse(arr[6]));
			list.add(college);
		}
		
		Map<String, Integer> result = College.calculateLocationCount(list);
		
		System.out.format("%-15s %s\n","Location","Count");
		for(Entry<String, Integer> entry:result.entrySet())
		{
			System.out.format("%-15s %s\n",entry.getKey(),entry.getValue());
		}
		
	}

}
