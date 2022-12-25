import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        int[] a1=new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter the array elements:");
            n=sc.nextInt();
            a1[i]=n;
        }
        for(j=0;j<5;j++)
        {
            System.out.print(a1[j]+" ");
        }
    }
}    