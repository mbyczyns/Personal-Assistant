public class Task {
    private String title;
    private int daysLeft;
    private String description;
    private boolean status;

    public Task(String title, int daysLeft, String description) {
        this.title = title;
        this.daysLeft = daysLeft;
        this.description = description;
        this.status = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDaysLeft() {
        if (daysLeft>0) return daysLeft;
        else return 0;
    }
    public String getStatus(){
        if (daysLeft>0) {
            if (status == true) {
                return "DONE";
            } else return "IN PROGRESS";
        }
        else return "TIME OVER";
    }

    public void decreaseDaysLeft(){
        this.daysLeft-=1;
    }

    public void taskDone(){
        this.status = true;
        System.out.println("Congratulations!");
    }
}
