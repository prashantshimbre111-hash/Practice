package customexception;

public class main {
	
	public static void main(String[] args) {
		
		try {
			zomato.getorder("mumbai");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("swiggy");
		System.out.println("dunzo");
	}

}
