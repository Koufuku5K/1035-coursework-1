import java.util.ArrayList;
import java.util.List;

public class Reporting {
    private List<District> districts;
    private List<Incident> incidents;

    public Reporting() {
        districts = new ArrayList<>();
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Reporting{" +
                "districts=" + districts +
                '}';
    }

}
