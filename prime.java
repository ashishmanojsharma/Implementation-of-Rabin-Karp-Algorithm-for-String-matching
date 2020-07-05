package ads_assignmentfinal;

import java.util.Scanner;

public class prime {
    public static int generate_prime()
    {
        Scanner in=new Scanner(System.in);
        boolean b;
        int p;
        System.out.println("Enter prime no.: ");
        p=in.nextInt();
        do
        {
            b=checkprime(p);
            if(b==true)
            {
                System.out.println("-------------------------------------------");
                System.out.println("OUTPUT: ");
                System.out.println("----------");
                System.out.println(p+" is a valid prime no.");
            }
            else
            {
                System.out.println("Enter a valid prime no.: ");
                p=in.nextInt();
            }
        }while(b!=true);
        return p;
    }
    
    public static boolean checkprime(int p)
    {
        if(p==0 || p==1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=p/2;i++)
            {
                if(p%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    
}
