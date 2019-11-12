import java.util.Arrays;
import java.util.ArrayList;

/**
 * What are the similarities and differences between Arrays and ArrayLists?
 *
 * This requires the TablePrint class to be included from ZyBooks 8.3
 *
 * @author T.J. Wilder
 */
public class ArrayListPrint {
	public static void main(String[] args) {
		String[] separator = { "---", "---", "---" };

		// What are the differences between arrays and ArrayLists?
		String[] header = { "", "Array", "ArrayList" };
		String[] declaration = { "Declaration:", "String[]",
				"ArrayList<String>" };
		String[] size = { "Size:", "constant", "dynamic" };
		String[] types = { "Types:", "Allows primitives",
				"Only reference types" };
		String[] printing = { "Printing:", "\"Hard\"", "Easy" };
		String[] comparing = { "Comparing:", "Arrays.equals(a1, a2)",
				"al.equals(otherAl)" };
		String[] imports = { "Import:", "nothing / java.util.Arrays",
				"java.util.ArrayList" };
		String[] changing = { "Changing:", "Set elements, new arrays",
				"add/remove/set/new ArrayList" };
		
		// Extras after Exam Review
		String[] getSize = { "Size:", "a.length", "al.size()" };
		String[] capacity = { "Capacity:", "capacity == size", "capacity >= size" };

		// What are the similarities?
		String[] enhancedFor = { "Enhanced for:", "Can do!", "Can do!" };
		String[] iterate = { "Can you iterate?", "yes", "yes" };

		// Let's print them all out using the TablePrint class
		String[][] table = new String[][] { header, declaration, size, types,
				comparing, imports, changing, getSize, capacity,
				separator, enhancedFor, iterate };
		System.out.print(TablePrint.constructTableString(table, true));
	}
}
