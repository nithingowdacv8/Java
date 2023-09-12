import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int n=sc.nextInt();
		//to get n inputs from the user
		List<College> collegeList=new ArrayList<College>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			
//			IIT Madras,www.iitm.ac.in/,9876543210,Govt of India,15,Chennai,30-05-1959
			String[] arr = detail.split(",");
			College college=new College();
			college.setName(arr[0]);
			college.setWebsite(arr[1]);
			college.setMobile(arr[2]);
			college.setFounder(arr[3]);
			college.setNumberOfDept(Integer.parseInt(arr[4]));
			college.setLocation(arr[5]);
			
			college.setStartingDate(sdf.parse(arr[6]));
			collegeList.add(college);
			
		}
		int choice=sc.nextInt();
		CollegeBO cbo=new CollegeBO();
		List<College> result=null;
		switch(choice)
		{
		case 1://by name
			int noOfName=sc.nextInt();
			List<String> nameList=new ArrayList<>();
			for(int i=0;i<noOfName;i++)
			{
				String name=sc.nextLine();
				if(name.equals(""))
					name=sc.nextLine();
				nameList.add(name);			
			}
			result=cbo.findCollege(collegeList, nameList);
			break;
		case 2://by st dt
			String startingDate=sc.nextLine();
			if(startingDate.equals(""))
				startingDate=sc.nextLine();
			Date stDate=sdf.parse(startingDate);
			result=cbo.findCollege(collegeList, stDate);
			break;
		case 3://by location
			String location=sc.nextLine();
			if(location.equals(""))
				location=sc.nextLine();
			result = cbo.findCollege(collegeList, location);
			break;
		case 4:
				//find by name and remove
			String name=sc.nextLine();
			if(name.equals(""))
				name=sc.nextLine();
			result=cbo.removeCollegeByName(collegeList, name);
			break;
		}
		
		
		
		if(!result.isEmpty())
		{
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
			for(College c:result)
			{
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));			
			}
		}else
		{
			System.out.println("No such college is present");
		}
	}

}
