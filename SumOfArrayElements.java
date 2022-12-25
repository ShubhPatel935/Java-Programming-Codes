import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
        int i,j,n,sum=0;
        Scanner sc=new Scanner(System.in);
        int[] a1=new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter the array elements:");
            n=sc.nextInt();
            a1[i]=n;
            sum=sum+a1[i];
        }
        System.out.println("sum is:"+sum);
    }
}    