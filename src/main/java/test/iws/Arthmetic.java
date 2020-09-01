package test.iws;
public class Arthmetic extends Exception {


  
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static void validate(int age) throws Arthmetic {  
	     if(age<18)  
	      throw new Arthmetic ();  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]) throws Throwable{  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }  
	}
