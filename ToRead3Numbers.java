import java.util.Scanner;
class ToRead3Numbers {
    public static void main(String args[])
    {
        //classname object=new classname(system.in);
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("please enter 4 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>b && a>c && a>d)
        {
            System.out.println("a is big");
        }
        else if(b>c && b>d)
        {
            System.out.println("b is big");
        }
        else if(c>d)
        {
            System.out.println("c is big");
        }
        else 
        {
            System.out.println("d is big");
        }
    }
}