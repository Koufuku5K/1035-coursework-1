import java.util.Scanner;

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
                Do you want to report a crime?
                1 - Report a crime
                2 - Exit
                """);

            do {
                while (!s.hasNextInt()) {
                    System.out.println("Please input a number.");
                    s.next();
                }
                choice = s.nextInt();
            }
            while (choice < 0);

            switch (choice) {
                case 1:
                    District.assignDistrict();
                    break;
                case 2:
                    System.out.println("Quitting program.");
                    flag = false;
                    break;
                default:
                    System.out.println("Input " + choice + " is invalid. Please enter 1 or 2.");


            }
        }
    }
}