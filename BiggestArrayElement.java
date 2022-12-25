import java.util.Scanner;
public class BiggestArrayElement {
    public static void main(String args[])
    {
        int i,j,n,big=0;
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
            if(j==0)
            {
                big=a1[j];
            }
            if(big<a1[j])
            {
                big=a1[j];
            }
        }
        System.out.println("biggest elements in array is:"+big);
    }
}        
