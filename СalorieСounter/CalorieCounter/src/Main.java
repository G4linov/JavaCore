import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printMenu();
        int userInput = console.nextInt();

        while (userInput  != 0) {

            printMenu();
            userInput = console.nextInt();
        }
    }
    public static void printMenu(){
        System.out.println("0 — для выхода");

    }

    public static void printMenuMonth(){
        System.out.println("0 — для выхода в общее меню");
    }
}