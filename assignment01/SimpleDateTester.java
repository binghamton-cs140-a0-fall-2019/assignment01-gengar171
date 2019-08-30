package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate dateObj1 = SimpleDate.of(2019, 1, 17);
		SimpleDate dateObj2 = SimpleDate.of(2019, 8, 13);
		boolean result1 = dateObj1.before(dateObj2);
		boolean result2 = dateObj2.before(dateObj1);

		System.out.println(result1);
		System.out.println(result2);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

			output.println(result1);
			output.println(result2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}