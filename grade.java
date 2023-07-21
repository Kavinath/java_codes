import java.util.Scanner;
class grade
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if(num>=91)
        System.out.print("A");
        else if(num>=76 && num<=90)
        System.out.print("B");
        else if(num>=61 && num<=75)
        System.out.print("C");
        else if(num<=60)
        System.out.print("D");
        else
        System.out.print("need work");
    }
}