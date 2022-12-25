import java.util.Scanner;
public class Do_While {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter a Number");
        n=sc.nextInt(); //n=5
        do
        {
            System.out.println("Hii Parul");
            i++; //i=i+1
        }
        while(i>=n);
    }
}
