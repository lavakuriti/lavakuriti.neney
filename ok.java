import java.util.*;
import static io.print.*;
class coma
{
  static String s;
  public coma()
  {
      s="kjhw";
  }
  public String toString()
  {
      return s;
  }
}
public class ok
{
    int v;
        coma c=new coma();
        public String toString()
        {
            return "v=" + v + "v1=" + v +c;
        }
        public static void main(String[] args)
        {
            ok o=new ok();
            print(o);
        }

}