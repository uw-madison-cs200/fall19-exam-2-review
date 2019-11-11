import java.util.ArrayList;
/**
 * Multidimensional ArrayLists
 * How do these compare to mutlidimensional arrays?
 *
 * @author T.J. Wilder
 */
public class MultidimensionalArrayLists {

    public static void main(String[] args) {
        // How are these two different?
        int[][] intArray = new int[99][];
        ArrayList<ArrayList<Integer>> intArrayList = new ArrayList<ArrayList<Integer>>(99);

        System.out.println(intArray);
        System.out.println(intArrayList);
//        System.out.println(intArray[0]);
//         System.out.println(intArrayList.get(0));
    }
}
