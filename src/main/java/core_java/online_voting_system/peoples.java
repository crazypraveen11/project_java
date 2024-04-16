package core_java.online_voting_system;

public class peoples 
{
    private int peoples_voterid;
    private String peoples_name;

    public  peoples(int peoples_voterid, String peoples_name)
    {
        this.peoples_voterid = peoples_voterid;
        this.peoples_name = peoples_name;
    }

    @Override
    public String toString() {
        return "peoples [peoples_voterid=" + peoples_voterid + "]";
    }
    
    public void setpeoples_voterid(int peoples_voterid)
    {
        this.peoples_voterid = peoples_voterid;
    }
    public int getpeoples_voterid()
    {
        return peoples_voterid;
    }

    public void setpeoples_name(String peoples_name)
    {
        this.peoples_name = peoples_name;
    }
    public String getpeoples_name()
    {
        return peoples_name;
    }
}