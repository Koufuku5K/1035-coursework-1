import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

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

    public List<Incident> getIncident() {
        return incidents;
    }

    public void setIncident(List<Incident> incidents) {
        this.incidents = incidents;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                '}';
    }

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

        System.out.println(d1.highestValue());

        System.out.println(d1.averageValue());

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
        District d = new District(name);
        System.out.println("\nThe average stolen value at " + d.getName() + " district is:");
        for (Incident i : incidents) {
            sum = i.getValue() + i.getValue();
            average = sum / 2;
            }
        return (int) average;
    }

}

