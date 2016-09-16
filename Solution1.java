import java.lang.*;
public class Solution1
{
    public boolean checkdata(int a,int b)
    {
        rem1=a%10;
        rem2=b%10;
        if(rem1==rem2)
          return true;
        else
          return false;
    }
}
