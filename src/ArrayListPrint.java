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
        String[] declaration = { "Declaration:", "String[]", "ArrayList<String>" };
        // TODO: What else?

        // TODO: What are the similarities?


        // Let's print them all out using the TablePrint class
        String[][] table = new String[][] { header, declaration };
        System.out.print(TablePrint.constructTableString(table, true));
    }
}
