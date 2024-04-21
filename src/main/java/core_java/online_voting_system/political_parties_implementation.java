package core_java.online_voting_system;

public interface political_parties_implementation 
{
    public political_parties addnew_parties(political_parties team);
    
    // public String update_parties(String party_name );
    public void update_parties();

    public void listall_parties();

    public void delete_parties();

    public void search_parties(String party_name);
}
