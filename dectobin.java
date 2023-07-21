import java.util.*;
class dectobin
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System .in);
        int n = obj.nextInt();
        int arr[] = new int[4];
        int rem=0;
        for(int i=0;n!=0;i++)
        {
            rem = n%2; 
            arr[i] = rem;
           // System.out.print(arr[i]);
            n/=2;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
        System.out.print(arr[i]);
    }
    }
}
