import static io.print.*;
class grain
{
    public String toString()
    {
        return "Grain";
    }
}
class wheat extends grain
{
    public String toString()
    {
        return "Wheat";
    }
}
class mill
{
    grain process()
    {
        return new grain();
    }
}
class wheatmill extends mill
{
    wheat process()
    {
        return new wheat();
    }
}
public class foodchain
{
    public static void main(String[] args)
    {
        mill m=new mill();
        grain g=m.process();
        print(g);
        m=new wheatmill();
        g=m.process();
        print(g);
    }
}