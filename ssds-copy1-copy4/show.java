import static io.print.*;
class actor
{
    void act(){}
}
class happyactor extends actor
{
    void act()
    {
        print("happy actor");
    }
}
class sadactor extends happyactor
{
    void act()
    {
        print("sadactor");
    }
}
class stagep
{
        actor a=new happyactor();
        void change()
        {
         a=new sadactor();   
        }
        void perform()
        {
            a.act();
        }
}
public class show
{
    public static void main(String[] args)
{
    stagep st=new stagep();
    st.perform();
    st.change();
    st.perform();
}
}