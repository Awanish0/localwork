package Package;

 class Testing {                                                                            //      STEP 1.     Class creation 
 
   static int age;                                                                               //        STEP 2.    Declearing variable and data type 
   int roll_no; 
	
  void display1()                                                                          //         STEP 2. Method creation  ()=symbol indicate this is method           Variable + Method  
    {
    	    System.out.println(" Welcome All "); 
    }
    
   void display2() 
    {
    	System.out.println(" Welcome All of you "); 
    }
    public static void main(String[]args)                                                    //            STEP 3.  Main method creation (To start execution point )
    {
    	Testing Deepak = new Testing();                                                     //             STEP 4.   Object creation inside the main method 
        Deepak.display1();                                                                 //              STEP 5.   Method calling and print the value           
        Deepak.display2();  
        
             Testing.age=4;  System.out.println(Testing.age);                              //    Note== We can call to global variable by class name also after declearing global variable as static value
            
     
             
             Deepak.roll_no=1234;   System.out.println(Deepak.roll_no);    
        Testing Deep = new Testing(); 
        Deep.display1();
        Deep.display2();
           Deep.age=601;System.out.println(Deep.age);                                  //  Note==  To call global variable direct by variable name and asign the value
           Deep.roll_no=456; System.out.println(Deep.roll_no);
     
    
		
	}
}
