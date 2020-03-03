package Package;

public class New2 extends New1
    {
	
	public New2()
	{    
		System.out.println(" Child defualt constructor ");
	}
	public New2(int a)
	{
		System.out.println(" Child one constructor");
	}
	public New2(int a,int b)
	{   super(1);
		System.out.println("Child two constructor");
	}
	public static void main(String []args)
	{
		New2 obj= new New2(1,2); 
	}
}



