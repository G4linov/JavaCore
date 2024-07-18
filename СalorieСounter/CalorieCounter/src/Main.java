import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner console = new Scanner(System.in);
        printMenu();
        int userInput = console.nextInt();

        while (userInput != 0) {

            printMenu();
            userInput = console.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Введите номер месяца: ");
                    int monthIndex = console.nextInt();

                    printMenuMonth();
                    int nextUserInput = console.nextInt();

                    while (nextUserInput != 0) {
                        switch (nextUserInput) {
                            case 1:
                                System.out.println("Введите день месяца: ");
                                int dayIndex = console.nextInt();
                                System.out.println("Введите цель по шагам: ");
                                int targetAmount = console.nextInt();
                                stepTracker.trackerService.editTargetAmount(monthIndex, dayIndex, targetAmount);
                                break;
                            case 2:
                                System.out.println("Введите день месяца: ");
                                dayIndex = console.nextInt();
                                System.out.println("Введите количество пройденных шагов: ");
                                int actualAmount = console.nextInt();
                                stepTracker.trackerService.editActualAmount(monthIndex, dayIndex, actualAmount);
                                break;
                            case 3:
                                System.out.println("Введите день месяца: ");
                                dayIndex = console.nextInt();
                                stepTracker.trackerService.getInfoDay(monthIndex, dayIndex);
                                break;
                            case 4:
                                stepTracker.trackerService.getInfoMonth(monthIndex);
                                break;
                            default:
                                System.out.println("Неизвестная команда.");
                        }
                        printMenuMonth();
                        nextUserInput = console.nextInt();
                    }
                    break;
                case 2:
                    printMenuMonth();
                    nextUserInput = console.nextInt();
                    while (nextUserInput != 0){
                        switch (nextUserInput){
                            case 1:
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("0 — для выхода");
        System.out.println("1 — меню месяца");
        System.out.println("2 — меню подсчета каллорий");
    }

    public static void printMenuMonth() {
        System.out.println("0 — для выхода в общее меню");
        System.out.println("1 — изменить цель по шагам для дня");
        System.out.println("2 — изменить количество пройденых шагов дня");
        System.out.println("3 — информация для дня");
        System.out.println("4 — информация для месяца");
    }

    public static void printMenuConverter() {
        System.out.println("0 — для выхода в общее меню");
        System.out.println("1 — ");
        System.out.println("2 — ");
        System.out.println("3 — ");
        System.out.println("4 — ");
    }
}