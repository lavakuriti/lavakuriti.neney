class book1
{
    boolean checed=false;
    book1(boolean check)
    {
        checed=check;
    }
    void checkin()
    {
        checed=false;
    }
    
protected void finalize() throws Throwable
{
    if(checed)
    System.out.print("error");
    super.finalize();
}
}
public class ter
{
    public static void main(String[] args)
    {
        book1 novel=new book1(true);
        novel.checkin();
        new book1(true);
        System.gc();
        
    }
}