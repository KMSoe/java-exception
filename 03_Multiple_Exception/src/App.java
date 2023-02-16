import java.io.FileNotFoundException;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		Myreader reader=new Myreader();
		try {
			reader.read();
			System.out.println("Continues Try block");
		}
		catch(FileNotFoundException | SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
