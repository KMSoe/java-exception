
public class App {
	private static String text;
	public static void main(String[] args) {
		
		
		Myreader reader=new Myreader();
//		reader.readLine();
//		reader.readAll();
		
		
		if(text!=null)
		{
			System.out.println(text.length());	
		}
		System.out.println("Continue...");
//		int x=12/0;
//		System.out.println(x);
		int []numbers= {12,23,34};
		System.out.println(numbers[3]);
	}
	
	
}
//null pointer exception