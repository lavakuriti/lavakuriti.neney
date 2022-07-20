import static io.print.*;
class music extends brass
{
    static void tune(wind i)
    {
        i.play(Note.MIDDLE_C);
    }
    static void tune(brass i)
    {
        i.play(Note.FLAT_C);
    }
    static void tune(stranged i)
    {
        i.play(Note.B_FLAT);
    }
    public static void main(String[] args)
    {
        wind w=new wind();
        brass br=new brass();
        stranged st=new stranged();
        tune(w);
        tune(br);
        tune(st);
    }
}