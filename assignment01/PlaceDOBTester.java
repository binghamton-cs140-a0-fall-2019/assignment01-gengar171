package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dpob1 = new DateAndPlaceOfBirth(2000, 9, 10, "Brooklyn", "NY", "USA");
		DateAndPlaceOfBirth dpob2 = new DateAndPlaceOfBirth(2000, 9, 10, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth dpob3 = new DateAndPlaceOfBirth(2008, 1, 8, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth dpob4 = new DateAndPlaceOfBirth(2010, 9, 10, "Some City", "Country");
		DateAndPlaceOfBirth dpob5 = new DateAndPlaceOfBirth(2019, 7, 4, "Hongkong", "China");

		System.out.println(dpob1);
		System.out.println(dpob2);
		System.out.println(dpob3);
		System.out.println(dpob4);
		System.out.println(dpob5);
		System.out.print("\n");

		System.out.println(dpob1.olderThan(dpob2)); //false
		System.out.println(dpob1.youngerThan(dpob2)); //F
		System.out.println(dpob1.hasSameBirthDateAs(dpob2)); //true
		System.out.println(dpob1.hasSameBirthDayAs(dpob2)); //T
		System.out.print("\n");

		System.out.println(dpob1.olderThan(dpob3)); //T
		System.out.println(dpob1.youngerThan(dpob3)); //F
		System.out.println(dpob1.hasSameBirthDateAs(dpob3)); //F
		System.out.println(dpob1.hasSameBirthDayAs(dpob3)); //F
		System.out.print("\n");

		System.out.println(dpob1.olderThan(dpob4)); //T
		System.out.println(dpob1.youngerThan(dpob4)); //F
		System.out.println(dpob1.hasSameBirthDateAs(dpob4)); //F
		System.out.println(dpob1.hasSameBirthDayAs(dpob4)); //T
		System.out.print("\n");

		System.out.println(dpob1.olderThan(dpob5)); //T
		System.out.println(dpob1.youngerThan(dpob5)); //F
		System.out.println(dpob1.hasSameBirthDateAs(dpob5)); //F
		System.out.println(dpob1.hasSameBirthDayAs(dpob5)); //F
		System.out.print("\n");

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		output.println(dpob1);
		output.println(dpob2);
		output.println(dpob3);
		output.println(dpob4);
		output.println(dpob5);

		output.println(dpob1.olderThan(dpob2)); //false
		output.println(dpob1.youngerThan(dpob2)); //F
		output.println(dpob1.hasSameBirthDateAs(dpob2)); //true
		output.println(dpob1.hasSameBirthDayAs(dpob2)); //T
		output.print("\n");

		output.println(dpob1.olderThan(dpob3)); //T
		output.println(dpob1.youngerThan(dpob3)); //F
		output.println(dpob1.hasSameBirthDateAs(dpob3)); //F
		output.println(dpob1.hasSameBirthDayAs(dpob3)); //F
		output.print("\n");

		output.println(dpob1.olderThan(dpob4)); //T
		output.println(dpob1.youngerThan(dpob4)); //F
		output.println(dpob1.hasSameBirthDateAs(dpob4)); //F
		output.println(dpob1.hasSameBirthDayAs(dpob4)); //T
		output.print("\n");

		output.println(dpob1.olderThan(dpob5)); //T
		output.println(dpob1.youngerThan(dpob5)); //F
		output.println(dpob1.hasSameBirthDateAs(dpob5)); //F
		output.print(dpob1.hasSameBirthDayAs(dpob5)); //F

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}