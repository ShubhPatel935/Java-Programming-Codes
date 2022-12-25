import java.util.Scanner;
public class WhileLoopPartTwo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=2,n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i=i+2;
        }
    }
}