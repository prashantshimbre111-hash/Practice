package overriding1;

public class test {
	
	public static void main(String[] args) {
		
		employee e;
		
		e = new employee();
		e.getsal(124562);
		
		e = new dev();
		e.getsal(1234567);
		
		e = new tester();
		e.getsal(123456789);
		
	}

}
