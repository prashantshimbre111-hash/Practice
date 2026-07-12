package Encapsulation.Insurance;

public class customer {
	private String cname;
	private String city;
	private policy p;
	
	public void setCname(String cname ) {
		
		this.cname = cname;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCity(String city) {
		
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setp(policy p) {
		this.p = p;
	}
	
	public policy getp() {
		return p;
	}

}
