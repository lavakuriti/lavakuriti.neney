class rock extends musical
{
    void play(equiliser e)
    {
    System.out.println("rock has " +" " + e);
    }
    void adjust(equiliser e)
    {
        System.out.println("adjust " +" " +e);
    }
    String what(equiliser e)
    {
        return "ok adjusted" + " " + e;
    }
}