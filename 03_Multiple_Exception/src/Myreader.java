import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Myreader {
	public void read() throws FileNotFoundException, SQLException
	{
		int error;
		error=2;
		if(error==1)
		{
			FileNotFoundException e=new FileNotFoundException("Error File");
			throw e;
		}
		if(error==2)
		{
			SQLException s=new SQLException("Error SQL");
			throw s;
		}
	}

}
