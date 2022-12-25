//1-10km->3rs per km
//11 to 20km->5rs per km
//21-50km->7rs per km
//51-100km->10rs per km
import java.util.Scanner;
class Cab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int km;
        System.out.printlln("Enter KM:");//km=9
        km=sc.nextInt();
        if(km>0 && km<=10)
        {
            total=km*3;
            System.out.println("Amount is :"+total);
        }
        else if(km>10 && km<=20)
        {
            total=30+(km-10)*5;                        //km=102
            System.out.println("Amount is :"+total);
        }
        else if(km>20 && km<=50);
        {
            total=30+50+(km-10-10)*7;
            System.out.println("Amount is :"+total);
        }
        else if(km>50 && km<=100)
        {
            total=30+50+210+(km-10-10-30)*10
            System.out.println("Amount is :"+total);
        }
        else
        {
            total=30+50+210+500+(km-100)*6;
            System.out.println("Amount is :"+total);
        }
    }
}