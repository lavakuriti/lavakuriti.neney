import static io.print.*;
class a
{
    a()
    {
        print("draw");
    }
}
public class b extends a
{
    b()
    {
        print("paint");
    }
    public static void main(String[] args)
    {
        b show=new b();
    }
}