
public class Employee implements Comparable<Employee>{
	Integer id;
	String name;
	String department;
	Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
////		return this.getId().compareTo(o.getId());	//id is Integer type
////		return this.getId()-o.getId();			//id is int types
//		return o.getId().compareTo(this.getId());
//	}
	
	public int compareTo(Employee o)
	{
////		return this.getName().compareTo(o.getName());
////		return o.getName().compareTo(this.getName());
//		if(this.getDepartment().equals(o.getDepartment()))
//			return this.getId().compareTo(o.getId());
//		else
//			return this.getDepartment().compareTo(o.getDepartment());
		return this.id-o.id;
	}
}
