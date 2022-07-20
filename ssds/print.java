public class print
{
    boolean b;
    int i;
    double d;
    float f;
    long l;
    short t;
    String s;
    char c;
   print p;
   void show()
    {
        System.out.println(b);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(t);
        System.out.println(s);
        System.out.println(p);
    
    }     
    public static void main(String[] ags)
    {
        print p=new print();
        p.show();
    }
}