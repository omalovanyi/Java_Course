package Lesson13.video;


public class TestStackTrace2 {
	  
	TestStackTrace2() throws Exception
	{
		try{ 
		divideByZero();
		} catch (ArithmeticException f){
			//System.out.println("Divizion by zero");
			//f.printStackTrace();
			// Log this error here, and rethrow another exception
			throw new Exception ("Customer List is not availablelll=== "+ f.getMessage());
		
		}
		
		finally {
			System.out.println("cool");
			
		}
		
		}
	
	
	int divideByZero(){
		return 25/0;
	}
	
	public static void main (String[] args){
		try{
		new TestStackTrace2();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
