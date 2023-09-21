package lesson020;

public class User {

	private Integer id;
	private String name;
	private int salary;
	private EGender gender;
	
	public User(Integer id, String name, int salary, EGender gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public User() {
		super();
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public EGender getGender() {
		return gender;
	}
	
	public void setGender(EGender gender) {
		this.gender = gender;
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
	
	@Override
	public String toString() {
		return "User id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender;
	}
	
	public void getInfo() {
		System.out.println(toString());
	}
	
	
}
