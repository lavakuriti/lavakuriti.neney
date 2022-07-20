class glymp
{
    void draw()
    {
        System.out.println("draw bfore IT LEFT after draw");
    }
    glymp()
    {
        System.out.println("draw() before draw");
        draw();
        System.out.println("draw() after draw");
    }
}
class roundglymp extends glymp
{
    int radius;
    roundglymp(int r)
    {
    radius=r;
    System.out.println("Roundglyp" + " " + radius);
    }
    void draw()
    {
        System.out.println("DOUBT" +" " + radius);
    }
}
public class fina
{
    public static void main(String[] args)
    {
    roundglymp rgl=new roundglymp(40);
}
}