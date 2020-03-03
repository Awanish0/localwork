package Conditionclass;
import java.util.Scanner;

public class Ifclass 
     {
     public static void main(String[] args) 
     {
	System.out.println("Please enter value of a an even number");
	Scanner a= new Scanner(System.in);
	int b=a.nextInt();
	if  (b%2==0)  
	{
		System.out.println("Correct this is even number ");
	}
	else {
		System.out.println("Not valid please write even number");
	}
     }
     }
     