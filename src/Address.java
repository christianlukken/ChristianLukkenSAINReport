
public class Address 
{

	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	
	public Address(String streetNumber, String streetName, String city, String state, int zip) {
		super();
		
		this.streetAddress = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	public String getStreetName() {
		return streetAddress;
	}
	public void setStreetName(String streetName) {
		this.streetAddress = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
}
