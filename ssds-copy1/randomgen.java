import java.util.Random;

class randomgen
{
    Random rand=new Random(40);
    Shape next()
    {
        switch(rand.nextInt(3))
        {
            default:
            case 0:return new circle();
            case 1:return new triangle();
            case 2:return new square();
        }
    }
}