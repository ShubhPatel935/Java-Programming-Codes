import java.util.Scanner;
public class WhileLoop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n;
        System.out.println("enter a number");
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(n);
            n=n-1;
        }
    }
} 