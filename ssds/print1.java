class window
{
    window(int make)
    {
        System.out.println("window(" + make +")"); 
    }
}
class house
{
        window w1=new window(1); 
        window w2=new window(2);
        window w3=new window(3);
        house()
        {
            System.out.println("house()");
        }
        
}
public class print1
{
    public static void main(String[] args)
    {
    house h=new house();
    
    }
}