class drum implements band
{
   public void play(sounds s)
    {
        System.out.println(this +" " +s);
    }
    public String toString()
    {
        return "drum";
    }
}