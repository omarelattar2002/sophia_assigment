import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
    public static void main(String[] args){
        // Initialize task list
        ArrayList<String> tasks = new ArrayList<String>();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Omar's To-Do-List! ");

        while (running){
            // Display menu options
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. List tasks");
            System.out.println("4. Exit");

            // Get user input for choice
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    // Add a task
                    System.out.println("Enter your task ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task: " + task + " added successfully");
                    break;
                case 2:
                    // Remove a task
                    if(tasks.isEmpty()){
                        System.out.println("No tasks to remove");
                    }else{
                        System.out.println("Enter the number of the task you would like to remove please. ");
                        for(int i = 0; i < tasks.size(); i++){
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                        int taskIndex = scanner.nextInt();
                        if(taskIndex > 0 && taskIndex <= tasks.size()){
                            tasks.remove(taskIndex-1);
                            System.out.println("Task removed successfully");
                        }else{
                            System.out.println("Invalid task number");
                        }
                    }
                    break;
                case 3:
                    // List all tasks
                    if(tasks.isEmpty()){
                        System.out.println("No tasks to list");
                    } else{
                        System.out.println("Your tasks are: ");
                        for(int i = 0; i < tasks.size(); i++){
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    running = false;
                    break;
            }
        }
        // Close scanner
        scanner.close();
    }
}