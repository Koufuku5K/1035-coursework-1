import java.util.Scanner;

/**
 * This class is the main method of the program. It runs the methods from other classes.
 *
 * @author William Moses
 *
 * @date 09/02/2021
 */

public class ReportingIO {

    public static void main(String[] args) {

        new ReportingIO().menu();

    }

    private void menu() {

        int choice = 0;
        boolean flag = true;

        Scanner s = new Scanner(System.in);

        while (flag) {

            System.out.println("""
                ------------------------------
                Do you want to report a crime?
                ------------------------------
                1 - Report a crime
                2 - View statistics
                3 - Exit
                """);

            do {
                while (!s.hasNextInt()) {
                    System.out.println("Please input a number.");
                    s.next();
                }
                choice = s.nextInt();
                if (choice < 0) {
                    throw new IllegalArgumentException("Value must be positive");
                }
            }
            while (choice < 0);

            switch (choice) {
                case 1:
                    District.assignDistrict();
                    break;
                case 2:
                    Reporting.runReporting();
                    Reporting.highestAverage();
                    Reporting.highestEver();
                    Reporting.greater();
                    continue;
                case 3:
                    System.out.println("Quitting program.");
                    flag = false;
                    break;
                default:
                    System.out.println("Input " + choice + " is invalid. Please enter 1 or 2.");

            }
        }
    }
}