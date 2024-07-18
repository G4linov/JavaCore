import java.util.HashMap;

public class StepTracker {
    private static HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();
    TrackerService trackerService = new TrackerService();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    public MonthData getMonth(int indexMonth) {
        return monthToData.get(indexMonth);
    }

    class MonthData {
        private static HashMap<Integer, DayData> dayToData = new HashMap<Integer, DayData>();

        public MonthData() {
            for (int i = 0; i < 30; i++) {
                dayToData.put(i, new DayData());
            }
        }

        public DayData getDay(int indexDay){
            return dayToData.get(indexDay);
        }
    }

    class DayData {
        private int stepsTargetAmount;
        private int stepsActualAmount;

        public DayData() {
            this.stepsTargetAmount = 10000;
            this.stepsActualAmount = 0;
        }

        public boolean setTargetAmount(int amount) {
            this.stepsTargetAmount = amount;
            return true;
        }

        public boolean setActualAmount(int amount) {
            this.stepsActualAmount = amount;
            return true;
        }

        public int getTargetAmount() {
            return this.stepsTargetAmount;
        }

        public int getStepsActualAmount() {
            return this.stepsActualAmount;
        }
    }


    class TrackerService {

        public void editTargetAmount(int indexMonth, int indexDay, int targetAmount) {
            DayData taskDay = getMonth(indexMonth-1).getDay(indexDay-1);
            taskDay.setTargetAmount(targetAmount);
            System.out.println("Обновление для дня "+ indexDay + ":\n" +
                    "  Цель дня: " + taskDay.getTargetAmount() + "\n" +
                    "  Фактически прошли: " +taskDay.getStepsActualAmount());
        }

        public void editActualAmount(int indexMonth, int indexDay, int actualAmount) {
            DayData taskDay = getMonth(indexMonth-1).getDay(indexDay-1);
            taskDay.setActualAmount(actualAmount);
            System.out.println("Обновление для дня "+ indexDay + ":\n" +
                    "  Цель дня: " + taskDay.getTargetAmount() + "\n" +
                    "  Фактически прошли: " +taskDay.getStepsActualAmount());
        }

        public void getInfoDay(int indexMonth, int indexDay) {
            DayData taskDay = getMonth(indexMonth-1).getDay(indexDay-1);
            System.out.println("День "+ indexDay + ":\n" +
                    "  Цель дня: " + taskDay.getTargetAmount() + "\n" +
                    "  Фактически прошли: " +taskDay.getStepsActualAmount());
        }

        public void getInfoMonth(int indexMonth){
            System.out.println("Месяц " + indexMonth + ":");
            for (int i = 1; i < 31; i++) {
                getInfoDay(indexMonth-1, i);
            }
        }
    }
}
