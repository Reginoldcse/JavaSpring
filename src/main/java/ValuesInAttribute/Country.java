package ValuesInAttribute;

public class Country {

	private String name;
	private String currency;
	private String capital;
	
	public Country(String name, String currency, String capital) {
		this.name = name;
		this.currency = currency;
		this.capital = capital;
	}

	
	public String getName() {
		return name;
	}


	public String getCurrency() {
		return currency;
	}


	public String getCapital() {
		return capital;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", currency=" + currency + ", capital=" + capital + "]";
	}
	
	
	
}
