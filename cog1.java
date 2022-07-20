import static io.print.*;
class cog
{
    String s="boil";
    public String toString()
    {
        return s;
    }
}
public class cog1
{
    int i;
    cog c=new cog();
    public String toString()
    {
        return "i =" + i + c;
    }
    public static void main(String[] args)
    {
        cog1 d=new cog1();
        print(d);
    }
}