package Encapsulation.Insurance;

public class TEst {
	
	public static void main(String [] args) {
		
		policy pp = new policy();
		
		pp.setpolicyname("aditya birla life insurance");
		pp.setpolicyno(123456789);
		
		customer c = new customer();
		c.setCname("prashant shimbare");
		c.setCity("pune");
		c.setp(pp);
		
		
		System.out.println(c.getCname());
		System.out.println(c.getCity());
		System.out.println(c.getp().getpolicyname());
		System.out.println(c.getp().getpolicyno());
	}

}
