import java.util.Scanner;

/**
 * This class is an abstract representation of incidents that happened in a district.
 * It has value, postcode, month and year as fields and constructor initializes it.
 *
 * @author William Moses
 *
 * @date 9/02/2021
 */

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

    /**
     * The purpose of this method is to ask the user to input the information needed for the incidents.
     *
     * @return The incident inputted.
     */
    public static Incident inputIncident() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total value stolen: ");
        double value = Double.parseDouble(sc.nextLine());
        if (value < 0) {
            throw new IllegalArgumentException("Value must be positive");
        }

        System.out.println("Enter postcode: ");
        String postcode = sc.nextLine();

        System.out.println("Enter month: ");
        String month = sc.nextLine();

        System.out.println("Enter year: ");
        String year = sc.nextLine();

        return new Incident(value, postcode, month, year);
    }
}
