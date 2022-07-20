import static io.print.*;
class useful
{
    void f(){print("usefull");}
    void g(){print("g usefull");}
}
class moreusefull extends useful
{
    void f(){print("more");}
    void g(){print("mor1");}
    void v(){print("more 2");}
    void u(){print("more 4");}
}
public class outy
{
    public static void main(String[] args)
    {
        useful[] x={new useful(),new moreusefull()};
        x[0].f();
        x[0].g();
        x[1].f();
    }
}