    public class A {
        void m1()//non-static method
        {
            System.out.println("This is m1 method");
        }
        static void m2()//static method
        {
            System.out.println("This is m2 method");
        }
        public static void main(String args[])
        {
            A obj1=new A();
            obj1.m1();
            A.m2();
        }
    }
