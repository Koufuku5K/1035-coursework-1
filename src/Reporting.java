import java.util.ArrayList;
import java.util.Scanner;
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

    private List<District> districts;
    private List<Incident> incidents;

    public Reporting(List<District> districts) {
        this.districts = districts;
        incidents = new ArrayList<>();
    }

    public Reporting(List<District> districts, List<Incident> incidents) {
        this.districts = districts;
        this.incidents = incidents;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
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
                "districts=" + districts +
                ", incidents=" + incidents +
                '}';
    }

    public boolean addIncident(Incident i) {
        return incidents.add(i);
    }

    public static void runReporting() {

        List<District> districts = new ArrayList<>();

        List<Incident> incidents = new ArrayList<>();

        Reporting r = new Reporting(districts, incidents);

        System.out.println(r.getDistricts());
    }
}

    /* public static void assignDistrict() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter District Name: ");
        String name = s.nextLine();

        List<Incident> incidents = new ArrayList<>();

        District d = new District(name, incidents);

        for (int j = 0; j < 2; j++) {

            d.addIncident(Incident.inputIncident());

        }

        System.out.println("Enter District Name: ");
        String name1 = s.nextLine();

        District d1 = new District(name1);

        for (int j = 0; j < 2; j++) {

            d1.addIncident(Incident.inputIncident());

        }

        System.out.println(d.highestValue());

        System.out.println(d.averageValue());

        d.greaterThan();

        System.out.println(d1.highestValue());

        System.out.println(d1.averageValue());

        d1.greaterThan();

    }

    public Incident highestValue() {
        double lastValue = 0.0;
        Incident temp = null;
        District d = new District(name);
        System.out.println("\nThe incident with the highest value stolen at " + d.getName() +
                " district is:");
        for (Incident i : incidents) {
            if (i.getValue() > lastValue) {
                lastValue = i.getValue();
                temp = i;
            }
        }
        return temp;
    }

    public int averageValue() {
        double sum = 0.0;
        double average = 0.0;
        System.out.println("\nEnter the year to find the average value:");
        Scanner s = new Scanner(System.in);
        String year = s.nextLine();
        District d = new District(name);
        System.out.println("\nThe average stolen value at " + d.getName() + " district is:");
        for (Incident i : incidents) {
            if (i.getYear().equals(year)) {
                sum += i.getValue();
                average = sum / incidents.size();
            }
        }
        return (int) average;
    }

    public void greaterThan() {
        System.out.println("Enter a value to find the incident(s) with greater value:");
        Scanner s = new Scanner(System.in);
        double value = s.nextDouble();
        System.out.println("The value larger than " + value + " is:");
        for (Incident i : incidents) {
            if (i.getValue() > value) {
                System.out.println(i.getValue());
            }
            else {
                System.out.println("None");
            }
        }
    }
} */



/* import java.util.ArrayList;
import java.util.List;

public class Reporting {
    private List<District> districts;
    private List<Incident> incidents;

    public Reporting() {
        districts = new ArrayList<>();
        incidents = new ArrayList<>();
    }

    public Reporting(List<District> districts, List<Incident> incidents) {
        this.districts = districts;
        this.incidents = incidents;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
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
                "districts=" + districts +
                '}';
    }

    /* public static void runReporting() {

        List<Incident> incidents = new ArrayList<>();
        List<District> name = new ArrayList<>();

        District d = new District(name, incidents);

    } */

    /* List<District> d = new ArrayList<>();

    public void print() {
        for (District d : districts) {
            System.out.println(d.getName());
        }
    }

    public Incident highestEver() {
        double lastValue = 0.0;
        Incident temp = null;
        System.out.println("\nThe incident with the highest value ever recorded is:");
        for (District d : districts) {
            d.getName();
        }
            for (Incident i : incidents) {
                if (i.getValue() > lastValue) {
                    lastValue = i.getValue();
                    temp = i;
                }
            }
        return temp;
        }
    } */

