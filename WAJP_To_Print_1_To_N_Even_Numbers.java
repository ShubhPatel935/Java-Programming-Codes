import java.util.Scanner;
public class WAJP_To_Print_1_To_N_Even_Numbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(" "+i);
            }
        }
    }
}
