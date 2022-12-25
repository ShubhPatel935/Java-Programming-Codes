import java.util.Scanner;
public class Half_Pyramid {
    public static void main(String args[])
	{
		int i,j,n=3;

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i-1;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("* ");
                }
			}

			System.out.println("");
		}
	}
}

