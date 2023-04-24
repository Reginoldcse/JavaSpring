package ValuesInMapType;

import java.util.Map;

public class Food {
	
	private Map<Integer,String> foodname;
	private String hotelname;
	
	public Map<Integer, String> getFoodname() {
		return foodname;
	}
	public String getHotelname() {
		return hotelname;
	}
	
	public Food(Map<Integer, String> foodname, String hotelname) {
		super();
		this.foodname = foodname;
		this.hotelname = hotelname;
	}
	
	@Override
	public String toString() {
		return "Food [foodname=" + foodname + ", hotelname=" + hotelname + "]";
	}
	
	

}
