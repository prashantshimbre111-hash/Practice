package String;

public class practice {
	
	public static void main(String[] args) {
		
		String s = "prashant";
		String p = "prashant";
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf("p"));
		System.out.println(s.equals(p));
		System.out.println(s.startsWith("p"));
		System.out.println(s.replace('p', '1'));
		
		
		for(int i = 0 ; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

}
