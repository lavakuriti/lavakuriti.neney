import java.util.*;
class noread
{
  public static void main(String[] args)
  {
    Random rand=new Random(9);
    int[] a=new int[10];
    for(int i=0;i<9;i++)
    {
        a[i]=rand.nextInt(10);
        System.out.println(a[i]);
    }
  }
}