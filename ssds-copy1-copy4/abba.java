import static io.print.*;
class self
{
    void see()
    {
        print("what see me");
    }
    self()
    {
        see();
    }
}
class dabba extends self
{
    dabba()
    {
        print("see me");
    }
    void see()
    {
        print("i mean look at");
    }
}
public class abba
{
    public static void main(String[] args)
    {
        dabba d=new dabba();
    }
}
