class still
{
    void draw()
    {
        System.out.print("draw");
    }
    still()
    {
        draw();
    }
}
class but extends still
{
    void draw()
    {
        System.out.print("make this");
    }
}
public class getout
{
    public static void main(String[] args)
    {
        but bot=new but();
    }
}