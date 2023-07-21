import java.util.*;
class doublestring
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner (System.in);
        int n = obj.nextInt();
         String bin = Integer.toBinaryString(n);
         bin = bin + "0";
         int res = Integer.parseInt(bin,2);
         System.out.println(res);
        

    }
}