import java.util.*;
 class thirtyone
 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int rem=0 ,rev=0;
    while(n!=0)
        {
            rem = n%10;
            rev=rev*10+rem;
            n/=10;


        }
    while(rev!=0)
        {
            rem = rev%10;
            if(rem%2==0)
            System.out.println(rem + "-Even");
            else
            System.out.println(rem + "-Odd");
            rev=rev/10;
        }
    }
 }