class person 
{
    public void eat(Apple apple)
    {
        Apple peeled=peeler.peel();
        System.out.print("yummy");
        
    }
}
class peeler
{
   static Apple peel()
    {
        
        return apple;
    }
}
} 
public class passingthis
{
    public static void main(String[] agrgs)
    {
        new person().eat(new Apple());
    }
}