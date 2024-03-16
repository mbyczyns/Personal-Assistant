import java.util.ArrayList;
import java.util.List;

public class User {
    private int userID;
    private String username;
    private List<Task> toDoList;

    public User(int userID, String username) {
        this.userID = userID;
        this.username = username;
        this.toDoList = new ArrayList<>();
    }

    public void addTask(Task task){
        toDoList.add(task);
    }

    public List<Task> getToDoList() {
        return toDoList;
    }


    public void getTasks(){
        int index = 1;
        for (Task task: getToDoList()) {
            Task thistask = toDoList.get(index - 1);
            System.out.println("Task " + index);
            System.out.println("Title: " + thistask.getTitle());
            System.out.println("Description: " + thistask.getDescription());
            System.out.println("Days left: " + thistask.getDaysLeft());
            System.out.println("Done: "+ thistask.getStatus());
            System.out.println("----------------------------");
            index++;
        }
    }

}
