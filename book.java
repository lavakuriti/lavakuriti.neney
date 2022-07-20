import java.util.*;
class book
{
static int data=0;
book inc()
{
    data++;
    return this;
}
void show()
{
    System.out.print(data);
}
public static void main(String[] args)
{
 book novel;
 novel=new book();
 novel.inc().inc().inc().inc().show();
 
}
}