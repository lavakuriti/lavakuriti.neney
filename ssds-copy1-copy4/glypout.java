import static io.print.*;
class timp
{
    void draw()
    {
        print("draw()");
    }
    timp()
    {
        print("trimp() before draw()");
    draw();
    print("trimp() after draw()");
    }
}
    class roundtrimp extends timp
    {
        private int radius;
       roundtrimp(int r)
       {
           radius=r;
           print("rountrimp "+ " " + radius);
       }
       void draw()
       {
           print("roundtrimp" + " "+ radius);
        }
    }
    public class glypout
    {
        public static void main(String[] args)
        {
            roundtrimp r=new roundtrimp(5);
        }
        
    }