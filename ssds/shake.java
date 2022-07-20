import java.util.*;
public class shake
{
    public static void main(String[] args)
    {
        Random ra=new Random();
        int i=ra.nextInt(100);
        int j=ra.nextInt(100);
        System.out.print(i);
        System.out.print(j);
        System.out.print(i<j);
        
    }
}