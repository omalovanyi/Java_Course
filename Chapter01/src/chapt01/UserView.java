package chapt01;

public class UserView {
	
	public static void welcome(User obj) 
	{
		System.out.printf("������! ������ ���: %d, ������: %s",
				obj.getNumericCode(), obj.getPassword());
	}

}

