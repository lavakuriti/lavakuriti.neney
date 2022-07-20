public class rock
{
    static int x=0;
    rock leaf()
    {
        x++;
        return this;
    }
    void show()
    {
        System.out.print(x);
    }
    public static void main(String[] args)
    {
    rock s=new rock();
    s.leaf().leaf().show();
    }
}