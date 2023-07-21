import java.util.*;
class prime 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
            if(i==j || i==0 || j==0)
            continue;
            else if (i%j==1 || i%1==j)
            System.out.print(i);
            else
            continue;
           } 
        }
}
}
