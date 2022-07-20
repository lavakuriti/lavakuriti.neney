class equal
{
    int x;
}
public class method2
{
public static void main(String[] args)
{
    equal v1=new equal();
    equal v2=new equal();
    v1.x=v2.x=100;
    System.out.print(v1.equals(v2));
}
}