package ValuesInReferenceType;

public class Person {

	private String name;
	private int age;

	private AadharCard aadharperson;

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

	public AadharCard getAadharperson() {
		return aadharperson;
	}

	public void setAadharperson(AadharCard aadharperson) {
		this.aadharperson = aadharperson;
	}

}
