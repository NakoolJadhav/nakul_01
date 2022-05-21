package methoddemo;

public class task {
     int a=10;
     int b=20;
     int c;
     public void addition() {
    	 c = a+b;
    	 System.out.println("addition of a and b is" +c);
     }
     public void subtraction() {
    	 c= b-a;
    	 System.out.println("subtraction of a and b is" +c);
     }
     public void multiplication() {
    	 c = a*b;
    	 System.out.println("multiplication of a and b is" +c);
     }
     public void division() {
    	 c = b/a;
    	 System.out.println("division of b and a is " +c);
 
     }
   String g = "hello";
   String h = " I am nakul jadhav";
   public void add () {
     System.out.println(g + h);	 
    
   }
    
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task xyz=new task();
		
		xyz.addition();
		xyz.subtraction();
		xyz.multiplication();
		xyz.division();
		xyz.add();
		
		
	}
	
}
