import java.util.HashMap;

public class StepTracker {
    private static HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    class MonthData{
        private int stepsTargetAmount;
        private int stepsActualAmount;

        public MonthData(){
            
        }
    }
}
