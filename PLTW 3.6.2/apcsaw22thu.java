public class apcsaw22thu {

    public static void goalFinder() {
        int[] goalsArray = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 3, 2, 2};
        int noGoalsCounter = 0;

        for (int i = 0; i < goalsArray.length; i++) {
            int goals = goalsArray[i];

            if (goals == 0) {
                System.out.println("The previous game had no goals :(  There have been " + (++noGoalsCounter) + " game(s) with no goals.");
            } else {
                System.out.println("Goooooooooooal, there were " + goals + " goal(s) scored in the previous game.");
            }

            if (i == goalsArray.length - 1 && goals > 0) {
                System.out.println("Goooooooooooal, there were " + goals + " goals scored in the final game!");
            }
        }
    }

    public static void goalCounter() {
        int[] goalsArray = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 3, 2, 2};
        int totalGoals = 0;

        for (int goals : goalsArray) {
            totalGoals += goals;
        }

        System.out.println("The total number of goals scored was: " + totalGoals + ".");
    }

    public static void letterReverse() {
        String[] lettersArray = {"a", "b", "c", "d", "e", "f"};

        System.out.print("Look at this, I'm going to output this array in reverse order! ");
        for (int i = lettersArray.length - 1; i >= 0; i--) {
            System.out.print(lettersArray[i].toUpperCase() + " ");
        }
        System.out.println();
    }

    public static void everyOther() {
        String[] lettersArray = {"a", "b", "c", "d", "e", "f"};
    
        System.out.print("Allow me to showcase my coding genius by outputting every other letter! ");
        for (int i = 0; i < lettersArray.length; i += 2) {
            System.out.print(lettersArray[i].toUpperCase() + " ");
        }
        System.out.print("versus ");
        for (int i = 1; i < lettersArray.length; i += 2) {
            System.out.print(lettersArray[i].toUpperCase() + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        goalFinder();
        goalCounter();
        letterReverse();
        everyOther();
    }
}
