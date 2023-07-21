import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int max=0;
        if(num1>num2)
        max = num1;
        else 
        max = num2;
        System.out.print(max);

    }
}