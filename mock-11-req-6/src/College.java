import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College() {}

	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	
//	static Map<String, Integer> calculateLocationCount(List<College> list)
//	{		
//		Map<String, Integer> result=new TreeMap<>();
//		for(College c:list)
//		{
//			String location=c.getLocation();
//			//if this location is already found, get count and increment
//			//if this location is not found, count is 1
//			Integer count=result.get(location);
////			if(count==null)
////				count=0;
//			count=(count==null)?0:count;
//			count++;
//			result.put(location, count);
//		}
//		return result;
//	}
	
//	public static Collector<Object, ?, Integer> countingInt() {
//	    return Collectors.summingInt(e -> 1);
//	}
//	

	
	static Map<String, Integer> calculateLocationCount(List<College> list)
	{
		return list.stream()
		.collect(Collectors.groupingBy(College::getLocation, Collectors.summingInt(e->1)));
	}
}
