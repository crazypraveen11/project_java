package core_java.online_voting_system;

public interface political_parties_implementation 
{
    public political_parties addnew_Parties(political_parties partiesdetails);

    public int update_parties(String Partiesname);

    public void find_partiesname(String Partiesname);

    public void listall_parties();
    
}
