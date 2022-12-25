import java.util.Scanner;
public class Pattern_using_4_For_Loop {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int i,n=10,j;
        for(i=1;i<=n;i++) // for rows
        { 
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            } 
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}    