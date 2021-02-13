import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Incident {

    private double value;
    private String postcode;
    private String month;
    private String year;

    public Incident(double value, String postcode, String month, String year) {
        this.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public static Incident inputIncident() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter total value stolen: ");
        double value = Double.parseDouble(sc.nextLine());

        System.out.println("Enter postcode: ");
        String postcode = sc.nextLine();

        System.out.println("Enter month: ");
        String month = sc.nextLine();

        System.out.println("Enter year: ");
        String year = sc.nextLine();

        return new Incident(value, postcode, month, year);
    }
}
