import static io.print.*;
class doubt
{
    String s="cleaner";
   public void show(String a)
    {
        s=s+a;
    }
    public String toString()
    {
        return s;
    }
    
    public static void main(String[] args)
    {
        doubt d=new doubt();
        d.show("ap[ply");
        print(d);
    }
}