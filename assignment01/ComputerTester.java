package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.

		Computer comb1 = new Computer("Brand One", "CPU1", 16, 1300, false, 1770.34);
		Computer comb2 = new Computer("Brand Two", "CPU2", 16, 400, true, 1212.34);
		Computer comb3 = new Computer("Brand Three", "CPU3", 16, 2400, true, 5899.99);
		Computer comb4 = new Computer("Brand Four", "Intel", 8, 111, false, 811.99);
		System.out.println(comb1);
		System.out.println(comb2);
		System.out.println(comb3);
		System.out.println(comb4);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		Computer comb12 = new Computer("Brand One", "CPU1", 16, 1300, false, 1770.34);
		Computer comb22 = new Computer("Brand Two", "CPU2", 16, 400, true, 1212.34);
		Computer comb32 = new Computer("Brand Three", "CPU3", 16, 2400, true, 5899.99);
		Computer comb42 = new Computer("Brand Four", "Intel", 8, 111, false, 811.99);
		output.println(comb12);
		output.println(comb22);
		output.println(comb32);
		output.println(comb42);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}