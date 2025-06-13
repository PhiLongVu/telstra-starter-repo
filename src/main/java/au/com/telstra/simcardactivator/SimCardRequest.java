package au.com.telstra.simcardactivator;

public class SimCardRequest {
    public String getIccid()
    {
        return iccid;
    }

    public void setIccid(String iccid)
    {
        this.iccid = iccid;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    private String iccid;
    private String customerEmail;

    public SimCardRequest(){};

    public SimCardRequest(String iccid, String customerEmail)
    {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
    }
}
