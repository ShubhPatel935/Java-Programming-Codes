class Demo
{
    int a=10;//instance variable//object level variable
    static int b=20;//static variable//class level variable
    public static void main(String args[])
    {
        System.out.println("static "+b);
        int b=200;
        System.out.println("local "+b);
        System.out.println("static "+Demo.b);
        Demo t1=new Demo();
        System.out.println("Instance "+t1.a);
        t1.display();
    }
    void display()
    {
        System.out.println("display static"+Demo.b);
        System.out.println("local display "+a);
        int a=100;
        System.out.println("local display "+a);
        Demo t2=new Demo();
        System.out.println("Instance display    "+t2.a);
    }
}