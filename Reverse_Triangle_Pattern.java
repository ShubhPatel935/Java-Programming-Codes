public class Reverse_Triangle_Pattern {
    public static void main(String args[])
	{
		int i,j,n=5;

		for(i=0;i<n;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
