package ads_assignmentfinal;

import java.util.ArrayList;

public class ssum {
    public static int sum(String s,int p)
    {
        int psum=0;
        for(int i=0;i<s.length();i++)
        {
            psum=psum+(int)(Math.pow(p,i)*(int)s.charAt(i));
        }
        return psum;
    }
    
    public static int sub_sum(int str_sum,String sl,String sr,int p)
    {
        int d=((str_sum-(int)sl.charAt(0))/p)+((int)sr.charAt(sr.length()-1)*(int)Math.pow(p,sr.length()-1));
        return d;
    }
    
}
