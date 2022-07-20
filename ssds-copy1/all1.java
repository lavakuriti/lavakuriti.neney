import static io.print.*;
class comb
{
    public void chess(int i)
    {
        print("chess");
    }
}
class comb1 extends comb
{
    public void cricket(int i)
    {
        print("cricket");
    }
}
class comb3 extends comb1
{
    public void hockey(int i)
    {
        print("hockey");
    }
}
public class all1
{
    public static void main(String[] args)
    {
    comb3 c=new comb3();
    c.chess(1);
    c.cricket(1);
    c.hockey(1);
}
}