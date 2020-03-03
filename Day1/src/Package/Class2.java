package Package;
                                     //  ((((10-2)*2)+2)-2)/2)

public class Class2 {

	public int sub(int a, int b )
	{
		
			int c=a-b;   System.out.println( c);
			return c; 
	}
	public int mult(int a , int b)
	{
		int c= a*b;  System.out.println( c);
		return c; 
	}
	 public int sum(int a, int b)
	 {
		  int c=a+b; System.out.println( c);
		  return c; 
	 }
	 public void div(int a, int b)
	 {
		 int c=a/b;      System.out.println(" Final result is " + c);
	 }
	 public static void main(String[]args)
	 {
		 Class2 ref2=new Class2(); 
		 int result_sub=ref2.sub(10, 2);	
		 int result_mul=ref2.mult(result_sub, 2);
		int result_sum= ref2.sum(result_mul, 2);
		int result_sub2=ref2.sub(result_sum, 2);
		ref2.div(result_sub2, 2);	
	 }
}
