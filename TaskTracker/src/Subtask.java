public class Subtask extends Task{
    private final int epicId;

    public Subtask(String name, int epicId) {
        super(name);
        this.epicId = epicId;
    }

    public int getEpicId(){
        return this.epicId;
    }
}
