package ValuesInConstructorSchema;

public class Student {
	
	private String name;
	private int marks;
	private String schooolname;
	
	public Student(String name, int marks, String schooolname) {
		this.name = name;
		this.marks = marks;
		this.schooolname = schooolname;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String getSchooolname() {
		return schooolname;
	}
	
}
