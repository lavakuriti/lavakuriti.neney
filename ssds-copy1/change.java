import static io.print.*;
class inher
{
   private String s="cleaner";
    public void append(String a)
    {
        s=s+a;
    }
    public void apply()
    {
        append("apply()");
    }
  public  void scrub()
    {
        append("scrub()");
        
    }
    public String toString()
    {
        return s;
    }
    public static void main(String[] args)
    {
        inher i=new inher();
        i.apply();i.scrub();
        print(i);
    }
}
public class change extends inher
{
    public static void main(String[] args)
    {
        change i=new change();
        i.append("apply()");
        i.append("soapscrrub()");
        print(i);
        print("testing");
        inher.main(args);       
}
}