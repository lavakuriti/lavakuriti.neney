class priva
{
    private priva(){}
static priva make()
{
    return new priva();
}
}
class brave
{
    public static void main(String[] args)
    {
    priva p= priva.make();
}
}