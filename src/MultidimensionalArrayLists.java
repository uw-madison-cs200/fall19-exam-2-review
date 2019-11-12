import java.util.ArrayList;
import java.util.Collections;
/**
 * Multidimensional ArrayLists
 * How do these compare to mutlidimensional arrays?
 *
 * @author T.J. Wilder
 */
public class MultidimensionalArrayLists {

    public static void main(String[] args) {
        // How are these three different?
    		int[][] intArray = new int[99][];
        ArrayList<ArrayList<Integer>> intArrayList = new ArrayList<ArrayList<Integer>>(99);
        ArrayList<int[]> intArrayList2 = new ArrayList<>(99);
        intArrayList.add(new ArrayList<Integer>(50));
        intArrayList.add(new ArrayList<Integer>(50));
        intArrayList2.add(new int[50]);
        intArrayList2.add(new int[] { 18 });

        System.out.println(intArray);
        System.out.println(intArrayList);
        System.out.println(intArrayList2);
        System.out.println();
        
        System.out.println(intArray[0]);
        System.out.println(intArrayList.get(0));
        System.out.println(intArrayList2.get(0));
        
        intArray[0] = intArrayList2.get(0);
        System.out.println(intArray[0]); // Now prints the same reference
    }
}
