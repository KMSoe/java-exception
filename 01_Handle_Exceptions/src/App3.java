import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App3 {
	public static void main(String[] args) {
		File file=new File("D:\\source\\myNote.txt");
		try {
			read(file);
			
			System.out.println("Continue Reading");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		
			System.out.println("No file");
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("continue >>");
	}
	public static void read(File file) throws FileNotFoundException 
	{
		Scanner sc=new Scanner(file);
		while(sc.hasNext())//return true if still remains lines
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
