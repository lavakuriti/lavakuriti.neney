import java.util.*;
import java.nio.*;
class Randomw implements Readable
{
    Random rand=new Random(47);
    char[] capitals="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] lowers="abcdefghijklmnopqrstuvwxyz".toCharArray();
    int count;
    public Randomw(int count)
    {
        this.count=count;
    }
    public int read(CharBuffer cb)
    {
    if(count--==0)
    return -1;
    cb.append(capitals[rand.nextInt(capitals.length)]);
    for(int i=0;i<4;i++)
    {
    cb.append(lowers[rand.nextInt(lowers.length)]);
}
cb.append("    ");
return 10;
}
public static void main(String[] args)
{
    Randomw rana=new Randomw(10);
    Scanner sc=new Scanner(rana);
    while(sc.hasNext())
    System.out.println(sc.next());
}
}
