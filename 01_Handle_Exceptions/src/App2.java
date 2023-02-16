import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\source\\myNot.txt");

		Scanner sc = new Scanner(file);

		while(sc.hasNext())//return true if still remains lines
		{
			System.out.println(sc.nextLine());
		}
		
		System.out.println("Continue Reading");
}
}
//throws to JVM and sends error message from JVM
