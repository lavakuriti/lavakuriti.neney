package io;
public class Range
{
    public static int[] range(int n)
    {
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=i;
        }
        return result;
    }
    public static int[] range(int start,int end)
    {
        int sz=end-start;
        int result[]=new int[sz];
        for(int i=0;i<sz;i++)
        {
            result[i]=i+1;
        }
        return result;
    }
}