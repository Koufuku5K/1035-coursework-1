import java.util.Scanner;

public class Incident {

    double value;
    String postcode;
    String month;
    String year;

    public Incident(double value, String postcode, String month, String year) {
        this.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "value=" + value +
                ", postcode='" + postcode + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public static void assign() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter total value stolen: ");
        double value = Double.parseDouble(s.nextLine());

        System.out.println("Enter postcode: ");
        String postcode = s.nextLine();

        System.out.println("Enter month: ");
        String month = s.nextLine();

        System.out.println("Enter year: ");
        String year = s.nextLine();

        Incident i = new Incident(value, postcode, month, year);
        System.out.println(i);
    }
}
