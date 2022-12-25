import java.util.Scanner;
public class WhileLoopPartThree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(i<=n)
        {
            if(i%2==1) //i%2!=0
            {
                System.out.println(i);
            }
            i=i+1;
        }
    }
}