class grain
{
    public String toString()
    {
        return "grain";
    }
}
class wheat extends grain
{
    public String toString()
    {
        return "wheat";
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
public class convariant
{
    public static void main(String[] args)
    {
        mill m=new mill();
        grain g=new grain();
        System.out.println(g);
        m=new wheatmill();
        g=m.process();
        System.out.print(g);
    }
}