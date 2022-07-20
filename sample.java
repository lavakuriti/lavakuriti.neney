import static io.print.*;
class sample
{
    String s;
    int value;
    sample()
    {
        print("ok let see");
        print();
        s="constructor";
        
    }
    public String toString()
    {
        return "value=" + value + "\n" + s;
    }
    public static void main(String[] args)
    {
        sample samp=new sample();
        print(samp);
    }
}
    
