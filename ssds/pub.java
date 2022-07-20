class priv
{
    void show()
    {
    System.out.print("use me");
    }
}
public class pub
{
    
    public static void main(String[] args)
    {
        priv p=new priv();
        p.show();
    }

}