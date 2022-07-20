import static io.print.*;
class cleaner
{
    String s="cleaner";
    public void append(String a)
    {
        s=s+a;
    }
    public void apply()
    {
        append("apply()");
    }
    public void dilute()
    {
        append("dilute()");
    }
    public void scrub()
    {
        append("scrub()");
    }
    public String toString()
    {
        return s;
    }
    public static void main(String[] args)
    {
        cleaner c=new cleaner();
        c.apply();
        c.dilute();
        c.scrub();
        print(c);
    }
    
}