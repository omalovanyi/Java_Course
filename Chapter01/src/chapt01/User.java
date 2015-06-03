package chapt01;
//пример # 5 : простой пример Java Beans класса: User.java

public class User {
	public int numericCode;//нарушение инкапсул€ции
	private String password;
	
	public void setNumericCode(int value)
	{
	    if (value>0) 
	    {
	    	numericCode=value;
	    }
	    else 
	    {
	    	numericCode=1;
	    }
	
	}
	
	public int getNumericCode()
	{
		return numericCode;
	}
	
	public void setPassword(String pass)
	{
		if (pass!=null)
			password=pass;
		else
			password = "11111";
	}
	
	public String getPassword() {
		//public String getPass() {//некорректно Ц неполное им€ метода
		return password;
		}
	
	
}
