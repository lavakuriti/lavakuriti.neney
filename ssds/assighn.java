class  tank
{
    int data;

}
public class assighn
{
    public static void main(String[] args)
    {
        tank t1=new tank();
        tank t2=new tank();
        t1.data=8;
        t2.data=7;
            t1.data=t2.data;
        System.out.print(t1.data+t2.data);
    
}
}