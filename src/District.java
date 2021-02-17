import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * This class is an abstract representation of a district that takes incidents as composition.
 * The incidents are stored in arraylist. The constructor initializes the new arraylist and the
 * district's name.
 *
 * @author William Moses
 *
 * @date 09/02/2021
 */

public class District {

    private String name;
    private List<Incident> incidents;

    public District(String name) {
        this.name = name;
        incidents = new ArrayList<>();
    }

    public District(String name, List<Incident> incidents) {
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
        return "District{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * The purpose of this method is to add incidents to the arraylist in the district class.
     * @param i is the incident to be added to the district class.
     * @return boolean to see if it has been added.
     */
    public boolean addIncident(Incident i) {
        return incidents.add(i);
    }

    public static void assignDistrict() {

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

    /**
     * This purpose of this method is to return an incident that has the highest value in the district.
     *
     * @return Incident with the highest value.
     */
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

    /**
     * The purpose of this method is to return the average value stolen in a district.
     *
     * @return Integer of the average value in a district.
     */
    public int averageValue() {
        double sum = 0.0;
        double average = 0.0;
        System.out.println("\nEnter the year to find the average value of incidents in that year:");
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

    /**
     * The purpose of this method is to compare the value in a district with user input. If the
     * value of an incident is larger than the user input, then it will be printed out. If not, then
     * "None" will be printed out.
     */
    public void greaterThan() {
        System.out.println("Enter a value to find the incident(s) with greater value:");
        Scanner s = new Scanner(System.in);
        double value = s.nextDouble();
        System.out.println("The value larger than " + value + " is:");
        for (Incident i : incidents) {
            if (i.getValue() > value) {
                System.out.println(i.getValue());
            }
        }
    }
}

