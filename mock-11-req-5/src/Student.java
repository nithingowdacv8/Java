public class Student implements Comparable<Student> {
	private Integer id;
	private String name;
	private Integer marks;

	public Student(Integer id, String name, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", marks=" + this.marks + ", toString()=" + super.toString() + "]";
	}

	public int compareTo(Student s) {
		if (this.getId() >= s.getId())
			return this.getId().compareTo(s.getId());
		else if (this.getId() < s.getId())
			return -1;
		return this.getId().compareTo(s.getId());
	}

}