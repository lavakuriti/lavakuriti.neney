public class cast
{
    static randomgen gen=new randomgen();
    public static void main(String[] args)
    {
        Shape[] sh=new Shape[10];
        for(int i=0;i<5;i++)
        {
            sh[i]=gen.next();
        }
        for(Shape shp:sh)
            shp.draw();
    }
}