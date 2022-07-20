import java.util.*;
import static io.print.*;
public class rang
{
    public static void main(String[] args)
    {
        int i;
        Random rand=new Random(40);
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=i;
            
        }
        for(int x:a)
            print(x);
    }
}