import java.util.Scanner;
public class SumOfValueFromUser {
    public static void main(String args[])
    {
        int i=1,n=153,sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("sum is : " +sum);
    }
}