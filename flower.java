public class flower
{
    int petalcount=0;
    String s="initial value";
    flower(int petals)
    {
        petalcount=petals;
        System.out.print(petals);
    }
    flower(String ss)
    {
        ss=s;
        System.out.print(ss);
        
    
    }
    flower(int petals,String s)
    {
        this(petals);
        this.s=s;
    }
    flower()
    {
        this(38,"hi");
    
    }
    void petalprint()
    {
        System.out.print(s + petalcount);
        
    }
public static void main(String[] args)
{
    flower x=new flower();
    x.petalprint();
    
}
}