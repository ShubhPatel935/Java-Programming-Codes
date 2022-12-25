import java.util.Scanner;
public class Prime {
    public static void main(String args[])
    {
        int i=1,n=5,f=0;
        while(i<=n)
        {
            if(n%i==0)
            {
                f=f+1;
            }
            i++;

        }
        if(f==2)
        {
            System.out.println(n+" is prime number");
        }
        else 
        {
            System.out.println(n+" is not prime number");
        }
    }
}
