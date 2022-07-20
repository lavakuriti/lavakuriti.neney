import static io.print.*;
public class deliga
{
    String name;
   controls decontrols=new controls();
   public deliga(String name)
    {
        this.name=name;
        
    }
    public void right(int v)
    {
        decontrols.right(v);
    }
    public void left(int v)
    {
        decontrols.left(v);
    }
    public void back(int v)
    {
        decontrols.back(v);
    }
    public void fore(int v)
    {
        decontrols.fore(v);
    }
    public static void main(String[] args)
    {
    deliga pro=new deliga("nsa");
    pro.fore(100);
    
    
}

}