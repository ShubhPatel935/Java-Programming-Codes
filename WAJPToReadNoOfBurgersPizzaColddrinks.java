import java.util.Scanner;
class Food
{
    public static void main(String args[])
    {
        int nb,np,nc,price_b,price_p,price_c,total=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter no of burgers");
        nb=sc.nextInt(); //nb=2
        System.out.println("please enter no of pizzas");
        np=sc.nextInt();
        System.out.println("please enter no of cold drinks");
        nc=sc.nextInt();
        price_b=nb*100;
        price_p=np*80;
        price_c=nc*50;
        total=price_b+price_p+price_c;
        System.out.println("--Dominos--");
        System.out.println("Burger bill is:"+price_b);
        System.out.println("Pizza bill is:"+price_p);
        System.out.println("Cold drinks bill is:"+price_c);
        System.out.println("Final bill is:"+total);
        System.out.println("---Thank You Visit Again---");
        


    }
}
