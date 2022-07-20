public class vocals extends sounds
{
   static void vocal(dog i)
    {
        i.play(Notes.BOW_BOW_D);
    }
    static void vocal(cat i)
    {
        i.play(Notes.MEUO_C);
    }
    static void vocal(buffalo i)
    {
        i.play(Notes.AMBA_B);
    }
    public static void main(String[] args)
    {
        dog d=new dog();
        buffalo b=new buffalo();
        cat c=new cat();
        vocal(d);
        vocal(c);
        vocal(b);
        
    }
}