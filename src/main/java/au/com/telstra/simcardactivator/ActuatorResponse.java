package au.com.telstra.simcardactivator;

public class ActuatorResponse
{
    public boolean isActivated()
    {
        return isActivated;
    }

    public void setActivated(boolean activated)
    {
        isActivated = activated;
    }

    private boolean isActivated;

    public ActuatorResponse(boolean isActivated)
    {
        this.isActivated = isActivated;
    }
    
    public boolean isSuccess(){
        return this.isActivated;
    }
}
