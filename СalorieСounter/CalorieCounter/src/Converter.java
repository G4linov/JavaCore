public class Converter {
    private final int stepLength = 75;
    private final int calorieForStep = 50;

    public void printResultForMonth(int stepsActualSum, int indexMonth) {
        System.out.println("За месяц " + indexMonth + ". Вы прошли шагов: " + stepsActualSum +
                "\nВ метрах: " + (stepsActualSum/this.stepLength) +
                "\nИтого каллорий сожгли: " + ((stepsActualSum*this.calorieForStep)/1000));
    }
    public void printResultForYear(int stepsYearSum) {
        System.out.println("За год Вы прошли шагов: " + stepsYearSum +
                "\nВ метрах: " + (stepsYearSum/this.stepLength) +
                "\nИтого каллорий сожгли: " + ((stepsYearSum*this.calorieForStep)/1000));
    }

    public int monthResult(StepTracker stepTracker, int indexMonth){
        StepTracker.MonthData monthData = stepTracker.getMonth(indexMonth);
        int stepsActualSum = 0;
        for (int i = 0; i < 30; i++) {
            StepTracker.DayData day = monthData.getDay(i);
            stepsActualSum += day.getStepsActualAmount();
        }
        return stepsActualSum;
    }

    public int yearResult(StepTracker stepTracker){
        int stepsYearSum = 0;
        for (int i = 0; i < 12; i++) {
            stepsYearSum += monthResult(stepTracker, i);
        }
        return stepsYearSum;
    }
}
