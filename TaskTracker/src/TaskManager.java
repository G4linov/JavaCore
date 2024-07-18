import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private HashMap<Integer, Task> taskList = new HashMap<>();

    public ArrayList getAllTasks(){
        ArrayList<Task> allTasks = new ArrayList<>();
        for(Task item : taskList.values()){
            allTasks.add(item);
        }
        return allTasks;
    }

    public void clearAllTasks(){
        taskList.clear();
    }

    public Task getTaskById(int id){
        Task task = taskList.get(id);
        return task;
    }

    public void setNewTask(Task task){
        taskList.put(task.getId(), task);
    }

    public void updateTask(int id, Task task){
        taskList.replace(id, task);
    }

    public void removeById(int id){
        taskList.remove(id);
    }

    public ArrayList getAllTasksEpic(int id){
        ArrayList<Task> allTasksEpic = new ArrayList<>();
        for (Task item : taskList.values()){
            if (item instanceof Subtask){
                if (((Subtask) item).getEpicId() == id) {
                    allTasksEpic.add(item);
                }
            }
        }
        return allTasksEpic;
    }
}
