import static io.print.*;
class i
{
    i()
    {
        print("i");
    }
}
class j extends i
{
    j()
    {
        print("j");
    }
}
class k extends j
{
    k()
    {
        print("k");
    }
}
public class all extends k
{
    public static void main(String[] args)
    {
        all show=new all();
        
    }
}
