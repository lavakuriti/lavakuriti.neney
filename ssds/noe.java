import static io.print.*;
class retur
{
    String s;
    public retur()
    {
      System.out.println("ok let ssee");  
      s="kbkjbsw";
    }   
    public String toString()
    {
        return s;
    }

}
public class noe
{
    String ss; 
    retur r=new retur();
    public String toString()
    {
        return ss + r;
    }
    public static void main(String[] args)
    {
        noe n=new noe();
        print(n);
    }
}
 