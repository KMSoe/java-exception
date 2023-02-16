import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		File file = new File("D:\\source\\mNote.txt");

		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext())//return true if still remains lines
			{
				System.out.println(sc.nextLine());
			}
			
			System.out.println("Continue Reading");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No file");
			System.out.println(e.getMessage());
			
		}

		System.out.println("Continue main method.....");
				
	}

}
