package voidmethod;

public class Test {
	public static void main(String[] args) {

		Arithematic a = new Arithematic();
		a.calculation();
		
		calculation cc = new calculation();
		cc.cal();
		
		voidcheck v = new voidcheck();
		v.cal();
		
		simple s = new simple();
		s.add();
		s.add1(12, 24);
	}

}
