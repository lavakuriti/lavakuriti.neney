interface band
{
    void play();
}
interface band2 extends band
{
    void sing();
}
class flute implements band2
{
    public void play()
    {
        System.out.print("flute plays");
    }
    public void sing()
    {
        System.out.print("flute sings");
    }
}
public class pub
{
    public static void main(String[] args)
    {
    flute f=new flute();
    f.play();
    f.sing();
}
    }