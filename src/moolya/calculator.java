package moolya;

public class calculator {

	public void Sum(int a, int b) {
		int z = a + b;
		System.out.println("sum is:"+z);
		
	}
	void sum(int a,int b,int c) {
		int x=a+b+c;
		System.out.println("sum is:"+x);
		
	}

	void sub(int a1, int b1) {
		int l = a1 - b1;
		System.out.println("sub is:"+l);
		
	}

	void mul(int a2, int a3) {
		int s = a2 * a3;
		System.out.println("mul is:"+s);
		
	}

	void div(int a4, int a5) {

		int n = a4 / a5;
		System.out.println("div  is:"+n);
	}

	
public static void main(String args[]) {
	calculator cal = new calculator();
	cal.Sum(4, 5);
	cal.sum(8, 2, 1);
	cal.sub(7, 2);
	cal.mul(3, 4);
	cal.div(8, 4);
	
	
}
}