package ads_assignmentfinal;

import java.util.ArrayList;
import java.util.Scanner;

public class ADS_ASSIGNMENTFINAL {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Input String: ");
        String str=in.nextLine();
        System.out.println("Enter Pattern to Search: ");
        String pat=in.nextLine();
        prime pp=new prime();
        ssum ss=new ssum();
        search s=new search();
        print_index pi=new print_index();
        int p=pp.generate_prime();
        int pat_sum=ss.sum(pat,p);
        int str_sum=ss.sum(str.substring(0,pat.length()),p);
        System.out.println("HashValue of Pattern ("+pat+"): "+pat_sum+"\n");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al=s.search_pattern(str,pat,pat_sum,str_sum,p);
        pi.print(al);
        System.out.println("Toatl no. of Comparisons: "+s.comp);
        System.out.println("----------------------END----------------------");
    }   
}
