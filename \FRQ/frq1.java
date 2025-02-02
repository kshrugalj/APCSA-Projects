import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class frq1 {
    public static void manipulate() {//frq 1
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("bear");
        animals.add("zebra");
        animals.add("bass");
        animals.add("cat");
        animals.add("koala");
        animals.add("baboon");
        
        int lastIndex = animals.size() - 1; // Get the index of the last element
        
        for (int k = lastIndex; k > 0; k--) { // Iterate over all elements
            if (animals.get(k).substring(0, 1).equals("b")) { // Check if the element starts with "b"
                animals.add(animals.size()-k, animals.remove(k)); // Add it to the beginning of the list
            }
        }
        System.out.println(animals);
    }

    public static void frq2()
    {
        ArrayList <String> students = new ArrayList<String>();

        students.add("Alex");
        students.add("Bob");
        students.add("Carl");

        for (int k = 0; k < students.size(); k++){
            System.out.println(students.set(k, "Alex") + " ");
        }

        System.out.println();

        for (String str: students){
            System.out.println(str + " ");
        }
    }

    public static void removeName(List<String> nameList, String nameToRemove) {
        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals(nameToRemove)) {
                iterator.remove();
            }
        }
    }

    public static void sort(String[] arr) {
        // Iterate over each pass of the sorting algorithm
        for (int pass = arr.length - 1; pass >= 1; pass--) {
            // Initialize the largest element and its index
            String largest = arr[0];
            int largestIndex = 0;
            
            // Find the largest element in the unsorted portion of the array
            for (int k = 0; k <= pass; k++) {
                // Compare the current element with the largest found so far
                if (arr[k].compareTo(largest) > 0) {
                    // Update the largest element and its index
                    largest = arr[k];
                    largestIndex = k;
                }
            }
            
            // Swap the largest element with the last element in the unsorted portion
            arr[largestIndex] = arr[pass];
            arr[pass] = largest;
        }
    }
    
}
