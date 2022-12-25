import java.util.Scanner;
public class SubOfAdj {
    public static void main(String[] args)
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter the array elements:");
            n=sc.nextInt();
            a[i]=n;
        }
        for(i=0;i<4;i++)
        {
            System.out.print(a[i]-a[i+1]+" ");
        }
    }
}            