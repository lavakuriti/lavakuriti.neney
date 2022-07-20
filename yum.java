class banana
{
    public String toString()
    {
        return "banana";
    }
}
class juice extends banana
{
    public String toString()
    {
        return "juice";
    }
}
class mixer
{
 banana process()
 {
     return new banana();
 }
}
 class juicer extends mixer
 {
     juice process()
     {
         return new juice();
     }
 }
public class yum
{
public static void main(String[] args)
{
    mixer m=new mixer();
    banana b=m.process();
    System.out.println(b);
    m=new juicer();
    b=m.process();
    System.out.print(b);
    
}
}