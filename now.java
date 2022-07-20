import static io.print.*;
class hide
{
    char doh(char c)
    {
        print("char");
        return 'c';
    }
    float doh(float f)
    {
        print("float");
        return 1.0f;
    }
}
class mysore {}
class name extends hide
{
   @Override void doh(mysore m)
    {
        print("doh(mysore");
    }
}
public class now
{
    public static void main(String[] args)
    {
        name n=new name();
        n.doh('l');
        n.doh(3);
        n.doh(new mysore());
    }
}