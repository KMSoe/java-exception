import java.io.FileNotFoundException;

public class App{
	public static void main(String[] args) 
		{
		MyReader reader=new MyReader();
		try
		{
			reader.read();
			System.out.println("Continue Try block....");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
}
}