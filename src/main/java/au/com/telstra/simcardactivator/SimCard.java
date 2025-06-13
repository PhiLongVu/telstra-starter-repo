package au.com.telstra.simcardactivator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimCard {

    private String iccid;

    @JsonProperty("customerEmail")
    private String email;

    public SimCard() {}  // Default constructor needed for JSON deserialization

    public SimCard(String iccid, String email) {
        this.iccid = iccid;
        this.email = email;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}