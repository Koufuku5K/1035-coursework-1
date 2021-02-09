import java.util.Scanner;

public class ReportingIO {

    public static void main(String[] args) {
        System.out.println("""
                Do you want to report a crime?
                1 - Report a crime
                2 - Exit
                """);

        int choice;

        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        while (true) {
            if (choice == 1) {
                Incident.assign();
            }
            else if (choice == 2){
                System.out.println("Terminating program.");
                System.exit(1);
            }
            else {
                System.out.println("Please select 1 or 2.");
            }
        }
    }
}
