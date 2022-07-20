public class let
{
    int i=0;
    String ss="let me f";
    let(int p,String s)
    {
        i=p;
        ss=s;
    }
    let()
    {
        this(5,"ji");
        
    }
    void show()
    {
        System.out.print(i + " " + ss);
    }
    public static void main(String[] args)
    {
        let l=new let();
        l.show();
    }
}