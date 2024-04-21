package core_java.online_voting_system;

public interface peoples_implementation 
{
    public peoples addnew_peoples(peoples members);

    public void listall_peoples();

    // public String update_peoples(String people_name);
    public void update_peoples();

    public void delete_peoples();

    public void search_people(String people_name);
    
}
