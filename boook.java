class boook
{
    boolean checked=false;
    boook(boolean check)
    {
        checked=check;
        
    }
    void shoe()
    {
        checked=false;
        
    }
    protected void finalize() throws Throwable
    {
        if(checked)
        System.out.print("error");
    super.finalize();
}
}