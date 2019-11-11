import java.util.ArrayList;

/**
 * - Differences between Arrays and ArrayLists
 * - Changing in a method
 * - Multi-dimensional ArrayLists / Arrays of ArrayLists / ArrayLists of Arrays
 * - Drawing on board
 *
 * @author T.J. Wilder
 *
 */
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // What is the equivalent array?

        // Why does this not work?
        // ArrayList<int> primitives = new ArrayList<int>();


        /* Adding and removing
        nums.add(5); // This isn't an Integer!! What's going on??
        nums.add(new Integer(6));

        nums.remove(0); // What does this remove?
        /**/

        /* eachToString method
        nums.add(5);
        nums.add(new Integer(6));
        nums.add(5);

        ArrayList<String> stringVersion = eachToString(nums);
        System.out.println(stringVersion);

        // Will this effect the stringVersion?
        nums.add(17);
        // System.out.println(stringVersion);
        /**/

        //* removeDuplicates method
        nums.add(5);
        nums.add(new Integer(6));
        nums.add(5);

        // Does this work?
        ArrayList<Integer> noDupes = removeDuplicates(nums);
        System.out.println(nums);
        System.out.println(noDupes);

        // Will this effect the noDupes version?
        nums.add(17);
        nums.add(17);

        removeDuplicatesInPlace(nums);
        /**/
    }


    public static ArrayList<String> eachToString(ArrayList<Integer> numList) {
        // Why numList.size() here? Does it work without it?
        ArrayList<String> stringList = new ArrayList<String>(numList.size());

        // How does this loop effect the order of the elements in the two
        // ArrayLists?
        for (Integer element : numList) {
            stringList.add(element.toString());
        }

        return stringList;
    }

    /**
     * Returns a new ArrayList without any duplicate elements
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numList) {
        // Should I use numList.size() here?
        ArrayList<Integer> noDupes = new ArrayList<Integer>(numList.size());

        for (Integer element : numList) {
            boolean found = false;
            // Check if we found the element
            for (int i = 0; i < noDupes.size(); i++) {
                if (element == noDupes.get(i))
                    found = true;
            }

            // If we didn't find it, add it since it's not a dupe
            if (!found)
                noDupes.add(element);
        }
        return noDupes;
    }

    /**
     * Removes duplicates in-place in the given arrayList
     */
    public static void removeDuplicatesInPlace(ArrayList<Integer> numList) {
        return;
    }

}
