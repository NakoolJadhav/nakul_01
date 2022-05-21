package methoddemo;

public class Class_method {
	

	int a=10;
	int b=20;
	
	int d= a+b;
	
	public void m1() {
		int c;
		c = a+b;
		System.out.println(c);
		int e;
		e =a*b;
		System.out.println(e);
	}
	
	public static void m2() {
		int h=15;
		int n=60;
		int w;
		w= h*n;
		System.out.println(w);
	}
    public static void m3() {
    	System.out.println("hello");
    	System.out.println("i am nakul jadhav");
        System.out.println("welcome");
    }
   
    public static void m4(  ) {
     System.out.println("batch 9");
     	
    }
    
    public static void m5( String a ) {
        System.out.println("word");
    }      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Class_method abc=new Class_method();
      //non static
      abc.m1();
      System.out.println(abc.d);
      Class_method.m2();
      //static
      abc.m2();
      abc.m3();
      //aregument
      Class_method.m4();
      //non argument
      Class_method.m5("hello");
	}

}
