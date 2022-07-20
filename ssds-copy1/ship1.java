import static io.print.*;
class controls
{
    void left(int v){print("move left"+" " + v +"km/hr");}
    void right(int v){print("move right" +" " + v + "km/hr");}
    void up(int v){print("move up"+ " " +v+"km/hr"); }
    void down(int v){print("move down"+ " " +v+"km/hr");}
    void far(int v){print("move far"+ " " +v+"km/hr");}    
}
public class ship1 
{
    private String shipname;
    ship1(String name)
    {
        this.shipname=name;
    }
    void show()
    {
        print(shipname);
    }
    controls c=new controls();
    public void left(int velo)
    {
        c.left(velo);
        
    }
    public void right(int velo)
    {
        c.right(velo);
    }
    public void up(int velo)
    {
        c.up(velo);
    }
    public void down(int velo)
    {
        c.down(velo);
    }
    public static void main(String[] args)
    {
        ship1 s=new ship1("NSA");
        s.show();
        s.left(100);
        s.right(50);
        s.up(40);
        s.down(70);;;;;
    }
    
}