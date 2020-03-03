package Package;

public class StaticBlck {    //  By doing static variable we can assign any new value or change the value   
	                         // but  once we declare the variable as Final we can not change the assign value of variable   
	 static int a;
     static String b; 
    static {
    	
         a= 45;
    	 b= "My name is awanish"; 
    }
    public static void main (String[]args ) {
    	System.out.println(" Value of a is " +a);
    	b="awanish";
    	System.out.println("Value of b " + b);
    }
    
}
