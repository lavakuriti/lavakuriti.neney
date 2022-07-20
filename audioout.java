public class audioout
{
    static void all(musical m)
    {
        m.play(equiliser.BASS);
    }
    public static void allout(musical[] k)
    {
            for(musical j:k)
            all(j);
    }
    public static void main(String[] args)
    {
        musical[] e={new classic(),new rock(),new normal()};       
    allout(e);
}
    
}