import static io.print.*;
class items
{
    public void apply(String s){print(s);}
    public void scrub(String s){print(s);}
    public void wash(String s){print(s);}
}
public class delergent
{
    public void foam(String s)
    {
        print(s);
    }
    public void smelladd(String s)
    {
        print(s);
    }
    items i=new items();
    public void apply(String s)
    {
        i.apply(s);
    }
    void scrub(String s)
    {
        i.scrub(s);
    }
    void wash(String s)
    {
        i.wash(s);
    }
    public static void main(String[] args)
    {
        
        delergent dele=new delergent();
        dele.apply("apply()");
        dele.scrub("scrub()");
        dele.wash("wash()");
        dele.foam("foam");
        dele.smelladd("confort smell");
    }
    
}