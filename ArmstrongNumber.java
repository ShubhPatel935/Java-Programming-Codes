//WAP to check whether a number is Armstrong Number or not
import java.util.Scanner;
class ArmstrongNumber {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     
     int i=1,n,n1,x,sum=0;
     System.out.print("Enter a number=");
     n=sc.nextInt();
     n1=n;
     while(n!=0)
     {
       x=n%10;
       sum=sum+(x*x*x);
       n=n/10;
     }

     if(sum==n1)
     {
        System.out.print(sum+" is a Armstrong Number");
     }
     else
     {
        System.out.print(sum+" is not a Armstrong number");
     }
   }     
}