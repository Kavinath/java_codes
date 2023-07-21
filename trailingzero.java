import java.util.*;

public class trailingzero 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        trailingzero sc = new trailingzero();
        int k = sc.factorial(n);
        System.out.println(k);
        System.out.println(sc.num_crunch(k));
        }


    public  int factorial(int n)
    {
        if (n==1) {
            return 1;
        } else {
            return n* factorial(n-1);
        }
    }


    public int num_crunch(int k)
    {
        int rem =0,count =0;
        while(k!=0)
        {
            rem = k%10;
            k/=10;
            if(rem == 0)
            count+=1;
            else
            break;
        }
        return count;

    } 

}
