import static io.print.*;
class coffeee
{
    public void process(String s)
    {
        print(s);
    }
    public void boil()
    {
        process("boil");
    }
    public void water()
    {
        process("water");
    }
    public void pour()
    {
        process("pour");
    }
    public void milk()
    {
        process("milk");
    }
    public void add()
    {
        process("add tea");
    }
    public static void main(String[] args)
    {
        coffeee cof=new coffeee();
        cof.boil();
        cof.water();
        cof.pour();
        cof.milk();
        cof.add();
    }
}
public class sweetcof extends coffeee
{
    public void addsugar()
    {
        process("addsugar");
    }
    public void ilachi()
    {
        process("ilachi flavour");
    }
    public static void main(String[] args)
    {
        sweetcof tastecof=new sweetcof();
        tastecof.boil();
        tastecof.water();
        tastecof.pour();
        tastecof.milk();
        tastecof.add();
        tastecof.addsugar();
        tastecof.ilachi();
    }
}