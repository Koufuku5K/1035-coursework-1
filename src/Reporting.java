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

}