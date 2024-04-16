package core_java.online_voting_system;

public class political_parties 
{
    private String politicalpartiesname;
    private String politicalPartiesflag;

    public political_parties(String politicalpartiesname, String politicalPartiesflag)
    {
        this.politicalpartiesname = politicalpartiesname;
        this.politicalPartiesflag = politicalPartiesflag;
    }

    @Override
    public String toString() 
    {
        return "political_parties [politicalpartiesname=" + politicalpartiesname + ", politicalPartiesflag="
                + politicalPartiesflag + "]";
    }
    
    public void setparties_name(String politicalpartiesname)
    {
        this.politicalpartiesname = politicalpartiesname;
    }
    public String getparties_name()
    {
        return politicalpartiesname;
    }
    
    public void setparties_flag(String politicalPartiesflag)
    {
        this.politicalPartiesflag = politicalPartiesflag;
    }
    public String getparties_flag()
    {
        return politicalPartiesflag;
    }
}
