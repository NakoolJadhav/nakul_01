package methoddemo;

public class demomethode {
	
	int a=10;
	int b=5;
	
	// non static
	public void m1() {
		int c;
		c=a*b;
		System.out.println(c);
		
	}
	// static method
	public static void m2() {

		
		System.out.println("hello");
	    System.out.println("abc");
	    
	}
	 
// no argument method
	
	public static void m3() {
		
		System.out.println("batch9");
	}
// argument 
	
	public static void m4(int a) {
		int z;
		z=10;
		int d = a+z;
	System.out.println(d);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	demomethode xyz=new demomethode();
	//non static
	xyz.m1();
	// static
	demomethode.m2();
	xyz.m2();
	// no agr
	demomethode.m3();
	//args
    demomethode.m4(27);
    
    
	
	}

}
