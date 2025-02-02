import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> ratingsSelection = new ArrayList<Integer>();
        ratingsSelection.add(5);
        ratingsSelection.add(4);
        ratingsSelection.add(8);
        ratingsSelection.add(9);
        ratingsSelection.add(2);
        ratingsSelection.add(3);
        ratingsSelection.add(1);
        System.out.println("Selection Sort");
        System.out.println("Array:" + ratingsSelection);
        selectionSort(ratingsSelection);
        System.out.println(ratingsSelection);
        
        System.out.println("Insertion Sort");
        ArrayList<Integer> ratingsInsertion = new ArrayList<Integer>();
        ratingsInsertion.add(5);
        ratingsInsertion.add(4);
        ratingsInsertion.add(8);
        ratingsInsertion.add(9);
        ratingsInsertion.add(2);
        ratingsInsertion.add(3);
        ratingsInsertion.add(1);
        System.out.println("Array:" + ratingsInsertion);
        insertionSort(ratingsInsertion);
        System.out.println(ratingsInsertion);
    }

    private static void selectionSort(ArrayList<Integer> ratings) {
        int comparisons = 0;
        int swaps = 0;
        int n = ratings.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (ratings.get(j) < ratings.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = ratings.get(i);
                ratings.set(i, ratings.get(minIndex));
                ratings.set(minIndex, temp);
                swaps++;
            }

            System.out.println("Array:" + ratings);
            System.out.println("  found smallest value " + ratings.get(i));
            System.out.println("  at index " + minIndex);
            System.out.println("  swap with " + ratings.get(i) + " at index " + i);
        }

        System.out.println("Array:" + ratings);
        System.out.println("Made " + comparisons + " comparisons.");
        System.out.println("Data was changed " + swaps + " times.");
    }

    private static void insertionSort(ArrayList<Integer> ratings) {
        int comparisons = 0;
        int changes = 0;

        for (int i = 1; i < ratings.size(); i++) {
            int unsorted = ratings.get(i);
            int j = i - 1;

            while (j >= 0 && unsorted < ratings.get(j)) {
                comparisons++;
                ratings.set(j + 1, ratings.get(j));
                ratings.set(j, unsorted);
                j--;
                changes++;
            }

            System.out.println(" sorting " + unsorted);
            System.out.println("  Made " + comparisons + " comparisons.");
            System.out.println("  insert " + unsorted + " before " + ratings.get(j + 1) + " at index " + (j + 1));
        }

        System.out.println(ratings);
        System.out.println("Made " + comparisons + " comparisons.");
        System.out.println("Data was changed " + changes + " times.");
    }
}
