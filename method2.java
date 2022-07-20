import static io.print.*;
class method1
{
    private String s="teamaking";
    public void process(String ingre)
    {
        s=s+ingre;
    }
    public void milk()
    {
        process("milk()");
    }
    public void pour()
    {
        process("pour()");
    }
    public void boil()
    {
        process("boil()");
    }
    public void addtea()
    {
        process("addtea()");
    }
    public String toString()
    {
        return s;
    }
    public static void main(String[] args)
    {
        method1 make=new method1();
        make.milk();
        make.pour();
        make.boil();
        make.addtea();
        print(make);
}
}
public class method2 extends method1
{
    public static void main(String[] args)
    {
    method2 tasty=new method2();
    tasty.process("fatmilk()");
    tasty.process("sugar()");
    tasty.process("boil()");
    tasty.process("addtea()");
    print(tasty);
    method1.main(args);
}
}