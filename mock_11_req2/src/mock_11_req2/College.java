package mock_11_req2;
import java.util.*;
import java.text.SimpleDateFormat;
public class College {
	private String name;
    private String website;
    private String mobile;
    private String founder;
    private Integer numberOfDept;
    private String location;
    private Date startingDate;

    public College() {}

    public College(String name, String website, String mobile, String founder,
                   Integer numberOfDept, String location, Date startingDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberOfDept = numberOfDept;
        this.location = location;
        this.startingDate = startingDate;
    }

    public static College createCollege(String detail) {
        String[] details = detail.split(",");
        if (details.length != 7) {
            return null;
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date startingDate = sdf.parse(details[6].trim());
            return new College(
                    details[0].trim(),
                    details[1].trim(),
                    details[2].trim(),
                    details[3].trim(),
                    Integer.parseInt(details[4].trim()),
                    details[5].trim(),
                    startingDate
            );
        } catch (Exception e) {
            return null;
        }
    }

    // Getters and setters for College attributes
    // Add here...
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

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n",
                name, website, mobile, founder, numberOfDept, location, sdf.format(startingDate));
    }

	

}
