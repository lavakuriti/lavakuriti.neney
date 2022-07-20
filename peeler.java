class banana
{
    void show(int x)
    {
        if(x==1)
        System.out.println("yummy");
        else
        System.out.println("bad");
    }
}
public class peeler
{
    public static void main(String[] args)
    {
    banana b1,b2;
    b1=new banana();
    b2=b1;
    b1.show(1);
    b2.show(2);
}
}