package chapt01;

public class Runner {

	public static void main(String[] args) {
         
		User user=new User();
		
		
		user.numericCode=71;
		user.setNumericCode(550);
		user.setPassword("pwd");
		UserView.welcome(user);
		
	}

}
