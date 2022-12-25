import java.util.Scanner;
class SelectBranchCSEDepartment {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int year,branch;
        System.out.print("Enter a year:");
        year=sc.nextInt();
        System.out.print("Enter your branch\n1:CSE\n2:IT\n3:ECE\n4:EEE\nEnter:");
        branch=sc.nextInt();
        switch(year)
        {
            case 1:
                  System.out.println("---CSE---\n1:C lan\n2:BEE\n3:M1\n4:PPS");
                  break;
            case 2:
                System.out.println("---IT---\n1:C lan\n2:BE\n3:M1\n4:PPS");
                break;
            case 3:
                System.out.println("---ECE---\n1:BE\n2:BEE\n3:M1\n4:PPS");     
                break;
            case 4:
                System.out.println("---EEE---\n1:physics\n2:BEE\n3:M1\n4:PPS");
                break;
            default:
                  System.out.println("Invalid Input");
                  break;
        }
    }
}