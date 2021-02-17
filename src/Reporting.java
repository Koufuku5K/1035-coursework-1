import java.util.ArrayList;
import java.util.List;

/**
 * This class has methods that returns the statistics of both districts and incidents. It has both
 * districts and incidents stored in an arraylist as composition. The constructor initializes the
 * arraylists.
 *
 * @author William Moses
 *
 * @date 09/02/2021
 */
public class Reporting {

    private String name;
    private List<Incident> incidents;

    public Reporting(String name) {
        this.name = name;
        incidents = new ArrayList<>();
    }

    public Reporting(String name, List<Incident> incidents) {
        this.name = name;
        this.incidents = incidents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    @Override
    public String toString() {
        return "Reporting{" +
                "name='" + name + '\'' +
                ", incidents=" + incidents +
                '}';
    }

    /**
     * The purpose of this method is to show the districts and incidents list.
     */
    public static void runReporting() {
        List<Incident> incidents = new ArrayList<>();

        Incident i = new Incident(3000, "11456", "January", "2021");
        Incident i1 = new Incident(4000, "11458", "January", "2021");
        Incident i2 = new Incident(5000, "11459", "January", "2021");

        incidents.add(i);
        incidents.add(i1);
        incidents.add(i2);

        District d = new District("Kanto", incidents);

        List<Incident> incidents1 = new ArrayList<>();

        District d1 = new District("Sinnoh", incidents1);

        Incident i3 = new Incident(6000, "11560", "January", "2021");
        Incident i4 = new Incident(7000, "11561", "January", "2021");
        Incident i5 = new Incident(8000, "11562", "January", "2021");

        incidents1.add(i3);
        incidents1.add(i4);
        incidents1.add(i5);

        System.out.println(d);
        System.out.println(d.getIncidents());

        System.out.println(d1);
        System.out.println(d1.getIncidents());

    }

    /**
     * The purpose of this method is to calculate the average value of each district and compare their
     * values. It will then print out the district that has the higher average value.
     */
    public static void highestAverage() {
        double sum = 0.0;
        double sum1 = 0.0;
        double avg;
        double avg1;

        List<Incident> incidents = new ArrayList<>();

        Incident i = new Incident(3000, "11456", "January", "2021");
        Incident i1 = new Incident(4000, "11458", "January", "2021");
        Incident i2 = new Incident(5000, "11459", "January", "2021");

        incidents.add(i);
        incidents.add(i1);
        incidents.add(i2);

        District d = new District("Kanto", incidents);

        List<Incident> incidents1 = new ArrayList<>();

        District d1 = new District("Sinnoh", incidents1);

        Incident i3 = new Incident(6000, "11560", "January", "2021");
        Incident i4 = new Incident(7000, "11561", "January", "2021");
        Incident i5 = new Incident(8000, "11562", "January", "2021");

        incidents1.add(i3);
        incidents1.add(i4);
        incidents1.add(i5);

        for (Incident j : incidents) {
            sum += j.getValue();
        }
        avg = sum / incidents.size();

        for (Incident j : incidents1) {
            sum1 += j.getValue();
        }
        avg1 = sum1 / incidents1.size();

        if (avg > avg1) {
            System.out.println("\nThe district Kanto has the largest average value, which is: " +
                    avg);
        }
        else if (avg < avg1) {
            System.out.println("\nThe district Sinnoh has the largest average value, which is: " +
                    avg1);
        }
        else {
            System.out.println("\nBoth districts have the same average value.");
        }
    }

    /**
     * The purpose of this method is to return the incident with the highest value ever recorded.
     */
    public static void highestEver() {
        List<Incident> incidents = new ArrayList<>();

        Incident i = new Incident(3000, "11456", "January", "2021");
        Incident i1 = new Incident(4000, "11458", "January", "2021");
        Incident i2 = new Incident(5000, "11459", "January", "2021");
        Incident i3 = new Incident(6000, "11560", "January", "2021");
        Incident i4 = new Incident(7000, "11561", "January", "2021");
        Incident i5 = new Incident(8000, "11562", "January", "2021");

        incidents.add(i);
        incidents.add(i1);
        incidents.add(i2);
        incidents.add(i3);
        incidents.add(i4);
        incidents.add(i5);

        System.out.println("\nThe highest incident ever recorded is: ");
        System.out.println(i5);
    }

    /**
     * The purpose of this method is to return the incidents with values higher than the average values of all
     * incidents.
     */
    public static void greater() {
        List<Incident> incidents = new ArrayList<>();

        Incident i = new Incident(3000, "11456", "January", "2021");
        Incident i1 = new Incident(4000, "11458", "January", "2021");
        Incident i2 = new Incident(5000, "11459", "January", "2021");
        Incident i3 = new Incident(6000, "11560", "January", "2021");
        Incident i4 = new Incident(7000, "11561", "January", "2021");
        Incident i5 = new Incident(8000, "11562", "January", "2021");

        incidents.add(i);
        incidents.add(i1);
        incidents.add(i2);
        incidents.add(i3);
        incidents.add(i4);
        incidents.add(i5);

        System.out.println("\nThe value larger than 5500 (average of all incident values) is/are:");
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }

}