package mock_11_req2;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
    private List<College> collegeList;

    public University() {
        this.collegeList = new ArrayList<>();
    }

    public University(String name, List<College> collegeList) {
        this.name = name;
        this.collegeList = collegeList;
    }

    // Getters and setters for University attributes
    // Add here...

    public void addCollegeToUniversity(College college) {
        collegeList.add(college);
        System.out.println("College successfully added");
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}

	public boolean removeCollege(String name) {
        for (College college : collegeList) {
            if (college.getName().equals(name)) {
                collegeList.remove(college);
                System.out.println("College successfully deleted");
                return true;
            }
        }
        System.out.println("College not found in the University");
        return false;
    }

    public void displayColleges() {
        if (collegeList.isEmpty()) {
            System.out.println("No colleges to show");
        } else {
            System.out.println("Colleges in " + name);
            System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name", "Website", "Mobile",
                    "Founder", "Number of Dept", "Location", "Starting Date");
            for (College college : collegeList) {
                System.out.println(college);
            }
        }
    }

}
