public class out
{
    public static void main(String[] args)
    {
        outer:
        for( ;true; )
        {
            inner:
            for(int i=0;i<10;i++)
            {
                if(i==3)
                {
                    System.out.println("cont");
                    continue;
                }
                if(i==7)
                {
                    System.out.print("break");
                    i++;
                    break;
                    
                }
                if(i==8)
                {
                    i++;
                    continue outer;
                }
                
            }
        }
    }
}