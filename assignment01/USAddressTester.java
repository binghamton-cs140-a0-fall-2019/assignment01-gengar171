package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress addObj1 = new StreetUSAddress("123 45th street", "", "Brooklyn", "NY", "11211");
		StreetUSAddress addObj2 = new StreetUSAddress("777 x ave", "y drive", "Binghamton", "NY", "13000");
		System.out.println(addObj1 + "\n");
		System.out.println(addObj2);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		StreetUSAddress addObj12 = new StreetUSAddress("123 45th street", "", "Brooklyn", "NY", "11211");
		StreetUSAddress addObj22 = new StreetUSAddress("777 x ave", "y drive", "Binghamton", "NY", "13000");
		output.println(addObj12);
		output.print("\n");
		output.println(addObj22);


		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}