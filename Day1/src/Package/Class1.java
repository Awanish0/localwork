package Package;
                             // (((((10+2)-2)+2)*2)/2)    
 class Class1 {
	
	
	 int sum(int a , int b)
	{
		  int c=a+b;   System.out.println(c);                      //  one print  
		  return c; 
	}
	
	 int sub(int a, int b)
	{                                                           
		int c=a-b; System.out.println(c);                          // two print 
		return c; 
	}
	
	 int mult(int a, int b)
	{
		int c =a*b; System.out.println(c);                         // three print 
		return c;
	}

	 void div(int a, int b )
	{
		int c=a/b;  System.out.println(" Final result is " +c);     // four print     
	}
	 public static void main(String[]args)
	 
	 {
		 Class1 ref=new Class1();
		 int sum_result= ref.sum(10, 2);
		 int sub_result= ref.sub(sum_result, 2);	
		 int sum_result1=ref.sum(sub_result, 2);	
		 int mult_result=ref.mult(sum_result1, 2);
		 ref.div(mult_result, 2);
		 
	 }
}
