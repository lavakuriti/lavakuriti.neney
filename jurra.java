import static io.print.*;
class small {}
final class Dinosaur
{
    int i=8;
    int j=1;
    small x=new small();
    void f(){}
}
public class jurra
{
    public static void main(String[] args)
    {
        Dinosaur n=new Dinosaur();
        n.f();
        print(n.i=50);
        print(n.j++);
        
    }
}
