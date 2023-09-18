package lesson017;

public class Musteri implements Comparable<Musteri>{

	private String name;
	private int age;
	
	public Musteri(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Musteri: Adı=" + name + ", Yaşı=" + age;
	}
	
	@Override
	public int compareTo(Musteri o) {
		return o.getAge()-this.getAge();
	}
	
	
	
}
