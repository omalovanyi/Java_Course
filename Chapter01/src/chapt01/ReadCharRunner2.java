package chapt01;
import java.io.*;//


public class ReadCharRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader bis = new BufferedReader(is);
		
		try{
			
			System.out.println("������� ���� ��� � ������� <Enter>:");
			
			String name = bis.readLine();
			System.out.println("������, " + name);
			
		} catch(IOException e){
			System.err.print("������ ����� " + e);
		}

	}

}
