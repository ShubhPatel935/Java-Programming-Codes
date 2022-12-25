//WAP to print odd number between n to 1 using do while loop
import java.util.Scanner;
class WAJP_To_Print_N_To_1_Even_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.print("Enter n=");
        n=sc.nextInt();
        
        do
        {   
            if(n%2==0)
            {
                System.out.print(" "+n);    
            }
            n--;
        }
        while(n>=0);
    }
}