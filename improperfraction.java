import java.util.*;
public class improperfraction
{
    public static void main(String[] args)
    {
       Scanner obj = new Scanner(System.in);
       int quotient = obj.nextInt();
       int numerator = obj.nextInt();
       int denominator = obj.nextInt();
       
       int improp_numerator = (quotient*denominator) + numerator;
       int improp_denominator = denominator;

       System.out.println(improp_numerator);
       System.out.println(improp_denominator);
    }
}