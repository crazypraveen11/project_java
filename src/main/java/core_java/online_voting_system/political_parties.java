package core_java.online_voting_system;

public class political_parties 
{
    private String political_parties_name;
    private String political_parties_flag;

    @Override
    public String toString() {
        return "\t <<<<  Political Parties Details >>>> \n Political Parties Name = " + political_parties_name + "\n Political Parties Flag Name = "
                + political_parties_flag + " ";
    }

    public political_parties(String political_parties_name, String political_parties_flag)
    {
        this.political_parties_name = political_parties_name;
        this.political_parties_flag = political_parties_flag;
    }

    public String getPolitical_parties_name() 
    {
        return political_parties_name;
    }
    public void setPolitical_parties_name(String political_parties) 
    {
        this.political_parties_name = political_parties;
    }

    public String getPolitical_parties_flag() 
    {
        return political_parties_flag;
    }
    public void setPolitical_parties_flag(String political_parties_flag) 
    {
        this.political_parties_flag = political_parties_flag;
    }

}