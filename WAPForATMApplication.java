import java.util.Scanner;
class HDFC 
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        int pin,n,amt,bankbalance=10000;
        System.out.println("Please enter your pin:");
        pin=sc.nextInt();
        if(pin==4455)
        {
            System.out.print("Welcome to --HDFC BANK--\n1:Withdraw \n2:Transfer \n3:Check Balance \n4:Change Pin \nENTER");
            n=sc.nextInt();
            if(n==1)
            {
                System.out.println("please enter amount:");
                amt=sc.nextInt();
                if(amt<=bankbalance)
                {
                    System.out.println("Collect your cash-->"+amt);
                    bankbalance=bankbalance-amt;
                    System.out.println("Available balance is:"+bankbalance);
                }
                else
                {
                    System.out.println("Insufficient Amount");
                }
            } 

        }

    }
}