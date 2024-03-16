import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void skipDay(List<User> userList){
        for (User user:userList){
            for (Task task:user.getToDoList()){
                task.decreaseDaysLeft();
            }
        }

    }
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1,"marcin");
        userList.add(user1);
        User user2 = new User(2,"tomek");
        userList.add(user2);
        user1.addTask(new Task("Poscielic lozko", 1, "posciel lozko ty debilu po starzy przyjada"));
        user1.addTask(new Task("umyc naczynia", 3,"tak tak tak"));
        user1.getTasks();
        skipDay(userList);
        skipDay(userList);
        user1.getTasks();

    }
}
