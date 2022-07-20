class cinema
{
    static public void f(canfight ft)
    {
        ft.fight();
    }
    static public void fl(canfly fy)
    {
        fy.fly();
    }
    static public void sw(canswim sm)
    {
        sm.swim();
    }
    public static void main(String[] args)
    {
        action act=new action();
        f(act);
        fl(act);
        sw(act);
    }
}