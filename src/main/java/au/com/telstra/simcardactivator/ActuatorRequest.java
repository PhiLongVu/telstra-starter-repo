package au.com.telstra.simcardactivator;

public class ActuatorRequest
{
    public String getIccid()
    {
        return iccid;
    }

    public void setIccid(String iccid)
    {
        this.iccid = iccid;
    }

    private String iccid;

    public ActuatorRequest(String iccid)
    {
        this.iccid = iccid;
    }
}
