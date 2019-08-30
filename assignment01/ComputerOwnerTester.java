package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth pdobObj1 = new DateAndPlaceOfBirth(1996, 1, 18, "Brooklyn", "NY", "USA");
		StreetUSAddress addObj1 = new StreetUSAddress("123 44th street", "", "Brooklyn", "NY", "11200");
		Person pObj1 = new Person("Mingming", "Jiang", "1234560000", pdobObj1, addObj1);

		ComputerOwner ownerObj = new ComputerOwner(pObj1);
		Computer comp1 = new Computer("Brand One", "CPU1", 16, 1300, false, 1770.34);
		Computer comp2 = new Computer("Brand Two", "CPU2", 16, 400, true, 1212.34);
		Computer comp3 = new Computer("Brand Three", "CPU3", 16, 2400, true, 5899.99);
		Computer comp4 = new Computer("Brand Four", "Intel", 8, 111, false, 811.99);

		ownerObj.addComputer(comp1);
		ownerObj.addComputer(comp2);
		ownerObj.addComputer(comp3);
		ownerObj.addComputer(comp4);

		System.out.println(ownerObj);

		ownerObj.removeComputer(0);// after removal: [comp2, comp3, comp4]
		ownerObj.removeComputer(2);// after removal: [comp2, comp3]

		System.out.println(ownerObj);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

			output.println(ownerObj);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}