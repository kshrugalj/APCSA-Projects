import java.util.Arrays;

public class apcsaw22fri {
    public static void main(String[] args) {
        // Declare and initialize an integer array containing the numbers 0 - 10
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Copy and paste the array found above Step 1 in PLTW 3.6.3. (“newEngland”)
        String[] states = new String[]{"Maine", "New Hampshire", "Vermont", "Massachusetts", "Connecticut", "Rhode Island"};

        // Copy the CatCollection2 from Step 5 in PLTW 3.6.3 and create a separate Cat class
        // Assuming the Cat class looks like this:
        // class Cat {
        //     String name;
        //     // Other Cat properties and methods
        // }

        // Create an array of Cat objects
        Cat[] cats = new Cat[]{new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};

        // Use an enhanced for loop to output the elements in the numbers array on one line
        System.out.println("Use an enhanced loop to output an int array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Use an enhanced for loop to output the elements in the “States” array on separate lines
        System.out.println("Use an enhanced loop to output a string array:");
        for (String state : states) {
            System.out.println(state);
        }
        System.out.println("\n");

        // Use an enhanced for loop to output the elements in the “Cats” array on separate lines
        System.out.println("Use an enhanced loop to output an object array:");
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
        System.out.println("\n");

        // Use an enhanced for loop to replace all of the even numbers in the numbers array with 0 and output the results
        System.out.println("Replace even numbers with 0:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("This is the new array: " + Arrays.toString(numbers) + "\n");

        // Use an enhanced for loop to output the two-word states in the states array and output the results
        System.out.println("These are the two-word states:");
        for (String state : states) {
            if (state.split(" ").length == 2) {
                System.out.println(state);
            }
        }
        System.out.println("\n");

        // Use an enhanced for loop to change the name of one of the elements in the Cat array
        System.out.println("Change the objects in an array:");
        for (Cat cat : cats) {
            if (cat.getName().equals("Boots")) {
                cat.setName("Fang");
            }
        }
        System.out.println("This is the new array: " + Arrays.toString(cats));
    }
}
