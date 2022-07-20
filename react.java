import static io.print.*;
class action
{
   public int show(int a,int b)
    {
        return a+b;
    }
}
public class react extends action
{
    public static void main(String[] args)
    {
        react n=new react();
        print(n.show(5,4));
    }
}
