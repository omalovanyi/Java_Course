package chapt01;
/* пример # 4 : вывод аргументов командной строки: OutArgs.java */
public class OutArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for (String str: args)
		{
			System.out.printf("Arg["+i+"]-> %s%n", str);
            i++;
		  	
		}	
		
	}

}
