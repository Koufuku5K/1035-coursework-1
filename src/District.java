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

    public District(List<Incident> incidents, String name) {
        this.incidents = incidents;
        this.name = name;
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

    public boolean addIncident(Incident i) {
        return incidents.add(i);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void assignDistrict() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter District Name: ");
        String name = s.nextLine();

        District d = new District(name);

        List<Incident> incident = new ArrayList<>();

        for (int j = 0 ; j < 5; j++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter total value stolen: ");
            double value = Double.parseDouble(sc.nextLine());

            System.out.println("Enter postcode: ");
            String postcode = sc.nextLine();

            System.out.println("Enter month: ");
            String month = sc.nextLine();

            System.out.println("Enter year: ");
            String year = sc.nextLine();

            Incident i = new Incident(value, postcode, month, year);

            incident.add(i);

            System.out.println(incident);

        }

    }

    public Incident highestValue() {
        double lastValue = 0.0;
        Incident temp = null;
        for (Incident i : incidents) {
            if (i.getValue() > lastValue) {
                lastValue = i.getValue();
                temp = i;
            }
        }
        return temp;
    }

}
