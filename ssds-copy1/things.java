import static io.print.*;
class dplate
{
    dplate(int i)
    {
        print("dplate");   
    }
}
class plate extends dplate
{
    plate(int i)
    {
        super(1);
        print("plate");
    }
}
class steel
{
    steel(int i)
    {
        print("steel");
    }
}
class spoon extends steel
{
    spoon(int i)
    {
        super(1);
        print("spoon");
    }
}
class fork extends steel
{
    fork(int i)
    {
        super(1);
        print("fork");
    }
}
public class things
{
    private spoon sp;
    private fork fk;
    private plate pl;
    things(int i)
    {
      sp=new spoon(1);
      fk=new fork(1);
      pl=new plate(1);
    }
    public static void main(String[] args)
    {
        things x=new things(1);
    }
}
