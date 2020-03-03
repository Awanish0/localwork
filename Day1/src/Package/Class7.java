package Package;

import java.util.Scanner;     //Scanner Class Use 

public class Class7 {
	
 public static void main (String []args )
 {
	System.out.println("Enter your name ?");
	Scanner s=new Scanner(System.in); 
	String a = s.next(); 
	System.out.println(a +", Plz write your age?  ");
	int b=s.nextInt();
	System.out.println("Thank you " + a  + " and your age is " + b );
 System.out.println(a +  ",How are you ? ");
String  m=s.next();
if(m.equalsIgnoreCase("Good") || m.equalsIgnoreCase("Awesome") || m.equalsIgnoreCase("Fine"))  // If and else 

 System.out.println( "Ok " + a + " ,I am glad to hear that you are " + m);
else
	System.out.println("Ok "+a +", I wish that all things will be fine soon!");

 }
}
