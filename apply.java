class Processor
{
   public String name()
    {
        return getClass().getSimpleName();
    }
    Object process(Object input)
    {
        return input;
    }
}
class Upcase extends Processor
{
    String process(Object input)
    {
      return ((String)input).toUpperCase();  
    }
}
class Downcase extends Processor
{
    String process(Object input)
    {
        return ((String)input).toLowerCase();
    }
}
public class apply
{
    public static void process(Processor p,Object s)
    {
    System.out.println("Using processsor" + p.name());
    System.out.println(p.process(s));
    }
    public static String s="jywuedg wejydgwj dwejuyifdgw efdwiue";
   public static void main(String[] rgs)
   {
       Upcase u=new Upcase();
       Downcase l=new Downcase();
       process(u,s);
   }
}
