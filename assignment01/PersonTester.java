package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth pdobObj1 = new DateAndPlaceOfBirth(1996, 1, 18, "Brooklyn", "NY", "USA");
		StreetUSAddress addObj1 = new StreetUSAddress("123 44th street", "", "Brooklyn", "NY", "11200");
		Person pObj1 = new Person("Mingming", "Jiang", "1234560000", pdobObj1, addObj1);

		System.out.println(pObj1);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		DateAndPlaceOfBirth pdobObj12 = new DateAndPlaceOfBirth(1996, 1, 18, "Brooklyn", "NY", "USA");
		StreetUSAddress addObj12 = new StreetUSAddress("123 44th street", "", "Brooklyn", "NY", "11200");
		Person pObj12 = new Person("Mingming", "Jiang", "1234560000", pdobObj1, addObj1);

		output.println(pObj12);


		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}