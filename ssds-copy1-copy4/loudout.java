public class loudout
{
   static void playout(sannayi a)
    {
        a.play(sounds.PEE);
    }
    static void playout(drum b)
    {
        b.play(sounds.DUM);
    }
   static void playout(gili c)
    {
        c.play(sounds.JILL);
    }
    public static void main(String[] args)
    {
        sannayi s=new sannayi();
        drum d=new drum();
        gili g=new gili();
        playout(s);
        playout(d);
        playout(g);
    }
}