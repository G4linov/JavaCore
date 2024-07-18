public class Epic extends Task{

    public Epic(String name) {
        super(name);
        createSubtasks();
    }

    public void createSubtasks(){
        new Subtask("some sub", this.getId());
    }
}
