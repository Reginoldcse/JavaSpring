package ValuesInSetType;

import java.util.Set;

public class Fruits {
	
	private Set<String> fruitname;
	private String color;
	private String taste;
	
	public Fruits(Set<String> fruitname, String color, String taste) {
		super();
		this.fruitname = fruitname;
		this.color = color;
		this.taste = taste;
	}
	
	public Set<String> getFruitname() {
		return fruitname;
	}
	public String getColor() {
		return color;
	}
	public String getTaste() {
		return taste;
	}

	@Override
	public String toString() {
		return "Fruits [fruitname=" + fruitname + ", color=" + color + ", taste=" + taste + "]";
	}


}
