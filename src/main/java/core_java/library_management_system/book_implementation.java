package core_java.library_management_system;

public interface book_implementation 
{
    public book addnew_book(book bookdetails);

    public int upgrade_bookquantity(String bookname);

    public void search_bybookname(String book_name);
 
    public void showall_bookdetails();

    public void deletebybook_userspecifications();
} 