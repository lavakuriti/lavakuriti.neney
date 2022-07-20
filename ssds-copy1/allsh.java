import static io.print.*;
class classd
{
    classd(int i)
    {
        print("first");
    }
}
class chessd extends classd
{
    chessd(int i)
    {
        super(1);
     print("second");
    }
}
class crickd extends chessd
{
    crickd(int i)
    {
        super(1);
        print("third");
    }
}
public class allsh extends crickd
{
    allsh()
    {
        super(1);
    }
    public static void main(String[] args)
    {
        allsh a=new allsh();
    }
}