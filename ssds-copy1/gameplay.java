import static io.print.*;
class game 
{
    game(int i)
    {
        print("game");
    }
    
}
class name extends game
{
    name(int i)
    {
        super(1);
        print("cricket");
    }
}
class score extends name
{
    score(int i)
    {
        super(1);
        print("10 points");
    }
}
class win extends score
{
    win(int i)
    {
        super(1);
        print("yes won");
    }
}
public class gameplay extends win
{
    gameplay()
    {
        super(1);
    }
    public static void main(String[] args)
    {
        gameplay result=new gameplay();
        
    }
}