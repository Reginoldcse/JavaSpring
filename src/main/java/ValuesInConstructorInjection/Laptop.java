package ValuesInConstructorInjection;

public class Laptop {

	private String brand;
	private String model;
	private double price;
	private String storage;
	
	public Laptop(String brand, String model, double price, String storage) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.storage = storage;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getStorage() {
		return storage;
	}
	
	
	
}
