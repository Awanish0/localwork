package Package;
                           // Constructor class 0231  calling by one object only 
public class Class3 {
	 
	     public Class3(int a, int b)
	     
	     {  this ();
	    	 
	       
	    	 System.out.println("Two parametrise ");
	     }
	     
	     public Class3()
	     {    this (1);
	    	 
	    	 System.out.println("Default parametrise ");
	     }
	     
	     public Class3(int a, int b, int c)
	     {   
	    	 System.out.println("Three parametrise ");
	     }
	     
	     public Class3(int a)	
	     {   this (2,3,4);
	    	 System.out.println(" One parametrise ");
	     }
	      
	     public static void main(String[]args)
	     
	     {
	    	 Class3 ref1= new Class3();
	    	  	
	     }
	     
	   
}
