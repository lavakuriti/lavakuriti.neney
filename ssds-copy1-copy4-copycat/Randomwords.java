import java.util.*;
import java.nio.*;
public class Randomwords implements Readable
{
    private static Random rand=new Random(47);
    private static  char[] capitals="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static  char[] lowers="abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int count;
    public Randomwords(int count)
    {
        this.count=count;
    }
    public int read(CharBuffer cb)
    {
        if(count--==0)
        return -1;
        for(int i=0;i<4;i++)
        {
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(new Randomwords(10));
        while(s.hasNext())
        System.out.println(s.next());
    }
}