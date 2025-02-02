import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {

    private void modifyList() {
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>();
        boolean onQuestionOne = true;
        while (onQuestionOne) {
            System.out.println(taskList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, or (q)uit?");
            String firstCommand = userInput.nextLine();
            if (firstCommand.equals("a")) {
                System.out.println("Enter a task to add:");
                String task = userInput.nextLine();
                taskList.add(task);
            } else if (firstCommand.equals("i")) {
                System.out.println("Enter an index to insert the task at:");
                int index = userInput.nextInt();
                userInput.nextLine(); // Consume the newline
                System.out.println("Enter a task to insert:");
                String task = userInput.nextLine();
                if (index >= 0 && index <= taskList.size()) {
                    taskList.add(index, task);
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (firstCommand.equals("r")) {
                System.out.println("Enter an index to remove the task from:");
                int index = userInput.nextInt();
                userInput.nextLine(); // Consume the newline
                if (index >= 0 && index < taskList.size()) {
                    taskList.remove(index);
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (firstCommand.equals("p")) {
                System.out.println("Enter an index to replace the task at:");
                int index = userInput.nextInt();
                userInput.nextLine(); // Consume the newline
                System.out.println("Enter a new task:");
                String task = userInput.nextLine();
                if (index >= 0 && index < taskList.size()) {
                    taskList.set(index, task);
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (firstCommand.equals("q")) {
                onQuestionOne = false;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        userInput.close();
    }

    public static void main(String[] args) {
        new TaskList().modifyList();
    }
}