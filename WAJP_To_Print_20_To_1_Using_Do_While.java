import java.util.Scanner;
public class WAJP_To_Print_20_To_1_Using_Do_While {
    public static void main(String args[])
    {
        int i=20,n=1;
        do
        {
            if(i%2==1)
            {
                System.out.print(" "+i);
            }
            i--;
        }
        while(i>=n);
    }
}
