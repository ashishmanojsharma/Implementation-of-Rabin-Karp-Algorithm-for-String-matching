package ads_assignmentfinal;

//import static ads_assignmentfinal.ADS_ASSIGNMENTFINAL.comp;
import java.util.ArrayList;

public class search {
    static int comp=0;
    public static ArrayList<Integer> search_pattern(String str,String pat,int pat_sum,int str_sum,int p)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int temp=0;
        comp++;
        ssum ss=new ssum();
        System.out.println("COMPARISON TABLE: ");
        System.out.println("----------------------------------------------------");
        System.out.println("SUBSTRING |\t"+"HASH VALUE |\t"+"COMPARISON");
        System.out.println("----------------------------------------------------");
        if(pat_sum==str_sum && str.substring(0,pat.length()).equalsIgnoreCase(pat))
        {
            al.add(1);
            comp=comp+pat.length();
            System.out.println(str.substring(0,pat.length())+"  |\t\t"+str_sum+"  |\t\t"+"MATCH FOUND"+" ("+comp+")");
            System.out.println("----------------------------------------------------");
        }
        else
        {
            System.out.println(str.substring(0,pat.length())+"  |\t\t"+str_sum+"  |\t\t"+"MATCH NOT FOUND");
            System.out.println("----------------------------------------------------");
        }
        
        for(int i=1;i<=str.length()-pat.length();i++)
        {
            comp++;   
            int ssum=ss.sub_sum(str_sum,str.substring(i-1, i-1+pat.length()),str.substring(i, i+pat.length()),p);
            str_sum=ssum;
            if(pat_sum==ssum && str.substring(i, i+pat.length()).equalsIgnoreCase(pat))
            {
                al.add(i+1);
                comp=comp+pat.length();
                System.out.println(str.substring(i, i+pat.length())+"  |\t\t"+str_sum+"  |\t\t"+"MATCH FOUND"+" ("+comp+")");
                System.out.println("----------------------------------------------------");
            }
            else
            {
                System.out.println(str.substring(i, i+pat.length())+"  |\t\t"+str_sum+"  |\t\t"+"MATCH NOT FOUND");
                System.out.println("----------------------------------------------------");
            } 
        }
        return al;
    }
    
}
