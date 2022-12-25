import java.util.Scanner;
public class Array3 {
    public static void main(String[] args)
    {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        int[] a1=new int[5];
        int[] a2=new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter the array elements:");
            n=sc.nextInt();
            a1[i]=n;
        }
        for(i=0;i<5;i++)
        {
            System.out.println("enter the array elements:");
            n=sc.nextInt();
            a2[i]=n;
        }
        for(j=0;j<5;j++)
        {
            System.out.print(a1[j]+" ");
        }
        {
            System.out.println("");
        }
        for(j=0;j<5;j++)
        {
            System.out.print(a2[j]+" ");
        }
    }
}            