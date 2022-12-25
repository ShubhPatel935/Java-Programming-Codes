import java.util.Scanner;
public class Star_Pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n=3;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
}   }
