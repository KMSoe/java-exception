import java.io.FileNotFoundException;

public class MyReader{
	public void read() throws FileNotFoundException
	{
		int errorcode=1;
		if(errorcode==1)
		{
			FileNotFoundException ex=new FileNotFoundException("File Not Found");
			throw ex;
		}
	}
}