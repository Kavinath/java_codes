import java.util.Scanner;
class mark
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if(num>=35)
        System.out.print("pass");
        else
        System.out.print("fail");
    }
}