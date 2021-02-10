import java.util.Scanner;

public class ReportingIO {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        System.out.println("""
                Do you want to report a crime?
                1 - Report a crime
                2 - Exit
                """);
        getInput();
    }

    public static void getInput() {

        int choice = -1;
        int min = 1;
        int max = 2;

        while (choice < min || choice > max) {
            System.out.println("Enter 1 or 2: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            if (choice == 1) {
                Incident.assign();
            } else if (choice == 2) {
                System.out.println("Terminating program.");
                System.exit(1);
            } else {
                System.out.println("Input " + choice + " is invalid. Please enter 1 or 2.");
            }
        }
    }
}


