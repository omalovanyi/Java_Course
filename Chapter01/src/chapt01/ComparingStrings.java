package chapt01;

public class ComparingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s1, s2;
		s1 = "Java"; 
		s2 = s1;
		
		System.out.println("сравнение ссылок " + (s1 == s2));
		
		s1 += '2';
		s2 = new String(s1);
		
		System.out.println("сравнение ссылок " + (s1 == s2));
		System.out.println("сравнение значений " + s1.equals(s2));
		
		
	}

}
