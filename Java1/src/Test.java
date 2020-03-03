
public class Test {
     int a= 1; 
      
      public void rav(int a)
      {
          a=a+1;       System.out.println(a);
      } 
      public static void main(String[] args) {
		Test bj=new Test(); 
		System.out.println(bj.a);
		bj.rav(10);


	}
}