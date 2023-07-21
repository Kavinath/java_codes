import java.util.*;
class min
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int min=0;
        if(num1<num2)
        min = num1;
        else 
        min = num2;
        System.out.print(min);

    }
}