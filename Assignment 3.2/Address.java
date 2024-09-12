import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String apptDetails;
    private String district;
    private String state;
    private String country;

 
    public Address(String apptDetails, String district, String state, String country) {
        this.apptDetails = apptDetails;
        this.district = district;
        this.state = state;
        this.country = country;
    }

    
    public String getApptDetails() {
        return apptDetails;
    }

    public void setApptDetails(String apptDetails) {
        this.apptDetails = apptDetails;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [apptDetails=" + apptDetails + ", district=" + district + ", state=" + state + ", country=" + country + "]";
    }
}
