import java.util.ArrayList;

public class Task {
    private static int incrementId = 0;
    private final int id;
    private final String name;
    private final ArrayList<String> steps = new ArrayList<>();
    private int status;

    public Task(String name){
        this.id = incrementId;
        this.name = name;
        this.status = 0;
        incrementId++;
        fillSteps();
    }

    public int getId(){
        return this.id;
    }

    public void fillSteps(){
        steps.add("Step 1");// input
        steps.add("Step 2");// input
        steps.add("Step 3");// input
    }
}
