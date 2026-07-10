package Array;

public class practice {
	
	public static void main(String [] args) {
		
		int[] a = {112,3,2,3,4,5,6,7,5,4};
		
		
		System.out.println(a.length);
		System.out.println(a[1]);
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		int[] b = new int[5];
		b[0] = 12;
		b[1] = 24;
		b[2] = 36;
		b[3] = 48;
		b[4] = 60;
	//	b[5] = 72;   ->   5 elements not 5 index
		
		for(int j = 0 ; j < b.length ; j++) {
			System.out.println(b[j]);
		}
	}

}
