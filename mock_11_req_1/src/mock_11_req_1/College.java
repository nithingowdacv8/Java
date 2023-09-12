package mock_11_req_1;

import java.sql.Date;

public class College {
	private String name;
    private String website;
    private String mobile;
    private String founder;
    private int numberOfDept;
    private String location;
    private Date startingDate;

    public College() {
    }

    public College(String name, String website, String mobile, String founder, int numberOfDept, String location, java.util.Date date) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberOfDept = numberOfDept;
        this.location = location;
        this.startingDate = (Date) date;
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

    public int getNumberOfDept() {
        return numberOfDept;
    }

    public void setNumberOfDept(int numberOfDept) {
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
        return String.format(
                "Name: %s\nWebsite: %s\nMobile: %s\nFounder: %s\nNumber of Dept: %d\nLocation: %s\nStarting Date: %s",
                name, website, mobile, founder, numberOfDept, location, startingDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        College other = (College) obj;

        return name.equalsIgnoreCase(other.name) && startingDate.equals(other.startingDate);
    }

}
