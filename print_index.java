package ads_assignmentfinal;

import java.util.ArrayList;

public class print_index {
    public static void print(ArrayList<Integer> al)
    {
        if(al.size()==0)
        {
            System.out.println("Pattern not found!!!");
        }
        else
        {
            System.out.println("Pattern is found at Location: ");
            for(int i=0;i<al.size();i++)
            {
                System.out.print(al.get(i)+" ");
            }
            System.out.println("");
        }
        
    }
}
