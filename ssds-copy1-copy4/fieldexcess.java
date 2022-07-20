class Super
{
   public int field=0;
    public int getField()
    {
        return field;
    }
}
class sub extends Super
{
    public int field=1;
    public int getField()
    {
        return field;
    }
    public int subfield()
    {
        return super.field;
    }
}
public class fieldexcess
{
    public static void main(String[] args)
    {
        Super sup=new sub();
        System.out.println(sup.field +" " + sup.getField());
        sub suk=new sub();
        System.out.print(suk.field + " " +suk.getField()+ " " +suk.subfield());
    }
}