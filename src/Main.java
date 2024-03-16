import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void skipDay(List<User> userList){
        for (User user:userList){
            for (Task task:user.getToDoList()){
                task.decreaseDaysLeft();
            }
        }
    }

    public static void newTask(Scanner scanner, User user){
        System.out.println("What is the title of your task?");
        String title =  scanner.nextLine();
        System.out.println("Describe your task:");
        String description = scanner.nextLine();
        System.out.println("How many days have you got?");
        int time = scanner.nextInt();
        user.addTask(new Task(title, time, description));
    }
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome "+name);
        User user1 = new User(1, name);
        while(true){
            System.out.println("Choose your action: ");
            System.out.println("1 - List your tasks");
            System.out.println("2 - Add a task to your list");
            System.out.println("3 - Mark a task as finished");
            System.out.println("4 - Next day");
            System.out.println("5 - Exit program");
            int choice = scanner.nextInt();
            if (choice ==1) user1.getTasks();
            else if (choice ==2) newTask(scanner,user1);
            else if (choice ==3) {
                System.out.println("Which task do you want to mark as done?");
                int finishedTask = scanner.nextInt();
                user1.taskDone(finishedTask);
            }
            else if (choice==4){
                skipDay(userList);
            }
            else{
                System.out.println("Exiting...");
                break;
            }
        }

    }
}
