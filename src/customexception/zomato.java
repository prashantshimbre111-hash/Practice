package customexception;

public class zomato {
	
	public static void getorder(String city) throws RuntimeException {
		
		String currentcity = "pune";
		System.out.println("select order");
		if(!city.equals(currentcity)) {
			throw new InvalidCityException("Exception Found");
			
		}
		System.out.println("select adrress");
		System.out.println("select payment method");
		System.out.println("place your order");
		
	}

}
