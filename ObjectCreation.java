import java.util.Scanner;
public class ObjectCreation {
    int a=10;//instance variable//object level variable
    static int b=20;//static variable//class level variable
    public static void main(String args[])
    {
        ObjectCreation t1=new ObjectCreation();
        System.out.println("t1 "+t1.a);
        t1.a=t1.a+5;
        System.out.println("t1 "+t1.a);
        ObjectCreation t2=new ObjectCreation();
        System.out.println("t2 "+t2.a);
        ObjectCreation t3=new ObjectCreation();
        ObjectCreation t4=new ObjectCreation();

    }
}