class soundout
{
    public static void main(String[] args)
    {
        flute f=new flute();
        drum1 d=new drum1();
        veena v=new veena();
        f.play(musics.SWEET);
        d.play(musics.HARD);
        v.play(musics.MEDIUM);
        f.adjust(musics.SWEET);
        d.adjust(musics.HARD);
    }
}