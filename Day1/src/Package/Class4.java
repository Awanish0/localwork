package Package;

public class Class4 {    // method calling by one object using this keyword 
	   
	static int a;

	public void method1()
	{    
		a=this.a+1; 
		
	}

      
      public static void main(String[]args)
      {
    	   Class4 ref= new Class4(); 
    	   System.out.println(ref.a);
    	   ref.method1(); System.out.println(ref.a);
    	   ref.method1(); System.out.println(ref.a);
    	   
    	   Class4 obj= new Class4(); 
    	   System.out.println(obj.a);
    	   obj.method1(); System.out.println(obj.a);
    	  
      }

}