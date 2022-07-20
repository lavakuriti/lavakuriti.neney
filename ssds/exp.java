class coff
{
    coff(int make)
    {
        System.out.print(make);
        
    }
    void f(int make)
    {
        System.out.print(make);
        
    }
}
class cup
{
    static coff c1;
    static coff c2;
    static 
    {
        c1=new coff(1);
        c2=new coff(2);
    }
    cup()
    {
        System.out.print("cups");
        
    }
}
public class exp
{
    public static void main(String[] args)
    {
        cup.c1.f(99);
    }
}