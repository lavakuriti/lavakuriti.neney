import static io.print.*;
class Engine
{
    Engine()
    {
        print("powerful engine");
    }
}
class Wheel
{
    void inflat(int psi)
    {
    print("psi is ="+" "+psi);
    }
}
class Window
{
    public void rollup()
    {
        print("rolled up");
    }
    public void rolldown()
    {
        print("rolled down");
    }
}
class Door
{
Window window=new Window();
}
public class car
{
    Engine engine=new Engine();
    Wheel[] wheel=new Wheel[4];
    Door left=new Door();
    Door right=new Door();
    public car()
    {
        for(int i=0;i<4;i++)
        wheel[i]=new Wheel();
    }
    public static void main(String[] args)
    {
        
        car Car=new car();
        Car.left.window.rollup();
        Car.right.window.rolldown();
        Car.wheel[3].inflat(44);
    }
}