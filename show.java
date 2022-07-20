import static io.print.*;
class art
{
    art(int i)
    {
        print("art ");
        print();
    }
}
    class draw extends art
    {
        draw(int j)
        {
            super(j);
        print("draw");
        print();
    }
}
public class show extends draw
{
    show()
    {
    super(2);
}
    public static void main(String[] args)
    {
    show s=new show();
}
    
}