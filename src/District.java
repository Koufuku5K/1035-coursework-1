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

        District d = new District(name);

        Incident i = new Incident(4200, "414152", "January", "2021");
        Incident i1 = new Incident(4521, "687633", "February", "2021");
        Incident i2 = new Incident(2200, "876541", "January", "2021");
        Incident i3 = new Incident(3200, "675193", "February", "2021");

        d.addIncident(i);
        d.addIncident(i1);
        d.addIncident(i2);
        d.addIncident(i3);

        System.out.println("""
                -------------------
                Current crime list:
                -------------------""");
        System.out.println(d);
        System.out.println(d.getIncident());

        d.addIncident(Incident.inputIncident());

        System.out.println(d.highestValue());

        }

    public Incident highestValue() {
        double lastValue = 0.0;
        Incident temp = null;
        District d = new District(name);
        System.out.println("\nThe incident with the highest value stolen is:");
        System.out.println(d);
        for (Incident i : incidents) {
            if (i.getValue() > lastValue) {
                lastValue = i.getValue();
                temp = i;
            }
        }
        return temp;
    }
}

